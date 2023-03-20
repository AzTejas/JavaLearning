package Encapsulation;

public class EmployeeTest {

    public static void main(String[] args) {


        EmployeeData EmpData = new EmployeeData();
//        EmpData.getSalary();
        EmpData.setSalary(500000);
        System.out.println(EmpData.getSalary());

    }
}
