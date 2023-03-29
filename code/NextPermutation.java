import java.util.Arrays;

public class NextPermutation {
	public static int[] arr;
	
	public static void main(String[] args) {
		
		arr = new int[] {1,2,3,4,5};
		
		nextP();
		
	}

	public static void nextP() {
		int N = arr.length;
		// 1. 맨 뒤의 숫자부터 탐색하여, 증가하는 부분을 찾는다.
		int idx = N - 1;	
		for(int i = idx; i > 0; i--) {
			idx = i;
			if(arr[i-1] > arr[i]) {
				break;		// 하나 찾으면 바로 나온다.
			}
		}
		
		if (idx == 0) {
			System.out.println("다음 순열이 존재하지 않습니다. 마지막 순열 입니다.");
			return;
		}
		
		for (int i = N - 1; i >= idx; i--) {
			if (arr[idx - 1] < arr[i]) {
				int temp = arr[idx - 1];
				arr[idx - 1] = arr[i];
				arr[i] = temp;
				break;
			}
		}
		
		// 우측지점을 정렬한다. 
		Arrays.sort(arr, idx, N-1);
		
		System.out.println(Arrays.toString(arr));
		
		nextP();
	}
}
