package demo;

public class PyramidTriangle {
	
	/*This program is to print the pyramid pattern of stars with increasing row count and starts in 
	odd number increasing order
	*/
	    public static void nStarTriangle(int n) {
	        
	        //each row loop
	        for(int i=0; i<n ; i++){
	           
	            //each column loop for before space print 
	        	
	            for(int j=0 ; j < n-i-1; j++){
	                System.out.print(" ");
	                
	            }
				//each column loop for stars print
			 
				for(int j=0; j<2*i+1 ; j++) {
					System.out.print("*");
				}
				
				//each column loop for after space print 
	        	
	            for(int j=0 ; j < n-i-1; j++){
	                System.out.print(" ");
	                
	            }
				System.out.println(); 
	        }
	        
	    }


	public static void main(String[] args) {
		nStarTriangle(3);

	}

}
