package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CyclicUndirected {

	private static ArrayList<Integer> adj[];

	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}

	public static boolean isCyclicUtil(int v, boolean visited[], int parent)
	{
		// Mark the current node as visited
		visited[v] = true;
		Integer i;

		// Recur for all the vertices
		// adjacent to this vertex
		Iterator<Integer> it = adj[v].iterator();
		while (it.hasNext())
		{
			i = it.next();

			// If an adjacent is not
			// visited, then recur for that
			// adjacent
			if (!visited[i])
			{
				if (isCyclicUtil(i, visited, v))
					return true;
			}

			// If an adjacent is visited
			// and not parent of current
			// vertex, then there is a cycle.
			else if (i != parent)
				return true;
		}
		return false;
	}

	// Returns true if the graph
	// contains a cycle, else false.
	public static boolean isCyclic()
	{

		int V=adj.length;
		boolean visited[] = new boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;

		for (int u = 0; u < V; u++)
		{ 

			// Don't recur for u if already visited
			if (!visited[u])
				if (isCyclicUtil(u, visited, -1))
					return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int v=in.nextInt();
		int e=in.nextInt();
		Graph graph=new Graph(v);
		System.out.println("Enter edges");
		for(int i=0;i<e;i++) {
			int source=in.nextInt();
			int destination=in.nextInt();
			graph.addEdge(source,destination);
		}
		if(isCyclic()) System.out.println("Cyclic");
		else System.out.println("Acyclic");

	}

}
