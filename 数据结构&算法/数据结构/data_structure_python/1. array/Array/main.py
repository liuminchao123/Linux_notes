from Array.array import array

if __name__ == "__main__":
    array1 = array()
    for i in range(0, 10):
        array1.add_last(i)
    print(array1._data)

    array1.add_index(1, 100)
    print(array1._data)

    array1.delete_index(2)
    print(array1._data)

