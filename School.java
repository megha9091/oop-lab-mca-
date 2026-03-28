import java.util.Scanner;
class Sports
{
    String sport;
    int rating;
    Sports(String sp,int rt)
    {
        sport=sp;
        rating=rt;
    }
}
class Student extends Sports
{
    String grade;
    double overall_per;
    Student(String sp,int rt,String gd,double per)
    {
        super(sp,rt);
        grade=gd;
        overall_per=per;
    }
}
class Result extends Student
{
    Result(String sp,int rt,String gd,double per)
    {
        super(sp, rt, gd, per);
    }
    void display()
    {
        System.out.println("\n Sports Details of Student");
        System.out.println("-------------------------------");
        System.out.println("Sport:"+sport);
        System.out.println("Rating:"+rating);
        System.out.println("\n Acadamic Details of student");
        System.out.println("--------------------------------");
        System.out.println("Acadamic grade:"+grade);
        System.out.println("Overall percentage:"+overall_per);

    }
}
class School
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sports details of student");
        System.out.println("Sport:");
        String s=sc.next();
        System.out.println("Sport rating out of 10:");
        int r=sc.nextInt();
        System.out.println("Enter the Acadamic Details of student");
        System.out.println("Acadamic grade(A-D):");
        String g=sc.next();
        System.out.println("Overall percentage:");
        double p=sc.nextDouble();
        sc.close();
        Result obj=new Result(s, r, g, p);
        obj.display();
        
    }
}