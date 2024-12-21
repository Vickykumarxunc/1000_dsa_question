package _1basic;

import java.util.LinkedList;
import java.util.Queue;

public class _45countLeavesNodeinBinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    // construct the tree : 
    public static Node constructTree(String arr[]){
        int n = arr.length;
        int x = Integer.parseInt(arr[0]);
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(x);
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

    // function to count the leaf node : 
    public static int countLeafNode(Node root){
        
        // condition of the leaf node : 
        if(root == null){
            return 0;
        }
        int count = 0;
        if(root.left == null && root.right == null){
            count++;
        }
        count += countLeafNode(root.left) + countLeafNode((root.right));
        return count;
    }
    public static void main(String[] args) {

        String arr[] = {"50" , "30" , "70" , "20" , "40" , "60" , "80" ,
                         "" , "" , "" , "" , "65" , ""};
        Node root = constructTree(arr);

        int total_leaf_node = countLeafNode(root);
        System.out.println("total leaf node in the tree = " + total_leaf_node);

        
    }
}
