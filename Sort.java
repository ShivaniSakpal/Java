import java.util.Scanner;
import java.util.Arrays;
public class Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int temp=0;
        System.out.println("Enter length of an array  : ");
        int l = sc.nextInt();
        int n[] = new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.println("Enter the number :");
            n[i]=sc.nextInt();
        }
        System.out.println("Enter the order \n1.Ascending Order\n2.Descending Order");
        int op=sc.nextInt();
        
        //Ascending Order
        if(op==1)      
        {
            Arrays.sort(n);
            System.out.println("Sorted array : ");
            //System.out.println(Arrays.toString(n));
            for(int i=0;i<l;i++)
            {
                System.out.print(n[i]+"\t");
            }
        }
        
        //Descending Order
        else if(op==2)
        {
            //Shortcut method ---> Arrays.sort(n, Collections.reverseOrder()); Import collections class above
            for(int i=0;i<l;i++)
            {
                for(int j=i+1;j<l;j++)
                {
                  if(n[i]<n[j])
                  {
                      temp=n[i];
                      n[i]=n[j];
                      n[j]=temp;
                  }
                }
                   
            }
            System.out.println("Sorted array : ");
            for(int i=0;i<l;i++)
            {
                System.out.print(n[i]+"\t");
            }                
        }
        else
        {
            System.out.println("Incorrect option");
        }
        
    }
}