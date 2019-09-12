public class CircularDoubleLinkedListMain {

    public static void main(String[] args) {
        CircularDoubleLinkedList<Integer> dll = new CircularDoubleLinkedList(5);
        dll.traverseCDLL();

        dll.insertInLinkedList(10, 1);
        dll.traverseCDLL();

        dll.insertInLinkedList(20, 2);
        dll.traverseCDLL();

        dll.insertInLinkedList(30, 3);
        dll.traverseCDLL();

        dll.insertInLinkedList(40, 4);
        dll.traverseCDLL();


        System.out.println("\nSearching the node having value 40: ");
        dll.search(40);

        System.out.println("\n\nSearching the node having value 400: ");
        dll.search(400);


        System.out.println("\n\nLinked List in order");
        dll.traverseCDLL();
        System.out.println("Linked List in reverse order");
        dll.traverseCDLLInReverse();


        System.out.println("\n\nDeleting the node having location = 2: ");
        System.out.println("List before deletion: ");
        dll.traverseCDLL();
        dll.deleteFromLinkedList(2);
        System.out.println("List after deletion: ");
        dll.traverseCDLL();


        System.out.println("\n\nDeleting the node having location = 3: ");
        System.out.println("List before deletion: ");
        dll.traverseCDLL();
        dll.deleteFromLinkedList(3);
        System.out.println("List after deletion: ");
        dll.traverseCDLL();


        dll.deleteLinkedList();
        dll.traverseCDLL();
    }
}
