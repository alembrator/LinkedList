package linkedlist;

/**
 *
 * @author Alhaj Musa
 */
public class LinkedList<T> {

    Node head;

    //insert method: to insert an element at the end of the list
    public void insert(T name) {
        Node<T> node = new Node();
        node.data = name;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    //metod to print all elements in the linkedlist
    public void printAll() {
        Node<T> node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    //method to add an element at the begining of the linkedlist
    public void addFirst(T data) {
        Node<T> node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    //method to add an element at specific location
    public void insertAt(int index, T data) {
        Node<T> node = new Node();
        Node n = head;
        node.data = data;
        if (index == 0) {
            addFirst(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;

        }
    }

    public void deleteAt(int index) {
        Node n = head;
        Node n1, n2 = null;
        if (index == 0) {
            n2 = head;
            head = head.next;
            System.out.println("The deleted value is: " + n2.data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("The deleted value is: " + n1.data);
            n1 = null;
        }
    }
}
