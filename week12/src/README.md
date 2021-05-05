
## Lets say you have an array with these elements
{3, 2, 5, 6, 0, 7}

## what can you say about this array?

1- int values
2- 6 elements
3- last index is 5
4- Unsorted

## If we want to access the elements in order we have to sort the array 

- Find the max and min? 
min = 0 
max = 7

## Bubble Sort  time complexity O(n^2) worst, average,   O(n) best

- Compare the first element with the next one and switch if the next element is smaller
- Repeat
{3, 2, 5, 6, 0, 7}
1 iteration
{2, 3, 5, 6, 0, 7}
2 iteration
{2, 3, 5, 6, 0, 7}
3 iteration
{2, 3, 5, 6, 0, 7}
4 iteration
{2, 3, 5, 0, 6, 7}
5 iteration 
{2, 3, 5, 0, 6, 7}

1 iteration
{2, 3, 5, 0, 6, 7}
2 iteration
{2, 3, 5, 0, 6, 7}
3 iteration
{2, 3, 0, 5, 6, 7}
4 iteration
{2, 3, 0, 5, 6, 7}
5 iteration
{2, 3, 0, 5, 6, 7}

1 iteration
{2, 3, 0, 5, 6, 7}
2 iteration
{2, 0, 3, 5, 6, 7}
3 iteration
{2, 0, 3, 5, 6, 7}
..

1 iteration
{0, 2, 3, 5, 6, 7}
...
...
...

## implementing 
```
	for(int i = 0 ; i < arr.length-1 ; i++)
			for (int j = 0; j<arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int old = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = old;
				}
			}


```
- first iteration 
i=0
- inner first iteration
j=0
j < length -1 - i
0 < (6 -1 -0)

j =1 
5
....

i = 1
- inner first iteration
j=0
j < length -1 - i
0 < (6 -1 -1)
...
j = 4 

----
i = 2

inner first iteration
j=0
j < length -1 - i
0 < (6 -1 -2)
...
j = 3
-----
inner loop
{3, 2, 5, 6, 0, 7}
j = 0
3 > 2
swap
{2, 3, 5, 6, 0, 7}
j = 1
3 >  5
continue
j = 5 stop inner loop 



# Excercise  for this week 12 is to write an essay about the the sorting algorithms below

### Selection Sort,  time complexity O(n^2) worst, average, best
### Insertion Sort,  time complexity O(n^2) worst, average, O(n) best

### MergeSort O(nlogn)
### quickSort O(nlogn), O(n^2)
