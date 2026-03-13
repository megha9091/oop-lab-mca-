import java.util.Scanner;
class Employee
{
    int empid;
    String empname;
    float ta,da,hra,tax,basic,netsalary;
    void getdata()
    {
    Scanner var1 = new Scanner(System.in);

    System.out.println("enter employee id:");
    empid=var1.nextInt();

    System.out.println("enter employee name:");
    empname=var1.next();

    System.out.println("enter basic salary:");
    basic=var1.nextFloat();

    System.out.println("enter ta:");
    ta=var1.nextFloat();

    System.out.println("enter da:");
    da=var1.nextFloat();

    System.out.println("enter hra:");
    hra=var1.nextFloat();

    System.out.println("enter tax:");
    tax=var1.nextFloat();
    }
    void calc()
    {
        netsalary=(basic+ta+da+hra)-tax;
    }
    void display()
    {
        System.out.println("\n employee id:"+empid);
        System.out.println("\nemployee name:"+empname);
        System.out.println("\n net salary:"+netsalary);
    }

}
public class Empsal1
{
    public static void main(String[] args) 
    {
      Employee e=new Employee();
      e.getdata();
      e.calc();
      e.display();  
    }
}
 
