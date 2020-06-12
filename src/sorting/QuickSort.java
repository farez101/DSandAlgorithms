package sorting;

public class QuickSort {

	public static int partioning(int [] B, int start , int end) {
		int pivotValue = B[end];
		int pivotIndex = start;
		for (int i=start; i<end; i++) {
			if(B[i]<=pivotValue) {
				int temp = B[i];
				B[i] = B[pivotIndex];
				B[pivotIndex]= temp;
				pivotIndex ++;
			}
		}
		B[end] = B[pivotIndex];
		B[pivotIndex] =pivotValue ;
		return pivotIndex;
	}
	
	public static void quicksort(int [] A, int start , int end) {
		if(start < end) {
			int pivotIndex = partioning(A,start,end);
			quicksort(A,start,pivotIndex-1);
			quicksort(A,pivotIndex+1,end);
		}
	}
}
