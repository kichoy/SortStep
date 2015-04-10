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
		for (int outer = 0; outer < list.length-1; outer++)
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
		for (int outer = 1; outer < list.length; outer++)
		{
			int position = outer;
			int key = list[position];
			
			// Shift larger values to the right
			while (position > 0 && list[position - 1] > key)
			{
				list[position] = list[position - 1];
				position--;
			}
			list[position] = key;
		}
	}

	private void merge(int[] a, int first, int mid, int last)
	{
		int iA = first; //partition the array - set indexes
		int iB = mid+1;

		int [] mergedArray = new int [a.length];
		for (int i = first; i < last; i++) //merge section of array
		{
			if (iA > mid) // if there are no more numbers in A
			{
				mergedArray[i] = a[iB]; // then merge whatever is in B
				iB++;
			}
			else if (iB > last)
			{
				mergedArray[i] = a[iA];
				iA++;
			}
			else if (a[iA] < a[iB])
			{
				mergedArray[i] = a[iA];
				iA++;
			}
			else
			{
				mergedArray[i] = a[iB];
				iB++;
			}
		}

		// copy merged section of array
		for (int i = first; i <= last; i++) //fixed problem: i must go upto last
		{
			a[i] = mergedArray[i];
		}
	}


	// FIXED out of bounds - Problem was in merge.
	public void mergeSort(int[] a, int first, int last)
	{
		int mid = (first+last)/2;
		if (last-first > 0) //only when first !<= 0
		{
			mergeSort(a, first, mid);
			mergeSort(a, mid+1, last);
		}
		merge(a, first, mid, last);
	}
}
