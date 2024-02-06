package lesson4;

import lesson4.Employee;

public class Manager extends Employee {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Manager(int empId, String name, String ssn, double salary, String dept) {
        super(empId, name, ssn, salary);
        deptName = dept;
    }

    @Override
    public String getDetails() {
        return super.getDetails () +
                " Dept: " + deptName;
    }

    @Override
    public String getAllDetails() {
        return super.getAllDetails() +
                " Dept: " + deptName;
    }
}

