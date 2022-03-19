package DataStructures.LinkedList.DoublyLinkedList;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode newHead = new EmployeeNode(employee);
        newHead.setNext(head);

        if(head==null){
            tail = newHead;
        } else {
            head.setPrevious(newHead);
        }

        head = newHead;
        System.out.println("List size : " + ++size);
        printList();
    }

    public void addToEnd(Employee employee) {
        EmployeeNode newTail = new EmployeeNode(employee);
        newTail.setPrevious(tail);

        if(tail==null){
            head = newTail;
        } else {
            tail.setNext(newTail);
        }

        tail = newTail;
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

        if(head.getNext() == null){
            tail = null;
        } else{
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        removedNode.setNext(null);
    }

    public void removeFromEnd() {
        boolean isListEmpty = (tail==null);
        printList();
        System.out.println("is list empty " + isListEmpty);
        if(isListEmpty)
            return;
        EmployeeNode removedNode = tail;

        if(tail.getPrevious() == null){
            head = null;
        } else{
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        removedNode.setPrevious(null);
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <---> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
