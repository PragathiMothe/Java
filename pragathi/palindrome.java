class Palindrome{
public static void main(String[] args){
                String cha="madam";
		int length=cha.length();
		String rev="";
		for(int i=length-1; i>=0;i--){
		rev=rev+cha.charAt(i);		
		}
	System.out.println(rev);
	System.out.println(cha);
	if(cha.equals(rev)){
	System.out.println("Given String is Palindrome");
	}
	else{
	System.out.println("Given String is not Palindrome");
        }
}
}