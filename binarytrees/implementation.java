package binarytrees;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
        left=null;
        right=null;
    }
}
public class implementation {
    public static void main(String[] args) {
        //        3
        //      /   \
        //     4      2
        //   /   \   /  \
     //    -1    1  6    9
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(-1);
        Node e=new Node(1);
        Node f=new Node(6);
        Node g=new Node(9);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(maximum(a));
    }
    public static void display(Node root){
        if(root==null)return ;
        System.out.print(root.val+ " ");
        display(root.left);
        display(root.right);
    }
    public static int size(Node root){
        if(root==null)return 0;
        return 1 + size(root.left)+ size(root.right);
//        return (root==null)? 0 :(1+size(root.left)+size(root.right));
    }
    public static int sum(Node root){
        if(root==null)return 0;
        int left=sum(root.left);
        int right=sum(root.right);
        return root.val+left+right;

    }
    public static int product(Node root){
        if(root==null)return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static int maximum(Node root){
        if(root==null)return -1;
        return Math.max(root.val,Math.max(maximum(root.right),maximum(root.left)));
    }
}

