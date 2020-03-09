import java.util.Arrays;

public class References {
	int myRefVar1;
	String myRefString1;
	
	public References() {
		myRefVar1 = 7;
		myRefString1 = "apcsa";
	}
	public References(int i, String s) {
		myRefVar1 = i;
		myRefString1 = s;
	}
	public void refInts(int x, int y) {
		x = 4;			
	}
	public void refStrings(String x, String y) {
		x = "goodbye";
	}
	public void refArrays(int[] x, int[]y) {
		int[] z = x;
		x[1] = 111;
		z[2] = 222;
		
		int[] w = new int[5];
		w = y.clone();
		w[3] = 333;
	}
	public void refObjects(References x, References y) {
		References z = x;
		x = y;
		y = z;
		System.out.println(y.toString());
	}
	public String toString() {
		return "myRefVar1: " + myRefVar1 + ", myRefString1: " + myRefString1;
	}
	
	
	
	
	public static void main(String[] args) {
		
		References test = new References();
		
		//1. Method call with primitives
		int myX = 1;
		int myY = 2;
		test.refInts(myX, myY);
		System.out.println("x, y: " + myX + ", " + myY + "\n");
		
		//2. Method call with Strings
		String myStringX = "hello";
		String myStringY = "world";
		test.refStrings(myStringX, myStringY);
		System.out.println("myStringX, myStringY: " + myStringX + ", " + myStringY + "\n");

		//3. Method call with Arrays
		int[] myIntArrayX = {0,1,2,3,4};
		int[] myIntArrayY = {5,6,7,8,9};
		test.refArrays(myIntArrayX, myIntArrayY);
		System.out.println("myIntArrayX, myIntArrayY: " + Arrays.toString(myIntArrayX) + ", " + Arrays.toString(myIntArrayY) + "\n");
		

		//4, 5. test, test2 initialized object parameters
		References test2 = new References(123, "CCA");
		System.out.println(test);
		System.out.println(test2 + "\n");
		
		//6.  Moving test2 pointer
		References tmpTest2 = test2;
		tmpTest2 = test2;
		test2 = test;
		System.out.println(test2 + "\n");
		
		//7. Moving test2 pointer again
		test2 = tmpTest2;
		System.out.println(test2 + "\n");

		//8-10 Calling method
		test2.refObjects(test, test2);
		System.out.println(test);
		System.out.println(test2 + "\n");
	}
}