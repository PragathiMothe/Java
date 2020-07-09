public class SwappingDemo{

public static void main(String[] args){

		int z=10;
		int y=20;

		System.out.println("Before swapping a and b values " +z   +y);
		z=y+z;
		y=z-y;
		z=z-y;

		System.out.println("After swapping a and b values " +z  +y);


}


}