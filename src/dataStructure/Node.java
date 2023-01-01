package dataStructure;

public class Node {
     int val;
     Node left;
     Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }
}

