public class BST {
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

  public static Node buildTree(int val, Node root) {
    if (root == null) {
      return root = new Node(val);

    }

    if (val < root.data) {
      root.left = buildTree(val, root.left);
    } else {
      root.right = buildTree(val, root.right);
    }

    return root;
  }

  public static void inorder(Node root) {
    if (root == null)
      return;

    inorder(root.left);
    System.out.print(root.data + " -> ");
    inorder(root.right);
  }

  public static boolean search(Node root, int target) {

    if (root == null) {
      return false;
    }

    if (root.data == target) {
      return true;
    } else if (target < root.data) {
      return search(root.left, target);
    } else {
      return search(root.right, target);
    }

  }

  public static void main(String args[]) {
    int arr[] = { 5, 1, 3, 4, 2, 7 };
    Node root = null;

    for (int i = 0; i < arr.length; i++)
      root = buildTree(arr[i], root);

    inorder(root);

    System.out.println(search(root, 7));

  }
}
