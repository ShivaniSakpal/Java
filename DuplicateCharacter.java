import java.util.Scanner;
public class DuplicateCharacter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String s;
        int l;
        System.out.println("Enter a string");
        s=sc.nextLine();
        l=s.length();
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    System.out.println("Duplicate charater is : " + s.charAt(i));
                }
            }
        }
    }
}