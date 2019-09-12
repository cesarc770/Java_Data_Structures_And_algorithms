public class CircularSingleLinkedList<T> {

    private CircularSingleNode<T> head = null;
    private CircularSingleNode<T> tail = null;
    private int size;

    public CircularSingleLinkedList() {}

    //creation
    public CircularSingleLinkedList(T nodeValue) {
        CircularSingleNode<T> node = new CircularSingleNode<>(nodeValue);
        node.setNext(node);
        this.head = node;
        this.tail = node;
        this.size = 1;
    }

    //getters and setters
    public CircularSingleNode<T> getHead() {
        return head;
    }

    public void setHead(CircularSingleNode<T> head) {
        this.head = head;
    }

    public CircularSingleNode<T> getTail() {
        return tail;
    }

    public void setTail(CircularSingleNode<T> tail) {
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
        CircularSingleNode<T> newNode = new CircularSingleNode<>(nodeValue);

        if(!existsLinkedList(this.head)) {
            System.err.println("Linked list does nto exist!");
            return;
        } else if (location == 0) {
            newNode.setNext(this.head);
            this.head = newNode;
            this.tail.setNext(newNode);
        } else if (location >= size) {
            this.tail.setNext(newNode);
            this.tail = newNode;
            this.tail.setNext(this.head);
        } else {
            CircularSingleNode<T> tempNode = head;
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
    public void traverseCSLL() {
        if (this.existsLinkedList(this.getHead())) {
            CircularSingleNode<T> tempNode = this.getHead();
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
            this.tail.setNext(this.head);
            setSize(getSize()-1);
            if(getSize() == 0) {
                tail = null;
            }
        } else if (location >= size) {
            CircularSingleNode<T> tempNode = head;
            for(int i = 0; i < this.getSize() -1; i++) {
                tempNode = tempNode.getNext();
            }

            if(tempNode == head) {
                this.head = this.tail = null;
                this.setSize(this.getSize()-1);
                return;
            }

            tempNode.setNext(this.head);
            this.tail = tempNode;
            this.setSize(this.getSize()-1);

        } else {
            CircularSingleNode tempNode = head;
            for(int i = 0; i < location -1; i++) {
                tempNode = tempNode.getNext();
            }

            tempNode.setNext(tempNode.getNext().getNext());
            this.setSize(this.getSize()-1);
        }
    }

    //deletion of linkedlist
    public void deleteLinkedList() {
        this.head = null;
        tail.setNext(null);
        tail = null;
        System.out.println("Deleted Linked List");
    }

    //Search in Linked List
    boolean search(T nodeValue) {
        if (existsLinkedList(this.head)) {
            CircularSingleNode<T> tempNode = head;
            for (int i = 0; i < size; i++) {

                if (tempNode.getValue() == nodeValue) {
                    System.out.print("Found the node at location: "+i);
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.print("Node not found!! ");

        return false;
    }



    //helper function to check if linkelist exists meaning it has a head
    public boolean existsLinkedList(CircularSingleNode head) {
        return head != null;
    }

///EXTRA////
    //I want to print the list as many times as the user wants using the get next method
    // and since it is circular it will continue to loop until terminated somehow else.
    //in this case I am using times and keeping the round variable to terminate the loop
    public void traverseWithCircularProperties (int times) {
        int count = 0;
        int round = 0;
        CircularSingleNode<T> tempNode = this.getHead();
            if (this.existsLinkedList(this.getHead())) {
                while(tempNode.getNext() != null && round < times ){
                    System.out.print(tempNode.getValue());
                    count++;
                    if(count < this.getSize()) {
                        System.out.print(" -> ");
                    } else {
                        count = 0;
                        round++;
                        System.out.println("");
                    }
                    tempNode = tempNode.getNext();
                }
            }else {
                System.out.println("Linked List does not exists !");
            }
            System.out.println("\n");

    }


}
