import java.util.*;
class Demo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int k=s.nextInt();
int low=0,high=a.length-1;
while(low<high)
{
if(a[low]+a[high]==k)
{
System.out.println(low+" "+high);
return;
}
if(a[low]+a[high]>k)
{
high--;
}
else
low++;
}
}
}
