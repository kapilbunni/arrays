//we will get an integer array as input
//we need to return 1 if all the elements in the array are palindrome
//else return 0

class BB34 
{
	static int arrpalindrome(int arr[])
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			int before = arr[i];

			int after = 0;

			String res = "";

			while(before > 0)
			{
				res = res+String.valueOf(before%10);
				before = before/10;
			}
			after = Integer.parseInt(res);
			
			if(arr[i] != after)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) 
	{
		int arr[] = {131,1331,134431,9999,1001,1234321};

		//System.out.println("original");

//		for(int i = 0 ; i < arr.length ; i++)
//			System.out.print(arr[i]+" ");
			
		System.out.println(arrpalindrome(arr));
	}
}
