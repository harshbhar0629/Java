
public class DS09Linkedlist1 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(3);
        list.insertAtHead(2);
        list.insertAtTail(4);
        list.insertAtIndex(1, 5); // 2 -> 5 -> 3 -> 4
        list.print();
        list.deleteByValue(5);
        list.print();
        list.reverse();
        list.print();
        System.out.println("Contains 3: " + list.contains(3));
        System.out.println("Size: " + list.size());

    }
}

class LinkedList {
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private int size;

    public void insertAtHead(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public void insertAtTail(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node cur = head;
            while (cur.next != null)
                cur = cur.next;
            cur.next = node;
        }
        size++;
    }

    public void insertAtIndex(int index, int value) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if (index == 0) {
            insertAtHead(value);
            return;
        }
        Node cur = head;
        for (int i = 1; i < index; i++)
            cur = cur.next;
        Node node = new Node(value);
        node.next = cur.next;
        cur.next = node;
        size++;
    }

    public boolean deleteByValue(int value) {
        if (head == null)
            return false;
        if (head.value == value) {
            head = head.next;
            size--;
            return true;
        }
        Node cur = head;
        while (cur.next != null && cur.next.value != value)
            cur = cur.next;
        if (cur.next == null)
            return false;
        cur.next = cur.next.next;
        size--;
        return true;
    }

    public int deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        if (index == 0) {
            int val = head.value;
            head = head.next;
            size--;
            return val;
        }
        Node cur = head;
        for (int i = 1; i < index; i++)
            cur = cur.next;
        int val = cur.next.value;
        cur.next = cur.next.next;
        size--;
        return val;
    }

    public boolean contains(int value) {
        Node cur = head;
        while (cur != null) {
            if (cur.value == value)
                return true;
            cur = cur.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void reverse() {
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void print() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.value);
            if (cur.next != null)
                System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }
}