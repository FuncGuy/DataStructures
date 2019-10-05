public class LinkedList {

    private static Node head;

    public static <T> LinkedList insert(LinkedList list, T data) {

        // create a node with the given data
        Node new_node = new Node(data);

        // check if the list head is null if it is set head to new node

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList list){

        Node temp_node = list.head;

        while(temp_node != null){
            System.out.println(temp_node.data);
            temp_node = temp_node.next;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list = insert(list, "hello");
        list = insert(list, "world");
        
        printList(list);
    }

    static class Node<T> {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }
}
