import java.util.Scanner;
public class SearchString
{
    public static void main(String[] args)
    {
      int i,j,pos=0;
      boolean state=false;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter number of elements in an array:"); 
      int num=s.nextInt();
      String word[]=new String[num];
      System.out.println("\n Enter"+num+"words");
      s.nextLine();
      for(i=0;i<num;i++)
      {
        word[i]=s.nextLine();

      }
      System.out.println("enter element to be searched:");
      String search=s.nextLine();
      for(i=0;i<num;i++)
      {
        if(word[i].equals(search))
        {
            pos=i+1;
            state=true;
            break;
        }
      }
      if(state)
      {
        System.out.println("Element found at position="+(pos));
      }
      else
      {
        System.out.println("element not found");
      }
    }
}
