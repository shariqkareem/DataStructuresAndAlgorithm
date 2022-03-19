package DataStructures.LinkedList.SinglyLinkedList;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee shariq) {
        EmployeeNode newHead = new EmployeeNode(shariq);
        newHead.setNext(head);
        head = newHead;
        System.out.println("List size : " + ++size);
        printList();
    }

    public void removeFromFront() {
        boolean isListEmpty = (head==null);
        printList();
        System.out.println("is list empty " + isListEmpty);
        if(isListEmpty)
            return;
        EmployeeNode removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        size--;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
