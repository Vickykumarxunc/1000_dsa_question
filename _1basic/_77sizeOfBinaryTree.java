package _1basic;
import java.util.Queue;
import java.util.LinkedList;

public class _77sizeOfBinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // create a tree ; 
    public static Node constructTree(String arr[]){

        int n = arr.length;
        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while(i < n - 1){

            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);

            if(arr[i].equals("")){
                left = null;
            }
            else{
                int l = Integer.parseInt(arr[i]);
                left.data = l;
                q.add(left);
            }
            if(arr[i + 1].equals("")){
                right = null;
            }
            else{
                int r = Integer.parseInt(arr[i + 1]);
                right.data = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }
    public static int size_of_binaryTree(Node root){

        if(root == null){
            return 0;
        }
        return 1 + size_of_binaryTree(root.left) + size_of_binaryTree(root.right);
    }
    public static void main(String[] args) {
        String arr[] = {"1" , "2" , "3" , ""};
        Node root = constructTree(arr);

        int size = size_of_binaryTree(root);
        System.out.println("size of the binary tree = " + size);
    }
}
