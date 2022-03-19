package DataStructures.LinkedList.SinglyLinkedList;

import DataStructures.LinkedList.SinglyLinkedList.Employee;
import DataStructures.LinkedList.SinglyLinkedList.EmployeeLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee shariq = new Employee("Shariq", "Kareem", 21);
        Employee abishek = new Employee("Abishek", "Kirubas", 22);
        Employee nila = new Employee("Nila", "JayaKumar", 23);
        Employee merlin = new Employee("Merlin", "Arul", 20);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        //Add to front
        employeeLinkedList.addToFront(shariq);
        employeeLinkedList.addToFront(abishek);
        employeeLinkedList.addToFront(nila);
        employeeLinkedList.addToFront(merlin);

        // Remove from front
        employeeLinkedList.removeFromFront();
        employeeLinkedList.removeFromFront();
        employeeLinkedList.removeFromFront();
        employeeLinkedList.removeFromFront();
        employeeLinkedList.removeFromFront();

    }
}
