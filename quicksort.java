import java.util.Random;
public class quicksort {

	public static int[] CreateRandomIntegerArray(int inSize, int inLow, int inHigh){
		int[] intArray = new int[inSize];
		Random randInt = new Random();
		for (int i = 0; i < inSize; i++){
			intArray[i] = randInt.nextInt((inHigh - inLow) + 1) + inLow;
		}
		return intArray;
	}
	
	public static void printintArray(int[] inArray){
		for(int i = 0; i < inArray.length; i++){
			System.out.println("Array[" + i + "] = " + inArray[i]);
		}
		System.out.println();
	}
	
	public static void Flip (int[] inIntArray, int posA, int posB)
	{
		int tempint = 0;
		tempint = inIntArray[posA];
		inIntArray[posA] = inIntArray[posB];
		inIntArray[posB] = tempint;
	}
	
	public static int[] pivot(int[] inArray, int leftpointer, int rightpointer){
		int low = leftpointer ;
		int high = rightpointer;
		int pivot = inArray[leftpointer+(rightpointer-leftpointer)/2];
		
		while (low <= high){
			while (inArray[low] < pivot){
				low++;
			}
			while (inArray[high] > pivot){
				high--;
			}
			if (low <= high){
				Flip(inArray, low, high);
				low++;
				high--;
			}
			if (leftpointer < high){
				pivot(inArray, leftpointer, high);
			}
			if (rightpointer > low){
				pivot(inArray, low, rightpointer);
			}
		}
		return inArray;
	}
	
	public static void sort(int[] inArray, int leftpointer, int rightpointer){

		if (rightpointer - leftpointer <= 0){
			return;
		}
		
		int[] newPivot = pivot(inArray, leftpointer, rightpointer);
	}
	
	public static void QuickSort (int[] inIntArray){
		Random randint = new Random();
		sort(inIntArray, 0 , inIntArray.length - 1);
	}
	
	public static void main(String[] args) {
		int[] sortthis = CreateRandomIntegerArray(10,0,20);
		System.out.println("-- Before Sort -- ");
		printintArray(sortthis);
		QuickSort(sortthis);
		System.out.println("-- After Sort -- ");
		printintArray(sortthis);
	}
}
