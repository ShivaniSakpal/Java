import java.util.Scanner;
public class SecondLargest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n[]=new int[100];
        
        int max2=0;
        int index=0;
        System.out.println("Enter length of the array : ");
        int l=sc.nextInt();
        for(int i=0;i<l;i++)
        {
             System.out.println("Enter the element");
             n[i]=sc.nextInt();
        }
        int max=n[0];
        for(int i=1;i<n.length;i++)
        {
            if(n[i]>max)
            {
                max=n[i];
                index=i;
            }
        }
        if(max2==0)
        {
            for(int i=0;i<n.length;i++)
            {
                if(i!=index)
                {
                    if(n[i]>max2)
                    {
                        max2=n[i];
                    }
                }
            }
        }
        System.out.println("Maximum number is :" + max);
        System.out.println("2nd Maximum number is :" + max2);
        
    }
}