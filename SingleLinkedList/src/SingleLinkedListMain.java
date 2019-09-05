public class SingleLinkedListMain {

    public static void main(String[] args) {
        System.out.println("Single Linked List");

        //generate new LinkedList
        SingleLinkedList myLinkedList = new SingleLinkedList(10);

        System.out.println("Value of recently create LinkedList head " + myLinkedList.getHead().getValue());
        System.out.println("Value of recently create LinkedList tail " + myLinkedList.getHead().getValue());

        //tail and head should be the same since it only has one node
        System.out.println(myLinkedList.getHead() == myLinkedList.getHead());




    }
}
