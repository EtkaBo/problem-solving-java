//Question Link:
//https://www.hackerrank.com/challenges/tree-preorder-traversal/problem

public class preOrderTraversal {

	public static class Node
	{
		public Node() { } 
		public Node(int data){
			
			this.data = data;
		}
		public Node right;
		public Node left;
		public int data;
	}

    public static void preOrder(Node root) {

        System.out.println(recursiveSolution(root,""));

    }

    public static String recursiveSolution(Node root, String fullNumbers) {

        fullNumbers += Integer.toString(root.data) + " ";
        if (root.left != null) {
            String tempStr = recursiveSolution(root.left, fullNumbers);

            fullNumbers = tempStr;
        }

        if (root.right != null) {
            String tempStr = recursiveSolution(root.right, fullNumbers);

            fullNumbers = tempStr;
        }

        return fullNumbers;
    }
    
    
    //Example:
    
//    1
//    \
//     2
//      \
//       5
//      /  \
//     3    6
//      \
//       4 
    public static void main(String args[]) {
    	
    	Node n1 = new Node(1);
    	Node n2 = new Node(2);
    	Node n3 = new Node(3);
    	Node n4 = new Node(4);
    	Node n5 = new Node(5);
    	Node n6 = new Node(6);
    	
    	n1.right = n2;
    	n2.right = n5;
    	n5.left = n3;
    	n3.right = n4;
    	n5.right = n6;
    	
    	preOrder(n1);
    }
	
}
