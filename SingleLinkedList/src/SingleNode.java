public class SingleNode<T> {

    private T value;
    private SingleNode next;

    public SingleNode() {
        this.value = null;
        this.next = null;
    }

    public SingleNode(T value) {
        this.value = value;
        this.next = null;
    }

    public SingleNode(T value, SingleNode nextNode) {
        this.value = value;
        this.next = nextNode;
    }

    //getters and setters


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }
}
