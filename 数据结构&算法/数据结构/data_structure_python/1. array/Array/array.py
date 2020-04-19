
class array():

    def __init__(self, arr = None, capacity = 10):
        if isinstance(arr, list):
            self._data = arr[:]
            self._size = len(arr)

        self._data = [None] * capacity
        self._size = 0

    def get_size(self):
        return self._size

    def get_capacity(self):
        return len(self._data)

    def is_empty(self):
        return self._size == 0

    def add_last(self, value):
        self.add_index(self._size, value)

    def add_first(self, value):
        self.add_index(0, value)

    def find_value_index(self, value):
        for i in range(0, len(self._data)):
            if(self._data[i] == value):
                return i
        return -1

    def replace(self, index, value):
        if index < 0 or index >= len(self._data) - 1:
            raise ValueError(
                "replace is failed index is not illegal. "
            )
        self._data[index] = value
        self._size += 1

    def get_index_value(self, index):
        if index < 0 or index >= len(self._data) - 1:
            raise ValueError(
                "get_index_value is failed index is not illegal. "
            )
        return self._data[index]

    # 删除指定索引所在元素
    def delete_index(self, index):
        if index < 0 or index >= len(self._data) - 1:
            raise ValueError(
                "delete is failed index is not illegal. "
            )
        for i in range(index, len(self._data) - 1):
            self._data[i] = self._data[i + 1]

    # 删除指定元素
    def delete_value(self, value):
        for i in range(0, len(self._data) - 1):
            if self._data[i] == value:
                for i in range(i, len(self._data) - 1):
                    self._data[i] = self._data[i + 1]
        return "delete_value is failed. value is not exist."

    # 在指定位置添加元素
    def add_index(self, index, value):
        if index < 0 or index > len(self._data) - 1:
            raise ValueError(
                "add_index is failed index is not illegal. "
            )
        if(self._size == len(self._data)):
            self._data = self.double_capacity(2 * len(self._data))

        for i in range(self._size, index, -1):
            self._data[i + 1] = self._data[i]
        self._data[index] = value
        self._size += 1

    # 扩容
    def double_capacity(self, new_capacity):
        new_data = [None] * new_capacity
        for i in range(0, len(self._data) - 1):
            new_data[i] = self._data[i]
        return new_data