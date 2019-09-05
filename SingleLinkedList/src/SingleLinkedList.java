public class SingleLinkedList {

   private SingleNode head = null;
   private SingleNode tail = null;
   private int size;

   public SingleLinkedList() {}

    //creation
    public SingleLinkedList(Object nodeValue) {
       SingleNode node = new SingleNode(nodeValue);
       this.head = node;
       this.tail = node;
       this.size = 1;
    }

    //getters and setters
    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    //insertion
    public void insertInLinkedList(Object nodeValue, int location) {
       SingleNode newNode = new SingleNode(nodeValue);

       if(!existsLinkedList(this.head)) {
           System.err.println("Linked list does nto exist!");
           return;
       } else if (location == 0) {
           newNode.setNext(this.head);
           this.head = newNode;
       } else if (location >= size) {
           this.tail.setNext(newNode);
           this.tail = newNode;
       } else {
           SingleNode tempNode = head;
           int index = 0;

           while(index < location - 1);
           {
               tempNode = tempNode.getNext();
               index++;
           }

           newNode.setNext(tempNode.getNext());
           tempNode.setNext(newNode);

       }
        setSize(getSize()+1);
    }

    //traversing

    //deletion of a node

    //deletion of linkedlist


    //helper function to check if linkelist exists meaning it has a head
    public boolean existsLinkedList(SingleNode head) {
       return head != null;
    }





}
