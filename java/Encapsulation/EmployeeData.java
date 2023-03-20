package Encapsulation;

public class EmployeeData {

    public int Id;
    public String name;
    private int Salary;
//    EmployeeData(){
//        Id=10;
//        name = "Tester2";
//        Salary = 20000;
//    }
//
//
//    public static void main(String[] args) {
//        EmployeeData EmpData = new EmployeeData();
////        EmpData.Id = 001;
//        EmpData.name = "Tester";
//        EmpData.Salary = 30000;
//
//        System.out.println("Employee Id is " +EmpData.Id +"\n"+ "Employee Name is"+EmpData.name+"\n"+"Employee Salary is:"+EmpData.Salary);
//
//        System.out.println(EmpData.Id);
//        System.out.println(EmpData.name);
//        System.out.println(EmpData.Salary);


//    }



    public void setSalary(int Salary){
        this.Salary = Salary;

    }

    public int getSalary(){
        return  Salary;
    }
}
