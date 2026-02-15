## #8 Big O Notation

How code slows as data grows

Describes the performance of an algorithm as the amount of data increases
Machine independent (# of steps to completion)
Ignore smaller operations O(n+1) → O(n)

Example:
O(1)
O(n)
O(log n)
O(n^2)

n = amount of data

### O(1) - constant time
random access of an element in an array
inserting at the beginning of linkedlist

### O(log n) - logarithmic time
binary search

### O(n) - linear time
looping through elements in an array
searching through a linkedlist

### O(n log n) - quasilinear time
quicksort
mergesort
heapsort

### O(n^2) - quadratic time
insertion sort
selection sort
bubble sort

### O(n!) - factorial time
travelling salesman problem