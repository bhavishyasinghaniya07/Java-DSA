import java.util.*;

public class TopView {

  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static int idx = -1;

  public static Node buildTree(int arr[]) {
    idx++;
    if (arr[idx] == -1)
      return null;

    Node newNode = new Node(arr[idx]);
    newNode.left = buildTree(arr);
    newNode.right = buildTree(arr);

    return newNode;

  }

  public static void inorder(Node root) {
    if (root == null)
      return;

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static int countNodes(Node root) {
    if (root == null)
      return 0;

    return 1 + countNodes(root.left) + countNodes(root.right);
  }

  public static void topview(Node root, TreeMap<Integer, Node> hm, int i) {
    if (root == null)
      return;

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    hm.put(i, root);

    while (!q.isEmpty()) {
      Node curr = q.remove();

      if (curr.left != null) {
        q.add(curr.left);

        if (!hm.containsKey(i - 1))
          hm.put(i - 1, curr.left);
      }
      if (curr.right != null) {
        q.add(curr.right);

        if (!hm.containsKey(i + 1))
          hm.put(i + 1, curr.right);
      }
    }

    for (Map.Entry<Integer, Node> it : hm.entrySet()) {
      System.out.print(it.getValue().data + " ");
    }

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    Node root = buildTree(arr);
    inorder(root);
    int nodes = countNodes(root);
    System.out.println("No. of Nodes - " + nodes);

    TreeMap<Integer, Node> hm = new TreeMap<>();

    topview(root, hm, 0);
  }
}
