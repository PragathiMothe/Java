public class Armstrong
{
public static void main(String[] args)
{
int c=0,r=0;
int n=153;
int temp=n;
System.out.println("n=="+n);
while(n>0)
{
r=n%10;
n=n/10;
c=c+(r*r*r);
}
if(temp==c)
{
System.out.println("Armstrong number");
}
else
System.out.println("not a Armstrong number");
}
}
