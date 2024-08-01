package demo;

public class NumberCrownPattern {

	
	public static void numberCrown(int n) {
        int emptySpace = 2*(n-1);
        //print rows
        for(int i=1; i<=n; i++){
            //print each column number
            for(int j=1; j <= i; j++){
                System.out.print(j+" ");
            }

            for(int j=1; j<=emptySpace; j++)
                System.out.print(" ");

            for(int j=i; j >= 1; j--){
                System.out.print(j+" ");
            }

        System.out.println();
        emptySpace -= 2;
        }
    }
	
	
	public static void main(String[] args) {
		int num = 3;
		numberCrown(num);
		
	}

}
