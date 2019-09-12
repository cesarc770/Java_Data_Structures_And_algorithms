public class DoubleLinkedListMain {

    public static void main(String[] args) {

        DoubleLinkedList<Integer> dll = new DoubleLinkedList(5);
        dll.traverseDLL();

        dll.insertInLinkedList(10, 1);
        dll.traverseDLL();

        dll.insertInLinkedList(20, 2);
        dll.traverseDLL();

        dll.insertInLinkedList(30, 3);
        dll.traverseDLL();

        dll.insertInLinkedList(40, 4);
        dll.traverseDLL();


        System.out.println("\nSearching the node having value 40: ");
        dll.search(40);

        System.out.println("\n\nSearching the node having value 400: ");
        dll.search(400);


        System.out.println("\n\nLinked List in order");
        dll.traverseDLL();
        System.out.println("Linked List in reverse order");
        dll.traverseDLLInReverse();


        System.out.println("\n\nDeleting the node having location = 2: ");
        System.out.println("List before deletion: ");
        dll.traverseDLL();
        dll.deleteFromLinkedList(2);
        System.out.println("List after deletion: ");
        dll.traverseDLL();


        System.out.println("\n\nDeleting the node having location = 3: ");
        System.out.println("List before deletion: ");
        dll.traverseDLL();
        dll.deleteFromLinkedList(3);
        System.out.println("List after deletion: ");
        dll.traverseDLL();


        dll.deleteLinkedList();
        dll.traverseDLL();

    }
}
