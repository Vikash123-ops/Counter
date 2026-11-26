class Employee{
    int empno;
    String empname;
    float empsal;
    Employee(){
        empno=50;
        empname="Vikash";
        empsal=1000f;
    }
    void displayDetails(){
        System.out.println("employee number "+empno);
        System.out.println("employee name "+empname);
        System.out.println("employee salary "+empsal);
    }
}
public class EmpDetail{
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.displayDetails();
    }
}