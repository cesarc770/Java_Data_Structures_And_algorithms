public class CircularSingleNode<T> {

    private T value;
    private CircularSingleNode<T> next;

    public CircularSingleNode() {
        this.value = null;
        this.next = null;
    }

    public CircularSingleNode(T value) {
        this.value = value;
        this.next = null;
    }

    public CircularSingleNode(T value, CircularSingleNode<T> nextNode) {
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

    public CircularSingleNode<T> getNext() {
        return next;
    }

    public void setNext(CircularSingleNode<T> next) {
        this.next = next;
    }
}
