import java.util.Scanner;
public class ReverseString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s, rev="";
        System.out.println("Enter a string");
        s=sc.nextLine();
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse String : "+rev);
    }
}