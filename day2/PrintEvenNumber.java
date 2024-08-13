package week1.day2;

public class PrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=25;
		//0,2,4,...24
		//if condition
		//for loop
		
		for (int i = 0; i < value; i++) {
			
			if (i%2==0) {
				System.out.println("Even Number: "+i);
			}
		}
		for (int j = 0; j <=value; j++) {
			
			if (j%2!=1) {
				System.out.println("Even Number: "+j);
				
				}			
		}
		
		for (int k = 1; k <=value; k++) {
		if (k%2==1) {
			System.out.println("Odd Number: "+k);
		}	
		}
	}
}


