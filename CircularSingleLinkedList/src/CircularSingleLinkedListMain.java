public class CircularSingleLinkedListMain {

    public static void main(String[] args) {
        System.out.println("Single Linked List");

        //generate new Linked List
        CircularSingleLinkedList<Integer> myLinkedList = new CircularSingleLinkedList<>(10);

        System.out.println("Value of recently created LinkedList head " + myLinkedList.getHead().getValue());
        System.out.println("Value of recently created LinkedList tail " + myLinkedList.getHead().getValue());

        //tail and head should be the same since it only has one node
        System.out.println(myLinkedList.getHead() == myLinkedList.getHead());
        System.out.println("Traversing List values:");
        myLinkedList.traverseCSLL();

        //Inserting values
        System.out.println("\nInserting into list at the end:");
        myLinkedList.insertInLinkedList(20, myLinkedList.getSize());
        myLinkedList.traverseCSLL();

        System.out.println("\nInserting into list at the end:");
        myLinkedList.insertInLinkedList(30, myLinkedList.getSize());
        myLinkedList.traverseCSLL();

        System.out.println("\nInserting into list at the beginning:");
        myLinkedList.insertInLinkedList(5, 0);
        myLinkedList.traverseCSLL();

        System.out.println("\nInserting into list in the middle:");
        myLinkedList.insertInLinkedList(15, 2);
        myLinkedList.traverseCSLL();

        System.out.println("\nInserting into list in the middle:");
        myLinkedList.insertInLinkedList(25, 4);
        myLinkedList.traverseCSLL();

        //EXTRA: testing circularity of linked list
        System.out.println("Traversing 5 times");
        myLinkedList.traverseWithCircularProperties(5);
        System.out.println("Traversing 3 times");
        myLinkedList.traverseWithCircularProperties(3);


        //deleting from Linked List
        System.out.println("\nDeleting from list at the beginning:");
        myLinkedList.deleteFromLinkedList(0);
        myLinkedList.traverseCSLL();

        System.out.println("\nDeleting from list in the middle:");
        myLinkedList.deleteFromLinkedList(2);
        myLinkedList.traverseCSLL();

        System.out.println("\nDeleting from list at the end:");
        myLinkedList.deleteFromLinkedList(5);
        myLinkedList.traverseCSLL();

        //Delete whole Linked List
        System.out.println("\nDeleting complete Linked List:");
        myLinkedList.deleteLinkedList();
        myLinkedList.traverseCSLL();



    }
}
