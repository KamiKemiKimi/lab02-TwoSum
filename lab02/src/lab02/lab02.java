package lab02;

public class lab02 {
	//pointer method to find two numbers that equal sum
	public int [] twoSum(int [] num, int sum)
	{
		int [] sums = new int [2];
		int low = 0;
		int high = num.length-1;
		
		while (low <= high)
		{
			int total = num[low] + num[high];
			//until both pointers equal each other
			if (low == high)
			{
				break;
			}
			//if sum is found
			if (total == sum)
			{
				sums[0] = low;
				sums[1] = high;
				break;
			}
			//if current sum is too high
			else if (total > sum)
				high--;
			//if current sum is too low
			else
				low++;
		}
		
		return sums;
	}
	
	//insertion sort
	public int[] sort (int [] arr)
	{
		for (int i = 1; i < arr.length; i++)
		{
			int temp = arr[i];
			int j = i - 1;
			//check all preceding entries
			while (j >= 0 && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = temp;
		}
		return arr;
	}
	
	public static void main (String [] args)
	{
		//USE THIS TO TEST
		int [] arr1 = {2, 6, 8, 7};
		int target = 14;
		
		
		//Print given array
		for (int i = 0; i < arr1.length; i++)
		{
			if (i == 0)
				System.out.print("Given: [" + arr1[i]);
			else
				System.out.print(", " + arr1[i]);
		}
			System.out.println("]");
		//Print given target
			System.out.println("Target: " + target);
			
		//To avoid using static
		lab02 p1 = new lab02();
		
		
		//Print sorted array
		int [] arr2 = p1.sort(arr1);
		
		for (int i = 0; i < arr2.length; i++)
		{
			if (i == 0)
				System.out.print("Sorted: [" + arr2[i]);
			else
				System.out.print(", " + arr2[i]);
		}
			System.out.println("]");
			
			
		//Print Answer
		int [] arr3 = p1.twoSum(arr2, target);
		//If there's no solution
		if (arr3[0] == 0 && arr3[1] == 0)
		{
			System.out.println("-1");
			System.out.print("Solution cannot be found.");
		}
		//If there's a solution
		else
		{
			for (int i = 0; i < arr3.length; i++)
				{
					if (i == 0)
						System.out.print("Answer: [" + arr3[i]);
					else
						System.out.print(", " + arr3[i]);
				}
					System.out.println("]");
					System.out.print("       Because nums[" + arr3[0] + "] + " + "nums[" + arr3[1] + "] = " + arr2[arr3[0]] + " + " + arr2[arr3[1]] + " = " + (arr2[arr3[0]] + arr2[arr3[1]]));
					
		}
	}
	
		
		
}
