package _1basic;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class _50SearchNodeInBst {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // cosntruct tree : 
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

    // search node in the bst : 
    public static boolean search(Node root , int x){

        // condition : 
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        if(root.data > x){
            return search(root.left, x);
        }
        else{
            return search(root.right , x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the search element : ");
        int key = sc.nextInt();
        String arr[] = { "10", "5", "15", "2", "7", "12", "20"};
        Node root = constructTree(arr);

        boolean ans = search(root, key);
        System.out.println(key + " is present or not in the tree = " + ans);


    }
}
