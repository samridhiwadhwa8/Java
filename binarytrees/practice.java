package binarytrees;

public class practice {
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
        Node i=new Node(5);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        mirror(a);
    }
    public static void mirror(Node a){
        //preorder root(swap) left right
//        if(a==null)return ;
//        Node t=a.left;
//        a.left=a.right;
//        a.right=t;
//        System.out.print(a.val+" ");
//        mirror(a.left);
//        mirror(a.right);
        //postorder left right root
        if(a==null)return ;
        mirror(a.left);
        mirror(a.right);
        Node t=a.left;
        a.left=a.right;
        a.right=t;
        System.out.print(a.val+" ");
    }
}
