public class InsertAtTheEnd {
    static Node head;

    public static void main(String[] args) {
        // Creating the list 1.2.4.5
        head = null;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        Node node = insertAtTheEnd(new Node(6), head);


        printList(node);

    }

    private static void printList(Node node) {

        Node ptr = node;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    public static Node insertAtTheEnd(Node newNode, Node head) {

        Node ptr = head;

        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = newNode;

        return head;

    }

    /* Node Class */
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }
}
