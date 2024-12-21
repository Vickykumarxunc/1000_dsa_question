package _1basic;

import java.util.LinkedList;
import java.util.Queue;

public class _22find_min_element_bst {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static int find_min(Node root){

        // agar root hi null hia : 
        if(root == null){
            return -1;
        }
        // agar root ka left child null hai : 
        if(root.left == null){
            return root.data;
        }
        // if tree have left and right child both : 
        // then go depth of the left chile of each node : 
        Node curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.data;
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
            // make the connection: 
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }
    
    // height of the treee : 
    public static int height(Node root){
        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    // print the tree level wise : 
    public static void print(Node root , int n){
        if(root == null){
            return;
        }
        if(n == 1){
            System.out.print(root.data + " ");
        }
        print(root.left, n - 1);
        print(root.right, n - 1);
    }
    public static void main(String[] args) {
         
        String arr[] = {"5" , "4" , "6" , "3" , "" , "" , "7" , "1" , ""};
        Node root = constructTree(arr);

        int level = height(root) + 1;
        for(int i = 1; i<=level; i++){
            print(root, i);
            System.out.println();
        }

        int min_element = find_min(root);
        System.out.println("minimum element in the bst = " + min_element);

    }
}
