class Test1{
public static void main(String[] args){
int n=153,r,temp, c=0;
temp=n;
System.out.println("number"+n);
while(n>0)
{
r=n%10;
n=n/10;
c=c+(r*r*r);
}
	
if(temp==c){
	System.out.println("armstrong number");
	}
	else{
	System.out.println("not armstrong number");
	}

}
}
