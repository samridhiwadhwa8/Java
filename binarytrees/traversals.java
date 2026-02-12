package binarytrees;
import java.util.*;
class Pair{
    Node node;
    int level;
    Pair(Node node,int level){
        this.node=node;
        this.level=level;
    }
}
public class traversals {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        Node i = new Node(5);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        preorder(a);
        System.out.println();
        levelorder(a);
        System.out.println();
        levelorderwise(a);
    }

    private static void levelorderwise(Node a) {
        Queue<Pair> q=new LinkedList<>();
        int cl=0;
        q.add(new Pair(a,0));
        while(q.size()>0){
            Pair front=q.remove();
            if(cl!=front.level){
                cl++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left!=null)q.add(new Pair(front.node.left,front.level+1));
            if(front.node.right!=null)q.add(new Pair(front.node.right,front.level+1));
        }


    }

    public static void inorder(Node a){
        if(a==null)return ;
        inorder(a.left);
        System.out.print(a.val+" ");
        inorder(a.right);
    }
    public static void postorder(Node a){
        if(a==null)return ;
        postorder(a.left);
        postorder(a.right);
        System.out.print(a.val+" ");
    }
    public static void preorder(Node a){
        if(a==null)return ;
        System.out.print(a.val+" ");
        preorder(a.left);
        preorder(a.right);
    }
    public static void levelorder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);
        }
        System.out.println();

    }
}
