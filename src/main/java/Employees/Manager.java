package Employees;

public class Manager extends Employee {

    private String departmentName;
    public Manager(String name, int niNumber, double salary, String departmentName){
        super(name, niNumber, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName(){
        return this.departmentName;
    }

}
