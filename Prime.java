public class Prime
{
    public static void main(String args[])
    {
        int i,num=0;
        System.out.println("Prime numbers between 100 to 1000 are :");
       
        int low=100, high=1000;
        while(low<high)
        {
            boolean flag=false;
            for(i=2;i<=low/2;++i)
            {
                if(low%i==0)
                {
                    flag=true; //Number is not Prime if flag is true
                    break;
                }  
            }
            if(!flag)
            {
                System.out.println(low);
            }
            low++;
        }
    }
}