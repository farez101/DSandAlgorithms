package mainClass;

import sorting.MergeSort;
import sorting.QuickSort;

public class Main {
	public static void main(String[] args) {

		int[] A = { 1, 5, 6, 2, 3, 7, 8, 4 };
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");

		System.out.println();

//           MergeSort.mergeSort(A);
		QuickSort.quicksort(A,0,A.length-1);
		
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
	}
}
