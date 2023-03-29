import java.util.Arrays;

public class MergeSort {
	static int[] arr;
	static int[] sortedArr;
	
	public static void main(String[] args) {
		
		arr = new int[] {69,10,30,2,16,8,31,22};
		sortedArr = new int[arr.length];
		
		mergeSort(0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void mergeSort(int left, int right) {
		
		if(left < right) {
			
			int mid = (left + right) /2;
			mergeSort(left, mid);
			mergeSort(mid+1, right);
			
			merge(left, mid, right);
			
		}
		
	}
	
	public static void merge(int left, int mid, int right) {
		int L = left;		// 왼쪽 구역 시작
		int R = mid + 1;	// 오른쪽 구역 시작
		
		int idx = left;
		
		// 한쪽이 올인 날때까지
		while (L<=mid && R <= right) {
			if(arr[L] <= arr[R])
				sortedArr[idx++] = arr[L++];
			else 
				sortedArr[idx++] = arr[R++];
		}
		
		// 남아있는거 전부 소모
		if (L <= mid) {
			for(int i=L; i<=mid; i++) {
				sortedArr[idx++] = arr[i];
			}
		} else {
			for(int j=R; j<=right; j++) {
				sortedArr[idx++] = arr[j];
			}
		}
		
		// 원본 반영
		for(int i=left; i<=right; i++) {
			arr[i] = sortedArr[i];
		}	
	}
}
