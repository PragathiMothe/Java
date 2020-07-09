class Book
{
static int i=10;
public static void main(String[] args)
{
Test t=new Test();
System.out.println(t.i);
System.out.println(Test.i);
System.out.println(i);
}
}