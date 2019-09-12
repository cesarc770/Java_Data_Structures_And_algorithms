public class DoubleNode<T> {

    private T value;
    private DoubleNode next;
    private  DoubleNode prev;

    public DoubleNode() {
        this.value = null;
        this.next = null;
        this.prev = null;
    }

    public DoubleNode(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public DoubleNode(T value, DoubleNode nextNode , DoubleNode prevNode) {
        this.value = value;
        this.next = nextNode;
        this.prev = prevNode;
    }

    //getters and setters


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() { return prev; }

    public void setPrev(DoubleNode prev) { this.prev = prev; }
}
