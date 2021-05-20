//kadane's algorithm
import java.util.Scanner;
class BB13 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements of array");

		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();

		int max = 0;
		int currentmax = 0;

		for(int i = 0 ; i < n ; i++)
		{
			if(currentmax+arr[i] >= arr[i])
			{
				currentmax+=arr[i];
			}
			else
			{
				currentmax = arr[i];
			}
			if(currentmax>max)
				max=currentmax;
		}
		System.out.println();
		System.out.println(max);
	}
}
