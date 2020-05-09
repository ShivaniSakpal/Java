import java.util.Scanner;
public class LeapYear
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int year,count=0;
        System.out.println("Enter the present year : ");
        year = sc.nextInt();
        System.out.println("The next 20 leap years are :");
        while(count!=20)
        {
            if(((year%4==0)&&(year%100!=0)) || (year%400==0))
            {
                count++;
                System.out.println(year);
             }
            year++;        
        }   
    }
}