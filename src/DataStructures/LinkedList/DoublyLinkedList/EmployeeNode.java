package DataStructures.LinkedList.DoublyLinkedList;

import java.util.Objects;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeNode that = (EmployeeNode) o;
        return Objects.equals(employee, that.employee) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, next);
    }

    public String toString() {
        return employee.toString();
    }
}
