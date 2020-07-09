public class DuplicateArray{
public static void main(String[] args){
int[] arr=new int[]{2,2,4,6,7,8,5,8,3,4,7};
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]==arr[j]){  
System.out.println("dupilcate values are  "+arr[i]);

}

}
}
}
}