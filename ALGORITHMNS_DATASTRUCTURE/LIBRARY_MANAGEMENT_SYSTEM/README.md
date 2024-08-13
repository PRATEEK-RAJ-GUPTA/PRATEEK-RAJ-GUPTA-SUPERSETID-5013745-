QUESTION 1-> Explain linear search and binary search algorithms.?
ANSWER->
Linear Search:
•	Description: Linear search sequentially checks each element of the list until the target value is found or the end of the list is reached.
•	Time Complexity: O(n), where n is the number of elements in the list.
•	Best Case: O(1) (if the target element is at the beginning).
•	Average Case: O(n) (if the target element is somewhere in the middle or not present).
•	Worst Case: O(n) (if the target element is at the end or not present).
Binary Search:
•	Description: Binary search efficiently finds the target value in a sorted list by repeatedly dividing the search interval in half.
•	Time Complexity: O(log n), where n is the number of elements in the list.
•	Best Case: O(1) (if the target element is at the middle).
•	Average Case: O(log n) (if the target element is somewhere in the list).
•	Worst Case: O(log n) (if the target element is not present, the algorithm will still perform log n checks). 


QUESTION 2-> Compare the time complexity of linear and binary search.?
ANSWER->
Time Complexity Comparison:
•	Linear Search:
Best Case: O(1)
Average Case: O(n)
Worst Case: O(n)
•	Binary Search:
Best Case: O(1)
Average Case: O(log n)
Worst Case: O(log n)


QUESTION 3-> Discuss when to use each algorithm based on the data set size and order?
ANSWER->
•	Linear Search:
•	Use when the dataset is small or unsorted.
•	Suitable for simple implementations or when sorting is not feasible.
•	Binary Search:
•	Use when the dataset is large and already sorted.
•	Requires additional overhead for sorting if the dataset is not initially sorted.





