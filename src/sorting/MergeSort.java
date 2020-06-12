package sorting;

public class MergeSort {
//  O(n) = n*log(n)
// Overall time complexity of Merge sort is O(nLogn). ... The space complexity of Merge sort is O(n).
// Merge sort is not in place because it requires additional memory space to store the auxiliary arrays
// The quick sort is in place as it doesn't require any additional storage. 
//	Efficiency : Merge sort is more efficient and works faster than quick sort in case of larger array size or data-sets.	
// Merge sort is an external algorithm and based on divide and conquer strategy.
	
	/*
	 
  - The elements are split into two sub-arrays (n/2) again and again until only one element is left.
  -  Merge sort uses additional storage for sorting the auxiliary array.
  -  Merge sort uses three arrays where two are used for storing each half, and the third external one is used to store the final sorted list by merging other two and each array is then sorted recursively.
  -  At last, the all sub arrays are merged to make it ‘n’ element size of the array.
	 */
	
	public static void merge(int[] leftArray, int[] rightArray, int[] A) {
		int leftIndex = 0;
		int rightIndex = 0;
		int arrayIndex = 0;

		while (leftIndex < leftArray.length && rightIndex < rightArray.length) {

			if (leftArray[leftIndex] <= rightArray[rightIndex]) {
				A[arrayIndex] = leftArray[leftIndex];
				arrayIndex++;
				leftIndex++;
			} else {
				A[arrayIndex] = rightArray[rightIndex];
				arrayIndex++;
				rightIndex++;
			}

		}

		while (leftIndex < leftArray.length) {
			A[arrayIndex] = leftArray[leftIndex];
			arrayIndex++;
			leftIndex++;
		}

		while (rightIndex < rightArray.length) {
			A[arrayIndex] = rightArray[rightIndex];
			arrayIndex++;
			rightIndex++;
		}

		return ;
	}

	public static void mergeSort(int[] A) {
		if (A.length < 2)
			return ;
		else {
			int leftLength = A.length / 2;
			int rightLength = A.length - leftLength;

			int[] leftArray = new int[leftLength];
			int[] rightArray = new int[rightLength];

			for (int i = 0; i < leftLength; i++) {
				leftArray[i] = A[i];
			}
			for (int i = leftLength; i < A.length; i++) {
				rightArray[i - leftLength] = A[i];
			}

			 mergeSort(leftArray);
			 mergeSort(rightArray);
			 merge(leftArray, rightArray, A);
		}

		return ;
	}

}
