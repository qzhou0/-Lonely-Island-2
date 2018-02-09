public class MFDriver{
    public static void main(String args[]){

	double[] times = new double[10];
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
	
	for(int n=5; n<15; n++){
	    System.out.println("Running search algorithm with n = " + Math.pow(2,n) + "...");
	    int[][] toSearch = MatrixFinder.create((int)Math.pow(2,n));
	    	    
	    double start = System.currentTimeMillis();
      	    for(int trial=0; trial<1000000; trial++){
		MatrixFinder.search(toSearch, (int)(Math.pow(2,n)*10*Math.random()));
	    }
	    
	    double end = System.currentTimeMillis();
	    double elapsed = end-start;
	    
	    times[n-5] = elapsed;
	}
	System.out.println("==============RESULTS==============");
	System.out.println("  n vs. time (milliseconds)");
	for(int i=0; i<times.length;i++){
	    System.out.println(Math.pow(2,i+5) + " || " + times[i]);
	    
	}
	
       
	
    }
}
