package _2easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;


public class _11LeftViewOfBinarytree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // function to create a tree : 
    public static Node cosntructTree(String arr[]){

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
                int r = Integer.parseInt(arr[ i + 1]);
                right.data = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i +=2;
        }
        return root;
    }
    public static ArrayList<Integer> leftView(Node root){

        // we use the preorder and maintain the max level  : 
        ArrayList<Integer> list = new ArrayList<>();
        int maxlevel[] = {0};
        findLeftView(root , list , 1 , maxlevel);
        return list;
    }
    public static void findLeftView(Node root , ArrayList<Integer> list , int level , int maxLevel[]){

        // base case : 
        if(root == null){
            return;
        }
        // agar mera maxlevel level se chota hai to ans me root ka data add kar do : 
        // max level ko update kar do : 
        // ye most left view : 
        if(maxLevel[0] < level){
            list.add(root.data);
            maxLevel[0] = level;
        }

        // recursive call for the left and right subtree : 
        findLeftView(root.left, list, level + 1, maxLevel);
        findLeftView(root.right, list, level + 1, maxLevel);
    }
    public static void main(String[] args) {
        
        String arr[] = {"1" , "2" , "3" , "4" , "5" , "" , "6" , ""};
        Node root = cosntructTree(arr);

        ArrayList<Integer> list = leftView(root);
        System.out.println(list);
    }
}
