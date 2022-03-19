package DataStructures.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee shariq = new Employee("Shariq", "Kareem", 21);
        Employee abishek = new Employee("Abishek", "Kirubas", 22);
        Employee nila = new Employee("Nila", "JayaKumar", 23);
        Employee merlin = new Employee("Merlin", "Arul", 20);
        Employee js = new Employee("Jessie", "Js", 25);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        //Add to front
        employeeLinkedList.addToFront(shariq);
        employeeLinkedList.addToFront(abishek);
        employeeLinkedList.addToFront(nila);
        employeeLinkedList.addToFront(merlin);
        employeeLinkedList.addToEnd(js);

        // Remove from front
        employeeLinkedList.removeFromFront();
        employeeLinkedList.removeFromFront();
        employeeLinkedList.removeFromEnd();
        employeeLinkedList.removeFromFront();
        employeeLinkedList.removeFromFront();

    }
}
