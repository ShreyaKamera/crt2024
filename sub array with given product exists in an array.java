import java.util.*;
class Test 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        int i,res;
        for(i=0;i<n;i++)
        {
            res=1;
            for(int j=i;j<n;j++)
            {
                res=res*a[j];
                if(res==k)
                {
                    System.out.println("yes");
                    return;
                }
            }
        }
        if(i==n)
         System.out.println("no");
    }
}
