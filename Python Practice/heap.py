def insertion_sort(arr):
    # Traverse from 1 to len(arr)
    for i in range(1, len(arr)):
        key = arr[i]        # current element
        j = i - 1
        # Move elements greater than key one step ahead
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

# Example
arr = [5, 3, 4, 1, 2]
print("Original Array:", arr)
insertion_sort(arr)
print("Sorted Array:", arr)
