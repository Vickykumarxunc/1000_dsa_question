package _1basic;

import javax.naming.LinkException;
import java.util.Queue;
import java.util.LinkedList;

public class _95sumOfBinarytree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    //function to construct the tree : 
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

    public static int sum(Node root){

        if(root == null){
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }
    public static void main(String[] args) {
        String arr[] = {"1" , "2" , "3"};
        Node root = constructTree(arr);
        int sum = sum(root);
        System.out.println("sum of the tree = " + sum);
        
    }
}
