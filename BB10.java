//minimum no. of jumps to reach end of an array
//an array is passed each element in array represents the max. no.of places pointer can move from there
//a pointer can move steps<=infdex value but not more than that



import java.util.Scanner;
class  BB10
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of elements :");
		int n = sc.nextInt();
		System.out.println("enter array elements :");
		int [] arr = new int [100];
		for (int i=0;i<n;i++ )
		{
			arr[i] = sc.nextInt();
		}
			int stepspossible = arr[0];
			int jumps = 1;
			int maxreachable = arr[0];
			for (int i =1 ; i<n ; i++ )
			{
				if(i == n-1)
					System.out.println("no. of minimum jumps : "+jumps);
				maxreachable = Math.max(maxreachable,arr[i]+i);
				stepspossible--;
				if(stepspossible == 0)
				{
					jumps++;
					stepspossible = maxreachable-i;
				}
				if(maxreachable < i)
				{
					System.out.println("undefined");
				}
			}
	}
}
