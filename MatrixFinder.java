/*
  Team (Lonely Island)/2 - Taaseen Ali, Calvin Aw, Qian Zhou
  APCS2 pd01
  HW 03 -- I Am Still Searching
  2018-02-01

  Precondition: All integers in the rows and columns of the matrix are strictly increasing
  Postcondition: Returns coordinates of the first occurence of the integer or (-1,-1) if no such integer exists

  Algorithm:
  1) Start at the index (x, y) of the array being searched where x is the length 
  the array and y is 0
  2) if the element at (x, y) is larger than the item being searched for, decrement x by 1.
  if the element at (x, y) is smaller than the item being searched for, increment y. by 1
  if the element at (x, y) is equal to the element being searched for, return (x, y)
*/
public class MatrixFinder{
    public static void printMatrix(int[][] ar){
	System.out.println();
	System.out.println("=======================");
	for(int[] subAr: ar){
	    for(int i: subAr){
		System.out.print(i + " ");
	    }
	    System.out.println();
	}
	System.out.println("-----------------------");
	System.out.println();
    }
    public static int[][] create(int n){
	int[][] arr = new int[n][n];
	int g = (int)(Math.random()*10);
	arr[0][0]=g;
	for (int i = 0; i<n; i++){
	    for(int j = 0; j<n; j++){
		if (i != 0 && j != 0){
		    g = Math.max(arr[i][j-1], arr[j][i-1]);
		}
		else if(i !=0){
		    g = arr[i-1][j];
		}
		else if (j !=0){
		    g = arr[i][j-1];
		}
		g += (int) (1+Math.random()*10);
		arr[i][j] = g;
	    }
	}
	return arr;
		  
    }

      
    public static String search(int[][] ar, int target){
	int x = ar.length-1;
	int y = 0;
	while(x>=0 && y<ar.length){
	    if(ar[y][x]>target){
		x--;
	    }
	    else if(ar[y][x]<target){
		y++;
	    }
	    else{
		return "("+y+", "+x+")"; 
	    }
	}
	return "(-1,-1)";
    }

}
