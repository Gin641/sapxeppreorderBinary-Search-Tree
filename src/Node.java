public class Node {
    private Node left;
    private Node right;
    private int data;
    public Node(int data){
        this.data = data;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
