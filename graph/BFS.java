package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
	
	private static LinkedList<Integer> graph[];
	
	public Graph(int vertex) {
		graph = new LinkedList[vertex];
		for(int i=0;i<vertex;i++)
			graph[i]=new LinkedList<Integer>();
	}
	
	public void addEdge(int source, int destination) {
		graph[source].add(destination);
		graph[destination].add(source);
	}
	public static int BFS(int source, int destination) {
		int distance=0;
		boolean visited[]=new boolean[graph.length];
		int parent[]=new int[graph.length];
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		parent[source]=-1;
		visited[source] = true;
		while(!q.isEmpty()) {
			int cur=q.poll();
			if(cur==destination)
				break;
			for(int neighbour:graph[cur]) {
				if(!visited[neighbour]) {
					q.add(neighbour);
					visited[neighbour]=true;
					parent[neighbour]=cur;
				}
			}
		}
		int cur=destination;
		while(parent[cur]!=-1) {
			System.out.print(cur + " --> ");
			cur=parent[cur];
			distance++;
		}
		return distance;
	}
	
	public static void main(String args[]) {
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
		System.out.println("Enter source and destination for shortest path");
		int source = in.nextInt();
		int destination = in.nextInt();
		int d=BFS(source,destination);
		System.out.println("Minimum distance is "+d);
	}

	@Override
	public String toString() {
		return "Graph [graph=" + Arrays.toString(graph) + "]";
	}
	
}
