class ReverseLinkedList {

    static Node head;

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

    public Node reverse(Node node) {
        //HINT::
        //inorder to reverse a list just a find out next and prev nodes
        //and finally make head point to the last node
        Node prev = null;
        Node next = null;
        Node curr = node;

        while (curr != null) {
            next = curr.next; // found next
            curr.next = prev; // make curr.next = null
            prev = curr; // wherever curr is pointing assign that to prev
            curr = next; // wherever next is pointing assign that to current
        }

        node = prev; // finally make last node in the list as head of node
        return node;

    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
