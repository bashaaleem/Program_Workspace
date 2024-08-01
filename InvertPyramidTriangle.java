package demo;

public class InvertPyramidTriangle {

	
	public static void nStarTriangle(int n) {
		
	//First Part of the code 
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
	//Second part of the code 
		for(int i=0; i<n ; i++){
	           
            //each column loop for before space print 
        	
            for(int j=0 ; j < i; j++){
                System.out.print(" ");
                
            }
            
            //each column loop for after star print
            for(int k=0 ; k < 2*n -(2*i+1) ; k++){
                System.out.print("*");
                
            }
            System.out.println();
		}
		
		 
	}
	public static void main(String[] args) {
		nStarTriangle(3);

	}
}
