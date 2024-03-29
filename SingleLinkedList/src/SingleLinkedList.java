public class SingleLinkedList<T> {

   private SingleNode<T> head = null;
   private SingleNode<T> tail = null;
   private int size;

   public SingleLinkedList() {}

    //creation
    public SingleLinkedList(T nodeValue) {
       SingleNode<T> node = new SingleNode<>(nodeValue);
       this.head = node;
       this.tail = node;
       this.size = 1;
    }

    //getters and setters
    public SingleNode<T> getHead() {
        return head;
    }

    public void setHead(SingleNode<T> head) {
        this.head = head;
    }

    public SingleNode<T> getTail() {
        return tail;
    }

    public void setTail(SingleNode<T> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    //insertion
    public void insertInLinkedList(T nodeValue, int location) {
       SingleNode<T> newNode = new SingleNode<>(nodeValue);

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
           SingleNode<T> tempNode = head;
           int index = 0;

           while(index < location - 1)
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
    public void traverseSLL() {
       if (this.existsLinkedList(this.getHead())) {
           SingleNode<T> tempNode = this.getHead();
           for(int i = 0; i < this.getSize(); i++){
               System.out.print(tempNode.getValue());
               if(i != this.getSize() - 1) {
                   System.out.print(" -> ");
               }
               tempNode = tempNode.getNext();
           }
       }else {
           System.out.println("Linked List does not exists !");
       }
        System.out.println("\n");

    }

    //deletion of a node
    public void deleteFromLinkedList(int location) {

        if(!existsLinkedList(this.head)) {
            System.err.println("Linked list does nto exist!");
            return;
        } else if (location == 0) {
            this.head = this.head.getNext();
            setSize(getSize()-1);
            if(getSize() == 0) {
                tail = null;
            }
        } else if (location >= size) {
            SingleNode<T> tempNode = head;
            for(int i = 0; i < this.getSize() -1; i++) {
                tempNode = tempNode.getNext();
            }

            if(tempNode == head) {
                this.head = this.tail = null;
                this.setSize(this.getSize()-1);
                return;
            }

            tempNode.setNext(null);
            this.tail = tempNode;
            this.setSize(this.getSize()-1);

        } else {
            SingleNode tempNode = head;
            for(int i = 0; i < location -1; i++) {
                tempNode = tempNode.getNext();
            }

            tempNode.setNext(tempNode.getNext().getNext());
            this.setSize(this.getSize()-1);
        }
    }

    //deletion of linkedlist
    public void deleteLinkedList() {
       this.head = this.tail = null;
        System.out.println("Deleted Linked List");
    }



    //helper function to check if linkelist exists meaning it has a head
    public boolean existsLinkedList(SingleNode head) {
       return head != null;
    }





}
