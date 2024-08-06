QUESTION 1-> Explain different sorting algorithms (Bubble Sort, Insertion Sort, Quick Sort, Merge Sort).
ANSWER->
1.	Bubble Sort:
o	Description: Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent items, and swaps them if they are in the wrong order. The process is repeated until the list is sorted.
o	Time Complexity:
	Best Case: O(n) (when the array is already sorted)
	Average Case: O(n^2)
	Worst Case: O(n^2)
o	Space Complexity: O(1) (in-place sorting)
2.	Insertion Sort:
o	Description: Insertion Sort builds the sorted array one item at a time by repeatedly taking the next item and inserting it into the correct position in the already sorted portion of the array.
o	Time Complexity:
	Best Case: O(n) (when the array is already sorted)
	Average Case: O(n^2)
	Worst Case: O(n^2)
o	Space Complexity: O(1) (in-place sorting)
3.	Quick Sort:
o	Description: Quick Sort is a divide-and-conquer algorithm that selects a "pivot" element and partitions the array into two sub-arrays, one with elements less than the pivot and one with elements greater than the pivot. It then recursively applies the same process to the sub-arrays.
o	Time Complexity:
	Best Case: O(n log n)
	Average Case: O(n log n)
	Worst Case: O(n^2) (when the pivot choices are poor)
o	Space Complexity: O(log n) (due to recursion stack)
4.	Merge Sort:
o	Description: Merge Sort is a divide-and-conquer algorithm that divides the array into two halves, recursively sorts each half, and then merges the sorted halves.
o	Time Complexity:
	Best Case: O(n log n)
	Average Case: O(n log n)
	Worst Case: O(n log n)
o	Space Complexity: O(n) (requires extra space for merging)

QUESTION 2-> Compare the performance (time complexity) of Bubble Sort and Quick Sort.
ANSWER->
•  Bubble Sort:
    •	Best Case: O(n) (when the array is already sorted)
    •	Average Case: O(n^2)
    •	Worst Case: O(n^2)
    •	Bubble Sort is inefficient for large datasets due to its quadratic time complexity.
•  Quick Sort:
    •	Best Case: O(n log n)
    •	Average Case: O(n log n)
    •	Worst Case: O(n^2) (when the pivot choices are poor, though this is rare with good pivot selection strategies)
    •	Quick Sort is more efficient on average and is preferred for large datasets due to its better time complexity.

QUESTION 3-> Discuss why Quick Sort is generally preferred over Bubble Sort.
ANSWER->
•	Efficiency: Quick Sort generally provides faster performance due to its average-case time complexity of O(n log n).
•	Practical Performance: Despite its worst-case time complexity being O(n^2), Quick Sort's practical performance is typically better than Bubble Sort due to its efficient partitioning and smaller constant factors.
•	Flexibility: Quick Sort can be optimized with various strategies for choosing pivots and partitioning, which further improves its performance.


