// A graph is a non-linear data structure made of:

// Nodes (also called vertices) – these represent entities.

// Edges – these are the connections/relationships between the nodes.

// 🔗 Think of Facebook: people are nodes, and friendships are edges.

// Types of Graphs
// Undirected Graph

// Edges have no direction

// Example: Facebook friendships

// Directed Graph (Digraph)

// Edges have directions

// Example: Instagram follow

// Weighted Graph

// Each edge has a weight

// Example: Road distances

// Unweighted Graph

// No weights on edges

// Just connections

// Cyclic Graph

// Contains at least one cycle

// Acyclic Graph

// No cycles at all

// E.g., tree is a type of acyclic graph

// Connected Graph

// There’s a path between every pair of vertices

// Disconnected Graph

// Some nodes are isolated (no path between some nodes)

// Ways to Represent a graph -

// 1. Adjacency Matrix
// A 2D array of size V x V (where V = number of vertices)

// matrix[i][j] = 1 means there's an edge from vertex i to vertex j

// 0 means no edge

// 🔸 Example:
// Graph with edges: 0-1, 0-2, 1-2

// java
// Copy
// Edit
// int[][] matrix = {
// {0, 1, 1},
// {1, 0, 1},
// {1, 1, 0}
// };
// ✅ Pros:
// Very fast to check if edge exists → O(1)

// Easy to implement

// ❌ Cons:
// Uses more space → O(V²), even if few edges

// Not memory efficient for large sparse graphs

// ✅ 2. Adjacency List
// Each vertex stores a list of neighbors

// Use ArrayList<ArrayList<Integer>> in Java

// 🔸 Example:
// Same graph: 0-1, 0-2, 1-2

// java
// Copy
// Edit
// ArrayList<ArrayList<Integer>> list = new ArrayList<>();

// // Initialize lists
// for (int i = 0; i < 3; i++) {
// list.add(new ArrayList<>());
// }

// // Add edges (undirected)
// list.get(0).add(1);
// list.get(0).add(2);

// list.get(1).add(0);
// list.get(1).add(2);

// list.get(2).add(0);
// list.get(2).add(1);
// ✅ Pros:
// Efficient space for sparse graphs → O(V + E)

// Easy to get neighbors of a node

// ❌ Cons:
// Slow to check if edge exists → O(N) time in worst case

// ✅ 3. Edge List
// Just store a list of edges

// Each edge is a pair (or triplet if weighted)

// 🔸 Example:
// java
// Copy
// Edit
// int[][] edges = {
// {0, 1},
// {0, 2},
// {1, 2}
// };
// If weighted:

// java
// Copy
// Edit
// int[][] weightedEdges = {
// {0, 1, 10},
// {0, 2, 5},
// {1, 2, 8}
// };
// ✅ Pros:
// Very simple representation

// Good for algorithms like Kruskal’s

// ❌ Cons:
// Slow to find neighbors or check edge existence

// Not ideal for traversal
