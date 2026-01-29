class StudentDemo
{
    void demo()
    {
        System.out.println("Creating 2 classes");
    }
}
class Student
{
    public static void main(String args[])
    {
        StudentDemo s=new StudentDemo();
        s.demo();
    }
}