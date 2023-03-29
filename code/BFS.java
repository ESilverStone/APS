import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	static int N = 7;
	//인접행렬
	static int[][] adj = { 
			{ 0, 1, 1, 0, 0, 1, 0 }, 
			{ 1, 0, 0, 1, 0, 0, 1 }, 
			{ 1, 0, 0, 1, 0, 0, 0 },
			{ 0, 1, 1, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 1, 1 },
			{ 1, 0, 0, 0, 1, 0, 0 }, 
			{ 0, 1, 0, 1, 1, 0, 0 } };
	
	static boolean[] visited = new boolean[N];
	static Queue<Integer> que = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		BFS(0);
	}
	
	static void BFS(int v) {
		// 시작 정점을 큐에 넣는다. 
		que.add(v);
		visited[v] = true;
		
		// 큐가 공백이 될때까지 반복문 수행
		// 큐가 공백이 아니라면 반복문 수행
		while(!que.isEmpty()) {
			// 정점을 하나 꺼내
			int curr = que.poll();
			System.out.print(curr+" > ");
			
			// 나와 연결되어 있으면서 방문하지 않은 친구들을 Q에 넣는다. 
			for(int i=0; i<adj.length; i++) {
				if(!visited[i] && adj[curr][i] == 1) {
					que.add(i);
					visited[i] = true;
				}
			}
			
		}
		
	}
}	
