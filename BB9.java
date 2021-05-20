//largest sum contehious sub array
//here we will get an array we need to find the max. sum contagious sub array

//							*********************kadanes algorithm*************************
import java.util.Scanner;
class BB9
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [10];
		System.out.println("enter no.of elements :");
		int n = sc.nextInt();
		System.out.println("enter array elements :");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		//kadanes logic
		int csum = arr[0]; //current sum
		int osum = arr[0]; //overall sum
		
		for (int i=0;i<n;i++ )
		{
			if(csum>=0)
			{
				csum+=arr[i];
			}
			else
				csum=arr[i];
			if(csum>osum)
				osum=csum;
		}
		System.out.println("overall sum :"+osum);
	}
}
