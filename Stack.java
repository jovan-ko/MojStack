public class Stack<T> {
    private class Node<T> {
        private T data;
        private Node next;

        public Node(T data1) {
            data = data1;
            next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    Node<T> top;

    public Stack() {
        top = null;
    }

    public boolean empty() {
        return top == null;
    }

    public void push(T data) {
        Node<T> push = new Node<>(data);
        push.next = top;
        top = push;
    }

    public T pop() {
        T value = top.data;
        top = top.next;
        return value;
    }

    public T peek() throws NullPointerException {

        return top.data;
    }

    public void clear() {
        top = null;
    }


    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();
        Node<T> printNode = top;
        while(!(printNode == null)) {
            print.append(printNode + " ");
            printNode = printNode.next;
        }

        return print.toString();
    }
}
