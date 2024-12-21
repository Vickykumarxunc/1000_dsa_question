package _1basic;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class _27preorder_traversal {

    // node class : 
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    // construct tree : 
    public static Node constructTreee(String arr[] , int n){

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

    // preorder traversal : 
    public static void PreOrderTraversal(Node root , ArrayList<Integer> list){

        if(root == null){
            return;
        }
        list.add(root.data);
        PreOrderTraversal(root.left, list);
        PreOrderTraversal(root.right, list);

    }
    public static ArrayList<Integer> PreOrder(Node root){

        ArrayList<Integer> list = new ArrayList<>();
        PreOrderTraversal(root, list);
        return list;

    }

    public static void main(String[] args) {
        String arr[] = {"5" , "4" , "6" , "3" , "" , "" , "7" , "1" , ""};
        int n = arr.length;
        Node root = constructTreee(arr, n);
        
        ArrayList<Integer> ans = PreOrder(root);
        System.out.println(ans);

    }
    
}
