import java.util.Scanner;
public class Decimal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int dec,rem;
        String x="";
        System.out.println("Enter the decimal number to be converted to binary :");
        dec = sc.nextInt();
        while(dec>0)
        {
            rem=dec%2;
            x = rem + " " +x; 
            dec=dec/2;
        }
        System.out.println("Binary : " +x);
    }
}