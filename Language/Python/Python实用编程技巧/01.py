
data = [1, 5, -3, -2, 6, 0, 9]
res = []
for x in data:
    if x >= 0:
        res.append(x)

print(res)

#利用函数解析
from random import randint
data = [randint(-10, 10) for _ in range(10)]

#filter
data1 = filter(lambda x : x >= 0, data)
print(data1)

#列表解析，比前者较快
data2 = [x for x in data if x >= 0]
print(data2)

#筛选出字典的元素
dict1 = {x : randint(60, 100) for x in range(0, 21)}
print(dict1)

#字典解析
#筛选出值大于90的数对
dict2 = {k: v for k, v in dict1.items() if v > 90}
print(dict2)

#集合解析, 筛选出可以被3整除的数
set1 = set(data)
set2 = {x for x in set1 if x % 3 == 0}
print(set2)

#为元组的元素命名，提高程序可读性
NAME, AGE, SEX, EMAIL = range(4)

student1 = ('jim', 16, 'male', 'jim8721@gmail.com')
print(student1[NAME], student1[AGE], student1[SEX], student1[EMAIL])

#通过内置模块为tuple中的元素命名
from collections import namedtuple

Student = namedtuple('Student', ['name', 'age', 'sex', 'email'])
s1 = Student('jim', 16, 'male', 'liuminchao@outlook.com')
print(s1)
#打印输出为   Student(name='jim', age=16, sex='male', email='liuminchao@outlook.com')

s2 = Student(name = 'lily', age = 20, sex = 'male', email = 'liuminchao@outlook.com')
print(s2.name, s2.age, s2.sex, isinstance(s2, tuple))



