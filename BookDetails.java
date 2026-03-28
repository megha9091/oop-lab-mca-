import java.util.Scanner;
class Publisher
{
    String pubName;
    Publisher(String pub)
    {
        pubName=pub;
    }
}
class Book extends Publisher
{
    String book;
    Book(String pub,String bk)
    {
        super(pub);
        book=bk;
    }
}
class Literature extends Book{
    String category;
    Literature(String pub,String bk,String ctgry)
    {
        super(pub,bk);
        category=ctgry;
    }
    void display()
    {
        System.out.println("Publisher:"+pubName);
        System.out.println("Book:"+book);
        System.out.println("category:"+category);
    }
}
class Fiction extends Book{
    String category;
    Fiction(String pub,String bk,String ctgry)
    {
        super(pub,bk);
        category=ctgry;
    }
    void display()
    {
        System.out.println("Publisher:"+pubName);
        System.out.println("Book:"+book);
        System.out.println("category:"+category);
    }
}
public class BookDetails
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in); 
        System.out.println("enter literature book details");
        System.out.println("book name");
        String b=s.nextLine();
        System.out.println("publisher");
        String pub=s.nextLine();
        System.out.println("Category");
        String c=s.nextLine();
        Literature ob1=new Literature(pub,b,c);

        System.out.println("enter fiction book details");
        System.out.println("Book name");
        String b1=s.nextLine();
        System.out.println("Publisher");
        String p1=s.nextLine();
        System.out.println("category");
        String c1=s.nextLine();
        Fiction ob2=new Fiction(p1,b1,c1);

        System.out.println("\n** Literature Book**");
        System.out.println("-------------------------");
        ob1.display();

        System.out.println("\n**Fiction Book**");
        System.out.println("--------------------");
        ob2.display();
        s.close();
    }
}