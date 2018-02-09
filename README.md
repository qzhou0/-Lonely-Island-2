# (Lonely-Island)/2
(Taaseenn Ali, Calvin Aw, Qian Zhou)
APCS2 pd01
L #00: But What Does the Data Say?

## Hypothesis
For an n*n matrix, worst case execution time of our search method is O(n)
## Background
Given a n*n matrix where the every row and every collumn is sorted from greatest
to least, we propose that our search algoritm will be able to execute in linear
time. This hypothesis is based on the fact that our algorithm starts on the top
right corner of the "sorted" two-dimensional array and navigates its way down to
the bottom left corner of the array based on the values encountered. Through
this methedology, the maximum number of steps needed to find an element of the
array would be 2n, thus allowing the algorithm to in theory, run in O(n) time.

## Experiment methodology described
We started off with a randomly generated 1000*1000 from which we tested our
algorith with a 1000000 times in a row, searching for random values each time.
This ensures that any outliers become insignificant thoough the numerous trials.
The time needed for the 1000000 trials is then stored in an array.
The process is repeated for the other n*n arrays in 1000 step increments upto
15000*15000.

## Results
Graphs, clearly labeled.
## Conclusions
Analysis of raw data (concise explanations of conclusions drawn.)
Explicit mention of any results you *cannot* explain.
