
public class DFS {
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
	
	public static void main(String[] args) {
		DFS(0);
	}
	
	static void DFS(int v) {
		// v에 대한 방문처리를 하겠다. 
		visited[v] = true;
		System.out.println(v+1);
		
		// 나와 연결되어 있으면서 (간선이 존재하면서) 아직 방문하지 않은 정점을 재귀호출
		for(int i=0; i<N; i++) {
			// 방문하지 않았고 && 간선이 존재하면
			if(!visited[i] && adj[v][i] == 1) {
				DFS(i);
			}
		}
		
	}
}	
