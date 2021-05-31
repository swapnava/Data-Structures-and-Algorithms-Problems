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
		System.out.println(graph);
	}

	@Override
	public String toString() {
		return "Graph [graph=" + Arrays.toString(graph) + "]";
	}
	
}
