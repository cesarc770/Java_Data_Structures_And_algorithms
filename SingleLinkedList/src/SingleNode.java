public class SingleNode {

    private Object value;
    private SingleNode next;

    public SingleNode() {
        this.value = null;
        this.next = null;
    }

    public SingleNode(Object value) {
        this.value = value;
        this.next = null;
    }

    public SingleNode(Object value, SingleNode nextNode) {
        this.value = value;
        this.next = nextNode;
    }

    //getters and setters


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }
}
