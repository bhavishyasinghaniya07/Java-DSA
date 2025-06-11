import java.util.LinkedList;
import java.util.Queue;

public class Revision {

  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static class binaryTree {
    public static int idx = -1;

    public static Node buildTree(int nums[]) {
      idx++;

      if (nums[idx] == -1)
        return null;

      Node newNode = new Node(nums[idx]);
      newNode.left = buildTree(nums);
      newNode.right = buildTree(nums);

      return newNode;

    }

    public static void preOrder(Node root) {
      if (root == null)
        return;

      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
    }

    public static void levelOrder(Node root) {
      if (root == null)
        return;

      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);

      while (!q.isEmpty()) {
        Node curr = q.remove();

        if (curr == null) {
          System.out.println();
          if (q.isEmpty())
            break;
          else
            q.add(null);
        } else {
          System.out.print(curr.data + " ");

          if (curr.left != null) {
            q.add(curr.left);
          }
          if (curr.right != null) {
            q.add(curr.right);
          }
        }
      }

    }

    public static int height(Node root) {
      if (root == null)
        return 0;

      int left = height(root.left);
      int right = height(root.right);
      return Math.max(left, right) + 1;

    }

    public static int diameter(Node root) {
      if (root == null) {
        return 0;
      }

      int diam1 = diameter(root.left);
      int diam2 = diameter(root.right);
      int diam3 = height(root.left) + height(root.right) + 1;

      return Math.max(diam3, Math.max(diam1, diam2));
    }

  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

    binaryTree tree = new binaryTree();
    Node root = tree.buildTree(nums);
    tree.levelOrder(root);
    System.out.println(tree.height(root));
    System.out.println(tree.diameter(root));
  }
}
