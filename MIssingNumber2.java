import java.util.Scanner;
public class MissingNumber2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]={1,8,2,5,84,65,75,100,45,15};
        int flag;
        for(int i=1;i<=100;i++)
        {
            flag=0;
            for(int j=0;j<a.length;j++)
            {
                if(i==a[j])
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.println("Missing number is : " +i);
            }
        }
    }
}