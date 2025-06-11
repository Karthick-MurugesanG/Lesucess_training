package day18;
import java.util.*;
public class GraphMain {
	public static void main(String[] args) {
	int V = 5;
	ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	for (int i = 0; i < V; i++)
		adj.add(new ArrayList<>());
	adj.get(0).add(1); 
	adj.get(0).add(2); 
	adj.get(0).add(3);
	adj.get(1).add(0); 
	adj.get(1).add(4);
	adj.get(2).add(0);
	adj.get(2).add(3);
	adj.get(3).add(0); 
	adj.get(3).add(2);
	adj.get(4).add(1);
	BFS bfs = new BFS();
	System.out.println("BFS Traversal: " + bfs.bfsOfGraph(V, adj));
	DFS dfs = new DFS();
	System.out.println("DFS Traversal: " + dfs.dfsOfGraph(V, adj));
	}
}
