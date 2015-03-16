import java.util.*;

public class Sorts
{
	public void bubbleSort(int[] list)
	{
		for (int outer = 0; outer < list.length-1; outer++)
		{
			for (int inner = 0; inner < list.length-outer-1; inner++)
			{
				if (list[inner] > list[inner + 1])
				{
				//swap list[inner] & list[inner+1]
					int temp = list[inner];
					list[inner] = list[inner + 1];
					list[inner + 1] = temp;
				}
			}
		}
	}

	public void selectionSort(int[] list)
	{
		int flag, temp;
		for (int outer = 0; outer < list.length - 1; outer++)
		{
			flag = outer;  
			for (int inner = outer+1; inner < list.length; inner++)
			{
				if (list[inner] < list[flag])
				{
					flag = inner;
				}
			}
		//swap list[outer] & list[flag]
		temp = list[outer];
		list[outer] = list[flag];
		list[flag] = temp;
		}
	}

	public void insertionSort(int[] list)
	{
		//your code here
	}

	private void merge(int[] a, int first, int mid, int last)
	{
		//your code here
	}

	public void mergeSort(int[] a, int first, int last)
	{
		//your code here
	}
}

