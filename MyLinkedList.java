public class MyLinkedList {
    //instance variables
    private Node head;
    private int size;

    //Not Necessary
    public MyLinkedList() {
        size = 0;
    }
    // APPEND
    public void append(int element) {
        if (head == null) {
            head = new Node(element);
            return;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new Node(element));
    }
    // APPEND AT INDEX

    //Making a Node
    public class Node {
        private Node next;
        private int element;

        public Node(int element) {
            this.element = element;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node n) {
            next = n;
        }
    }
}