package day18;

import java.util.*;
public class BFS {
	public List<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		List<Integer> result = new ArrayList<>();
		boolean[] visited = new boolean[V];
		Queue<Integer> queue = new LinkedList<>();
		visited[0] = true;
		queue.add(0);
		while (!queue.isEmpty()) {
			int node = queue.poll();
			result.add(node);
			for (int neighbor : adj.get(node)) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
		return result;
	}
}
