import java.util.*;

// The graph - 

//     5
// 0 ------- 1
//          |\
//        1 | \ 3
//          |  \
//          2   3
//          |   |
//          |1  |
//          |   |
//          2---3
//           \
//            \
//             4
//            (2)

public class AdjacencyList {

  // creating a class edge containing source , destination and weight
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

  public static void main(String[] args) {

    // the no. of vertex in the graph
    int V = 5;

    // creating an array of arraylist , and arraylist containig Edge
    ArrayList<Edge>[] Graph = new ArrayList[V];

    // initially null is set at every place , lets initialize every place with a new
    // ArrayList
    for (int i = 0; i < V; i++) {
      Graph[i] = new ArrayList<>();
    }

    // adding s, d and w at the 0th node
    Graph[0].add(new Edge(0, 1, 5));

    // adding s, d and w at the 1th node
    Graph[1].add(new Edge(1, 0, 5));
    Graph[1].add(new Edge(1, 2, 1));
    Graph[1].add(new Edge(1, 3, 3));

    // adding s, d and w at the 2th node
    Graph[2].add(new Edge(2, 1, 1));
    Graph[2].add(new Edge(2, 3, 1));
    Graph[2].add(new Edge(2, 4, 2));

    // adding s, d and w at the 3th node
    Graph[3].add(new Edge(3, 1, 3));
    Graph[3].add(new Edge(3, 2, 1));

    // adding s, d and w at the 4th node
    Graph[4].add(new Edge(4, 2, 2));

    // finding the neighbors of 1
    for (int i = 0; i < Graph[1].size(); i++) {
      Edge e = Graph[1].get(i);
      System.out.println(e.d);
    }

  }
}
