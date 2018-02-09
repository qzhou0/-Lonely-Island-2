public class MFDriver{
    public static void main(String args[]){

	double[] times = new double[15];
	/*
	  int[][] f = create(10000);
	  int find = 234;
	  for(int i=0; i<10; i++){
	  double sum = 0;
	  for(int n=0;n<100000; n++){
	  double start = System.currentTimeMillis();
	  search(f,find);
	  double end = System.currentTimeMillis();
	  sum+=end-start;
	  }
	  System.out.println(sum);
	  }
	*/
	
	for(int n=1; n<=15; n++){
	    System.out.println("Running search algorithm with n = " + n*1000 + "...");
	    int[][] toSearch = MatrixFinder.create(n*1000);
	    	    
	    double start = System.currentTimeMillis();
      	    for(int trial=0; trial<1000000; trial++){
		MatrixFinder.search(toSearch, (int)(n*10000*Math.random()));
	    }
	    
	    double end = System.currentTimeMillis();
	    double elapsed = end-start;
	    
	    times[n-1] = elapsed;
	}
	System.out.println("==============RESULTS==============");
	System.out.println("  n vs. time (milliseconds)");
	for(int i=0; i<times.length;i++){
	    System.out.println((i+1)*1000 + " || " + times[i]);
	    
	}
	
       
	
    }
}
