# (Lonely-Island)/2

(Taaseenn Ali, Calvin Aw, Qian Zhou)

APCS2 pd01

L #00: But What Does the Data Say?

## Hypothesis

For an n x n matrix, worst case execution time of our search method is O(n)

## Background

Given a n x n matrix where the every row and every column is sorted from greatest
to least, we propose that our search algorithm will be able to execute in linear
time. This hypothesis is based on the fact that our algorithm starts on the top
right corner of the "sorted" two-dimensional array and navigates its way down to
the bottom left corner of the array based on the values encountered. Through
this methedology, the maximum number of steps needed to find an element of the
array would be 2n, thus allowing the algorithm to in theory, run in O(n) time.

## Experiment methodology described

We started off with a randomly generated 1000x1000 matrix from which we tested our
algorithm by running it 1,000,000 times in a row, searching for random values each time.
This ensures that any outliers become insignificant thoough the numerous trials.
The time needed for the 1,000,000 trials is then stored into an array.
The process is repeated for the other n x n arrays with n incrementing by 1000 up to
15000x15000.

## Results

| size (n)	| time (mlliseconds) | 
|---------|-------------------|
| 1000 | 812 | 
| 2000 | 	1361 | 
| 3000 | 	2126 | 
| 4000 | 	3523 | 
| 5000 | 	4439 | 
| 6000 | 	5721 | 
| 7000 | 	6912 | 
| 8000 | 	8458 | 
| 9000 | 	9800 | 
| 10000 | 	11114 | 
| 11000 | 	12441 | 
| 12000 | 	13882 | 
| 13000 | 	16024 | 
| 14000 | 	16772 | 
| 15000 | 	18368 | 
Graphs, clearly labeled.

## Conclusions

Analysis of raw data (concise explanations of conclusions drawn.)
Explicit mention of any results you *cannot* explain.

