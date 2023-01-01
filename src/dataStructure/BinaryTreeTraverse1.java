package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraverse1 {

    public static List<Node> getTreeAsArray(Node root){

        List<Node> results=new ArrayList<>();

        List<Node> listNode=new ArrayList<>();

        listNode.add(root);

        while(listNode.size()>0){
            Node current=listNode.remove(listNode.size()-1);
            System.out.println("Current Node Value: "+current.val);
            results.add(current);

            if(current.left!=null) listNode.add(current.left);
            if(current.right!=null) listNode.add(current.right);
        }
        return results;
    }
    public static void main(String[] args) {

        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        Node g=new Node(70);

        a.left=b;
        a.right=c;

        b.left=d;
        b.right=e;

        d.left=f;
        d.right=g;

        getTreeAsArray(a).stream().map(n->n.val).forEach(System.out::println);

    }
}
