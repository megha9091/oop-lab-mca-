class Product
{
    int pcode;
    String pname;
    Double price;
    double lowest;
    Product(int c,String n,double p)
    {
        pcode=c;
        pname=n;
        price=p;
    }

    void display()
    {
        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
    }

    void findlowest(double price1,double price2,double price3)
    {
        if(price1<price2&&price1<price3)
        {
            System.out.println("\n Product 1 is of the lowest price");
        }
        else if(price2<price1&&price2<price3)
        {
            System.out.println("product 2 is of the lowest price");
        }
        else
        {
            System.out.println("\n product 3 is of the lowest price");
        }   
    }
}
public class ProductDemo
{
    public static void main(String[] args)
    {
     Product ob1=new Product(101,"product_1", 100.00);
     Product ob2=new Product(102, "product_2", 128.40);
     Product ob3=new Product(103, "product_3", 790.00);
     System.out.println("Product information"); 
     System.out.println("____________________");
     System.out.println("product_code \t product_name \t product_price");
     ob1.display();
     ob2.display();
     ob3.display();
     ob1.findlowest(ob1.price,ob2.price,ob3.price);
    }
}