public class SingleLinkedListMain {

    public static void main(String[] args) {
        System.out.println("Single Linked List");

        //generate new LinkedList
        SingleLinkedList myLinkedList = new SingleLinkedList(10);

        System.out.println("Value of recently created LinkedList head " + myLinkedList.getHead().getValue());
        System.out.println("Value of recently created LinkedList tail " + myLinkedList.getHead().getValue());

        //tail and head should be the same since it only has one node
        System.out.println(myLinkedList.getHead() == myLinkedList.getHead());
        System.out.println("Traversing List values:");
        myLinkedList.traverseSLL();

        //Inserting values
        System.out.println("\nInserting into list at the end:");
        myLinkedList.insertInLinkedList(20, myLinkedList.getSize());
        myLinkedList.traverseSLL();

        System.out.println("\nInserting into list at the end:");
        myLinkedList.insertInLinkedList(30, myLinkedList.getSize());
        myLinkedList.traverseSLL();

        System.out.println("\nInserting into list at the beginning:");
        myLinkedList.insertInLinkedList(5, 0);
        myLinkedList.traverseSLL();

        System.out.println("\nInserting into list in the middle:");
        myLinkedList.insertInLinkedList(25, 3);
        myLinkedList.traverseSLL();


    }
}
