package day18;

import java.util.*;
public class DFS {
	public List<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		List<Integer> result = new ArrayList<>();
		boolean[] visited = new boolean[V];
		dfsUtil(0, visited, adj, result);
		return result;
	}
	private void dfsUtil(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj,List<Integer> result) {
		visited[node] = true;
		result.add(node);
		for (int neighbor : adj.get(node)) {
			if (!visited[neighbor]) {
				dfsUtil(neighbor, visited, adj, result);
				}
		}
	}
}