package _1basic;

 
import java.util.*;
import java.util.Queue;

public class _100CountNonLeafNode {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // construct the tree  : 
    public static Node construct(String arr[]){
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
            else {
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

    // function to count the non leaf node :
    public static int count(Node root){

        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }
    public static void main(String[] args) {

        String arr[] = {"1" , "2" , "3" , "4" , "5" , ""};
        Node root = construct(arr);
        int non_leaf_node = count(root);
        System.out.println("no of non leaf node = " + non_leaf_node);
        
        
    }
}
