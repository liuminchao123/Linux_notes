
def extend_list(val, l = []):
    #print(val)
    l.append(val)
    return l

list1 = extend_list(10)

list2 = extend_list(123, [])
list3 = extend_list('a')
print(list1)
print(list2)
print(list3)

