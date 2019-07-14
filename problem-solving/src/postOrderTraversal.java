//problem link: https://www.hackerrank.com/challenges/tree-postorder-traversal/problem

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void postOrder(Node root) {
        String toPrint = "";

        String result = postOrderRecursive(root,toPrint);

        System.out.println(result);
    }
    public static String postOrderRecursive(Node node, String toPrint) {
        
         if(node.left != null){
            toPrint = postOrderRecursive(node.left,toPrint);
        }
        if(node.right != null){
            toPrint = postOrderRecursive(node.right,toPrint);
        }
        if(toPrint == "") {
            toPrint += node.data;
        }
        else {
            toPrint += " " + node.data;
        }
        return toPrint;
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        postOrder(root);
    }	
}
