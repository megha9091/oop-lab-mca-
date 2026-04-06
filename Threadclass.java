import java.util.Scanner;
class Multiplication extends Thread{
    @Override
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
class EvenNumber extends Thread
{
    @Override
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n:");
        int n=sc.nextInt();
        Even_N(n);
        sc.close();
    }
    static void Even_N(int n)
    {
        int i;
        System.out.println("Even numbers upto n");
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
public class Threadclass
{
public static void main(String[] args)
{
    Multiplication a= new Multiplication();
    EvenNumber b=new EvenNumber();
    a.start();
    b.start();
   
}
}


