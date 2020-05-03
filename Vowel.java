import java.util.Scanner;
public class Vowel
{
    public static void main(String args[])
    {
        char x;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character : ");
        x = s.next().charAt(0);
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
        {
            System.out.println("It is a vowel");
        }
        else if((x>='a'&&x<='z')||(x>='A'&&x<='Z'))
        {
            System.out.println("It is a consonant");
        }
        else
        {
            System.out.println("It is not an alphabet");
        }
    }
}