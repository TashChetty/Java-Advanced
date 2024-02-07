package Exercises.lesson5;

import Exercises.lesson5.Employee;

public class TestFinalReferenceObject {
    public static void main(String[] args) {


        final Employee emp = new Employee(1, "Jac", "gtb78", 2000);
        emp.setEmpId(100);
        //cannot cgange reference to a diff object -- emp1 is final
    }
}