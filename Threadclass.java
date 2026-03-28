import java.util.Scanner;
class Multiplication extends Thread{
    @override
    public void run()
    {
        System.out.println("Multiplication table of 5:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"x 5 ="+i*5 );
        }
            System.out.println("Exiting form thread multiplication");
    }
}
@override
public void run()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:" );
    int n=sc.nextInt();
    Even_N(n);
    sc.close();
}
static void Even_N(int n)
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter the limit");
    n=s.nextInt()
}