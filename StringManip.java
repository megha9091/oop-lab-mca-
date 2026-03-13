import java.util.Scanner;
public class StringManip
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String str1=sc.nextLine();
        System.out.println("Length of string="+str1.length());
        System.out.println("character at 2nd position="+str1.charAt(1));
        System.out.println("string contains'ple' sequence:"+str1.contains("ple"));
        System.out.println("string ends with e:"+str1.endsWith("e"));
        System.out.println("Replace 'pp' with 'nk':"+str1.replaceAll("pp","nk"));
        System.out.println("lowercase:"+str1.toLowerCase());
        System.out.println("uppercase:"+str1.toUpperCase());
        System.out.println("index of 'e':"+str1.indexOf('e'));
        System.out.println("substring from index 2:"+str1.substring(2));
        System.out.println("enter 2nd string");
        String str2=sc.nextLine();
        System.out.println("string 1 concatenated with string 2:"+str1.concat(str2));

        
    }

    
}                            