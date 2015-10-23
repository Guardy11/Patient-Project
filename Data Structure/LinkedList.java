class Node {
    Node next;
    int num;
    public Node(int val) {
        num = val;
        next = null;
    }
}			
public class LinkedList {
    Node head;
    public LinkedList(int val) {
        head = new Node(val);
    }
    public void append(int val) {
        Node tmpNode = head;
        while (tmpNode.next != null) {
            tmpNode = tmpNode.next;
        }
        tmpNode.next = new Node(val);
    }
    public void insert(int val) {
        Node currentNode = head;
        Node nextNode = head.next;
        if (currentNode.num > val) {
            Node tmpNode = head;
            head = new Node(val);
            head.next = tmpNode;
            return;
        }
        if (nextNode != null && nextNode.num > val) {
            currentNode.next = new Node(val);
            currentNode.next.next = nextNode;
            return;
        }
        while (nextNode != null && nextNode.num < val) {
            currentNode = nextNode;
            nextNode = nextNode.next;
        }
        currentNode.next = new Node(val);
        currentNode.next.next = nextNode;
    }
    public void delete(int val) {
        Node prevNode = null;
        Node currNode = head;
        if (head.num == val) {
            head = head.next;
            return;
        }
        while (currNode != null && currNode.num != val) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        if (currNode == null) {
            System.out.println("A node with that value does not exist.");
        }
        else {
            prevNode.next = currNode.next;
        }
    }
    public void print() {
        Node tmpNode = head;
        while (tmpNode != null) {
            System.out.print(tmpNode.num + " -> ");
            tmpNode = tmpNode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(5);
        myList.append(7);
        myList.append(16);
        myList.insert(9);
        myList.insert(4);
        myList.insert(6);
        myList.insert(17);
        myList.delete(16);
        myList.delete(5);
        myList.delete(4);
        myList.delete(17);
        myList.delete(34);
        myList.print();
    }
}