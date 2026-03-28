import java.util.Scanner;
interface Calc
{
    void calculate();
}
class Bill implements Calc
{
    String pid,pname;
    int quantity;
    double price,total,amount=0;
    Scanner sc=new Scanner(System.in);
    public void getdata()
    {
        System.out.println("Enter product details");
        System.out.println("Product id:");
        pid=sc.nextLine();
        System.out.println("Product name:");
        pname=sc.nextLine();
        System.out.println("quantity:");
        quantity=sc.nextInt();
        System.out.println("Price:");
        price=sc.nextDouble();
    }
    public void calculate()
    {
        total=quantity*price;
    }
    public void display()
    {
        System.out.println(pid+"\t\t"+pname+"\t\t"+quantity+"\t\t"+price+"\t\t"+total);
    }
}
class Shop
{
    public static void main(String[] args)
    {
        int n,i,order_no;
        double namount=0;
        String date;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Bill Details");
        System.out.println("-------------------");
        System.out.println("Order no:");
        order_no=s.nextInt();
        System.out.println("Date:");
        date=s.next();
        System.out.println("No.of products:");
        n=s.nextInt();
        Bill ob[]=new Bill[n];
        for(i=0;i<n;i++)
        ob[i]=new Bill();
        for(i=0;i<n;i++)
        {
            ob[i].getdata();
            ob[i].calculate();
        }
        System.out.println("Oder No:"+order_no);
        System.out.println("Date:"+date);
        System.out.println("Productid         name         quantity       unitprice       total");
        System.out.println("===================================================================");
        for(i=0;i<n;i++)
        {
            ob[i].display();
            namount+=ob[i].total;
        }
        System.out.println("");
        System.out.println("\t\t\t\t\t \tNet amount \t"+namount);


        
    }
}