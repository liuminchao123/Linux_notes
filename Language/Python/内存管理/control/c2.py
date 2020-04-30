class Cat(object):

    def __init__(self):
        print('对象产生了：{0}', format(id(self)))

    def __del__(self):
        print('对象删除了：{0}', format(id(self)))

def f0():
    # 自动回收内存
    while True:
        c1 = Cat()

def f1():
    # 一直被引用，不会被回收
    l = []
    while True:
        c1 = Cat()
        l.append(c1)
        print(len(l))

if __name__ == '__main__':
    f1()