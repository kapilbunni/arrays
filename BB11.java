//finding duplicate element with O(n)complexity 
//an array of size n+1 is passed 
//elements in array are in the range of 1-n
//there is only one repeated no. in the no.s


class BB11  
{
	public static int duplicate(int [] arr)
	{
		int pos = 0;
		for (int i=0;i<arr.length ;i++ )
		{
			pos = Math.abs(arr[i]);
			if(arr[pos]<0)
			{
				return pos;
			}
			else
			{
				arr[pos] = arr[pos]*-1;
			}
		}
		return pos;
	}
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,1};
		System.out.println(duplicate(arr));
	}
}
