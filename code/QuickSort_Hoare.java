import java.util.Arrays;

public class QuickSort_Hoare {
	static int[] arr;
	
	public static void main(String[] args) {
		
		arr = new int[] {1,2,4,6,3,9,8,7,5};
		quickSort(0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int left, int right){
		
		if(left < right) {
			
			int pivot = partition(left, right);	
			// pivot이 정상 자리로 들어가고 왼쪽으론 작은거 오른쪽으론 큰 값들이 정렬된다.
			
			// pivot을 기준으로 왼쪽 다시 소트
			quickSort(left, pivot-1);

			// pivot을 기준으로 오른쪽 다시 소트
			quickSort(pivot+1, right);
		}		
	}

	public static int partition(int left, int right) {
		
		// 제일 왼쪽 값이 pivot
		int pivot = arr[left];
		int L = left+1;
		int R = right;
		
		// L과 R이 역전될 때까지 돌린다. 
		while(L <= R) {
			// L증가
			while(L <= R && arr[L] <= pivot) L++;
			// R감소
			while(arr[R] > pivot) R--;
			
			// 교환
			if(L < R) swap(L, R);
		}
		// pivot을 R위치로 넣야한다.
		swap(left, R);		
		
		return R;
	}
	
	public static void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
