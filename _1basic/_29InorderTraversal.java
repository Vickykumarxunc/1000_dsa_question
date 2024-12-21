package _1basic;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class _29InorderTraversal {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // construct tree .............
    public static Node constructTree(String arr[] , int n){

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
            i +=2;
        }
        return root;
    }

    // inorder : 
    public static void inorder(Node root , ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left , list);
        list.add(root.data);
        inorder(root.right , list);
        
    }
    public static ArrayList<Integer> inorderTraversal(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root , list);
        return list;

    }
    public static void main(String[] args) {

        String arr[] = {"5" , "4" , "6" , "3" , "" , "" , "7" , "1" , ""};
        Node root = constructTree(arr, arr.length);

        ArrayList<Integer> list = inorderTraversal(root);
        System.out.println(list);
        
    }
    
}
