// How to create a binary tree from an array and preorder , inorder and postorder , where -1 defines null 

import java.util.Queue;
import java.util.Scanner;
import java.util.*;

public class BinaryTree_1 {

  // first of all creating a node class and initializing values in the constructor

  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  // creating another class for the insertion of elements in the tree where idx
  // will traverse on the array

  public static class BinaryTree {

    static int idx = -1;

    public static Node buildTree(int nodes[]) {
      idx++;

      if (nodes[idx] == -1) {
        return null;
      }

      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);

      return newNode;
    }
  }

  // creating a preorder function to display the array in the form
  // root node
  // left subtree
  // right subtree

  public static void preorder(Node root) {
    if (root == null)
      return;

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  // creating a inorder function to display the array in the form
  // left subtree
  // root node
  // right subtree

  public static void inorder(Node root) {
    if (root == null)
      return;

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  // creating a postorder function to display the array in the form
  // left subtree
  // right subtree
  // root node

  public static void postorder(Node root) {
    if (root == null)
      return;

    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
  }

  // level order traversal , using BFS

  public static void levelOrder(Node root) {

    if (root == null)
      return;

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while (!q.isEmpty()) {
      Node currentNode = q.remove();

      if (currentNode == null) {
        System.out.println();
        if (q.isEmpty())
          break;
        else
          q.add(null);
      } else {
        System.out.print(currentNode.data + " ");

        if (currentNode.left != null) {
          q.add(currentNode.left);
        }
        if (currentNode.right != null) {
          q.add(currentNode.right);
        }
      }

    }
  }

  // how to count the number of nodes in a tree

  public static int countNodes(Node root) {
    if (root == null) {
      return 0;
    }

    int leftCount = countNodes(root.left);
    int rightCount = countNodes(root.right);

    return leftCount + rightCount + 1;
  }

  // calculating the sum of data of all nodes

  public static int sumOfNodes(Node root) {
    if (root == null) {
      return 0;
    }

    int leftSum = sumOfNodes(root.left);
    int rightSum = sumOfNodes(root.right);

    return leftSum + rightSum + root.data;
  }

  // function to find the height of a tree

  public static int heightOfTree(Node root) {
    if (root == null) {
      return 0;
    }

    int leftHeight = heightOfTree(root.left);
    int rightHeight = heightOfTree(root.right);

    return Math.max(leftHeight, rightHeight) + 1;
  }

  // function to calculate diameter of a tree with time complexity n^2

  public static int findDiameter(Node root) {
    if (root == null) {
      return 0;
    }

    int diam1 = findDiameter(root.left);
    int diam2 = findDiameter(root.right);
    int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

    return Math.max(diam3, Math.max(diam1, diam2));
  }
  // the main function

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);
    levelOrder(root);
    System.out.println(findDiameter(root));
  }
}
