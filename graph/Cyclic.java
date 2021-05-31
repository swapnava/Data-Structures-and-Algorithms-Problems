package graph;

import java.util.ArrayList;
import java.util.Scanner;
//Cyclic Undirected
public class Cyclic {
	 private static ArrayList<Integer> adj[];
	 
	 public Cyclic(int vertices){
		 adj = new ArrayList[vertices];
		 for(int i=0;i<vertices;i++) {
			 adj[i] = new ArrayList<Integer>();
		 }
	 }
	 
	 public void addEdge(int source, int destination) {
		 adj[source].add(destination);
	 }
	 
	 public static boolean cyclic() {
		 boolean visited[] = new boolean[adj.length];
		 boolean recStack[] = new boolean[adj.length];
		 for(int i=0;i<adj.length;i++) {
			 if(isCyclic(i,visited, recStack))
				 return true;
		 }
		 return false;
	 }
	 
	 public static boolean isCyclic(int i, boolean[] visited, boolean[] recStack) {
		 if(recStack[i])
			 return true;
		 if(visited[i])
			 return false;
		 visited[i]=true;
		 recStack[i]=true;
		 
		 ArrayList<Integer> children = adj[i];
		 
		 for(int c:children) {
			 if(isCyclic(c,visited,recStack))
				 return true;
		 }
		 recStack[i]=false;
		 return false;
	 }



	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int v=in.nextInt();
		int e=in.nextInt();
		Cyclic graph=new Cyclic(v);
		System.out.println("Enter edges");
		for(int i=0;i<e;i++) {
			int source=in.nextInt();
			int destination=in.nextInt();
			graph.addEdge(source,destination);
		}
		if(cyclic()) {
			System.out.println("The Graph is cyclic");
		}
		else {
			System.out.println("The Graph is acyclic");
		}
	}

}
