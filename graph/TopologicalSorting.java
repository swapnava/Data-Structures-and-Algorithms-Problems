package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSorting {
	
	private static ArrayList<ArrayList<Integer>> graph;
	
	public TopologicalSorting(int vertices) {
		graph = new ArrayList<ArrayList<Integer>>(vertices);
		for(int i=0;i<vertices;i++) {
			graph.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int source, int destination) {
		graph.get(source).add(destination);
	}
	
	public static void topo() {
		int v=graph.size();
		boolean visited[]=new boolean[v];
		Stack<Integer> stack=new Stack<>();
		Arrays.fill(visited, false);
		for(int i=0;i<v;i++) {
			if(!visited[i])
				topoUtil(i,stack,visited);
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
	
	public static void topoUtil(int v, Stack<Integer> stack, boolean[] visited) {
		visited[v]=true;
		int i;
		
		Iterator<Integer> it=graph.get(v).iterator();
		while(it.hasNext()) {
			i=it.next();
			if(!visited[i])
				topoUtil(i,stack,visited);
		}
		stack.push(v);
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of vertices");
		int v=in.nextInt();
		TopologicalSorting gr=new TopologicalSorting(v);
		System.out.println("Enter number of edges");
		int e=in.nextInt();
		System.out.println("Enter the edges");
		for(int i=0;i<e;i++) {
			int s=in.nextInt();
			int d=in.nextInt();
			gr.addEdge(s, d);
		}
		topo();
	}

}
