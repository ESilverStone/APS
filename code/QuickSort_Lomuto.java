import java.util.Arrays;

public class QuickSort_Lomuto {
	static int[] arr;
	
	public static void main(String[] args) {
		
		arr = new int[] {3,2,4,6,9,1,8,7,5};
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
		
		// 맨 오른쪽 값을 pivot으로 설정
		int pivot = arr[right];	
		
		int i = left - 1;
		
		// 왼쪽부터 pivot 전까지 검사
		for(int j=left; j<right; j++) {
			if(arr[j] <= pivot) {	// 작거나 같다면 
				i++;				// i 증가
				swap(i,j);			// 즉 pivot보다 작은건 left~i까지 보관됨
			}
		}
		swap(i+1, right);	// pivot이 제자리 찾아 들어감
		return i+1;
	}
	
	public static void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
