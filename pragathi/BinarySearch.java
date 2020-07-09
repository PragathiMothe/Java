public class BinarySearch{
public static void main(String[] args){
	int array[]={10,20,30,40,50};
	int size=array.length;
	int low=0;
	
	int high=size-1;
	int value=30;
 	int mid=low+(low+high)/2;
 		while(low<=high){
			if(array[mid]==value){
				System.out.println(mid);
					break;
			}
			else if(array[mid]<value){
			low=mid+1;
			}
			else{
			high=mid-1;
			}
		}

	}
}
