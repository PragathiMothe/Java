class GCDDemo{
public static void main(String[] args){
int n1=20,n2=30,n3=45;
int gcd=1;
for(int i=1;i<=n1&&i<=n2&&i<=n3;i++){
if(n1%i==0&&n2%i==0&&n3%i==0){
gcd=i;
System.out.println("gcd of  "+n1+"  " +n2+"  "+n3+"  "  +gcd);
}
}
}
}