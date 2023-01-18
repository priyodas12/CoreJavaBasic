package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraverse2 {

    public static List<Node> getAllElementsByRecursion(Node root){

        List<Node> results=new ArrayList<>();

        if(root==null){
            return results;
        }
        else{
            List<Node> leftElements=getAllElementsByRecursion(root.left);
            List<Node> rightElements=getAllElementsByRecursion(root.right);
            results.add(root);
            results.addAll(leftElements);
            results.addAll(rightElements);
        }
        return results;
    }

    public static boolean  findNode(Node root,Node element){
        boolean result = true;
        if(root==null){
            result=false;
        }
        else if(root.left!=null){
           if(element.val==root.left.val) {
               System.out.println("left: "+root.right.val);
               result=true;
           }else{
               result=findNode(root.left,element);
           }
        }
        else if(root.right!=null){
            if(element.val==root.right.val) {
                System.out.println("right: "+root.right.val);
                result=true;
            }
            else{
                result=findNode(root.right,element);
            }
        }
        return result;
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

        c.left=f;
        c.right=g;

        //getAllElementsByRecursion(a).stream().forEach(i-> System.out.println("Element: "+i));

        System.out.println(findNode(a,new Node(70)));

    }
}
