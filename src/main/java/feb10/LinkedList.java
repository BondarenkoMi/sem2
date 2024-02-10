package feb10;

public class LinkedList implements List {
    Node head = new Node();
    Node current = new Node();
    int size = 0;

    @Override
    public void add(Integer e) throws EmptyElementException {
        if (e == null) throw new EmptyElementException();
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        node.next = new Node(e);
        size++;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        Node node = head;
        if (index >= size) throw new IndexOutOfBoundsException();
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        size--;
    }

    @Override
    public Integer pop() {
        Node node = head;
        for (int i = 0; i < size - 1; i++) {
            node = node.next;
        }
        Integer s = node.next.value;
        node.next = null;
        size--;
        return s;
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index >= size) throw new IndexOutOfBoundsException();
        Node node = head;
        for (int i = 0; i <= index; i++) {
            node = node.next;
        }
        return node.value;
    }

    @Override
    public int size() {
        return size;
    }
}
