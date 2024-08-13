package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	int term = 10;
	int n1 = 0;
	int n2 = 1;
	
	for (int i = 0; i <=term; ++i) {
		System.out.print(n1);
		int sum = n1+n2;
		n1=n2;
		n2=sum;
		if(i!=term) 
		{
		System.out.print(",");
		}	
	}
	}
}