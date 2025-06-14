import java.util.*;

public class BFS {

  public static class Edge {
    int s;
    int d;
    int w;

    public Edge(int s, int d, int w) {
      this.s = s;
      this.d = d;
      this.w = w;
    }
  }

  public static void createGraph(ArrayList<Edge>[] graph, int V) {

    for (int i = 0; i < V; i++) {
      graph[i] = new ArrayList<>();
    }

    // adding s, d and w at the 0th node
    graph[0].add(new Edge(0, 1, 5));

    // adding s, d and w at the 1th node
    graph[1].add(new Edge(1, 0, 5));
    graph[1].add(new Edge(1, 2, 1));
    graph[1].add(new Edge(1, 3, 3));

    // adding s, d and w at the 2th node
    graph[2].add(new Edge(2, 1, 1));
    graph[2].add(new Edge(2, 3, 1));
    graph[2].add(new Edge(2, 4, 2));

    // adding s, d and w at the 3th node
    graph[3].add(new Edge(3, 1, 3));
    graph[3].add(new Edge(3, 2, 1));

    // adding s, d and w at the 4th node
    graph[4].add(new Edge(4, 2, 2));

    // for (int i = 0; i < graph[1].size(); i++) {
    // Edge e = graph[1].get(i);
    // System.out.println(e.d);
    // }

  }

  // Time complexity - O(V+E)
  public static void bfs(ArrayList<Edge>[] graph) {
    boolean arr[] = new boolean[graph.length];
    Queue<Integer> q = new LinkedList<>();
    q.add(0);
    arr[0] = true;

    while (!q.isEmpty()) {
      int curr = q.remove();
      System.out.print(curr + " ");

      for (int i = 0; i < graph[curr].size(); i++) {
        int neighbor = graph[curr].get(i).d;
        if (!arr[neighbor]) {
          q.add(neighbor);
          arr[neighbor] = true;
        }
      }
    }
  }

  public static void main(String[] args) {
    int V = 5;

    ArrayList<Edge>[] graph = new ArrayList[V];
    createGraph(graph, V);

    bfs(graph);
  }
}
