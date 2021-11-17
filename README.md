## Exercise One
### Purpose: This program finds the smallest non-occuring integer in a given array

### Process
#### Step 1: Array sort
The given array is first sorted in ascending order using Arrays.sort() Java API.
This is for us to get the smallest value in the array to be used to initialised our counter in the later step.
#### Step 2: Convert the array to a tree set DS
Here, the sorted array is converted to a tree set data structure using a custom function, convertArrayToTreeSet. This function takes the sorted array as an argument and returns a tree set made from the array. The choice of tree set DS is to have a group of sorted numbers
with no duplicates.
#### Step 3: Find the smallest non-occuring integer
Finally, the tree set DS is passed to the custom function, getSmallestNonOccuring. This function loops through (in ascending order starting from the array's element gotten in step 1) the tree set and returns the first missing number as the smallest non-occuring integer. 
