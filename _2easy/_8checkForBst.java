package _2easy;

import java.util.LinkedList;
import java.util.Queue;

public class _8checkForBst {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // construct tree : 
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

    // check tree is bst or not : 
    public static boolean isBST(Node root){

         // mujhe tree ke har ek node compare karwane ke liye 
         // to value cahiye : max and min : 
         int min = Integer.MIN_VALUE;
         int max = Integer.MAX_VALUE;

         boolean ans = checkBST(root , min , max);
         return ans;
    }
    public static boolean checkBST(Node root , int min , int max){

        // base case : 
        if(root == null){
            return true;
        }
        // mai har node ko previous node se compare kar ke dekhuga : 
        if(root.data < min || root.data > max){
            return false;
        }

        // mai poore tree par traverse kar ke dekhuga : 
        return checkBST(root.left, min, root.data) &&
               checkBST(root.right, root.data, max);

        // left subtree ke liye minimum element to same rahega : 
        // maximum element uske node ka uper wala node ho jayega : (parent)

        // right subtree ke liye maximum element to same rahega : 
        // minimum element uske node ka uper wala node hoga (parent); 
    }
    public static void main(String[] args) {

        String arr[] = {"10" , "5" , "15" , "2" , "7" , "12" , "20" , ""};
        Node root = constructTree(arr);

        boolean ans = isBST(root);
        System.out.println("binary tree is bst or not  = " + ans);

        
    }
}
