import java.util.Arrays;
import java.util.Scanner;
public class SortString
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String StrElement;
        System.out.println("Enter the number of Strings:");
        int n=s.nextInt();
        s.nextLine();
        String Str[]=new String[n];
        System.out.println("Enter the  strings:");
        for(int i=0;i<n;i++)
        {
            Str[i]=s.nextLine();

        }
        Arrays.sort(Str);
        System.out.println("\n Sorted strings:");
        for(String word:Str)
        {
            System.out.println(word);
        }
        s.close();
    }
    
}
