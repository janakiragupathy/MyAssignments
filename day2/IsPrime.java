package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		int x = 0;
		for (int i = 2; i <=n-1; i++) 
		{
			if (n%i==0) 
			{
				System.out.println("This number " + n + " is not Prime");
				x++;
				break;
			} 
		}	
		if (x==0) 
		{	
			System.out.println("This number " + n + " is Prime");
		}
	}
}


