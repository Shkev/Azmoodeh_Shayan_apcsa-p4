public class Variables
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byteOne = 127;
		short shortOne = 5;
		int num = 10;
		long longOne = 9999999;

		//decimal variables
		float floatOne = 1.234f;
		double doubleOne = 1.222222222222222f;

		//other integer types
		char charOne = 'A';

		//other types
		boolean boolOne = true;
		String stringOne = "Hello World!";
		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("*16-bit - shortOne = "+shortOne+"\t\t*");
		System.out.println("*32-bit - intOne = "+num+"\t\t*");
		System.out.println("*64-bit - longOne = "+longOne+"\t*");
		System.out.println("\n*         Real Types            *\n");
		System.out.println("*32-bit - floatOne = "+floatOne+"\t*");
		System.out.println("*64-bit - doubleOne = "+doubleOne+"\t*");
		System.out.println("\n*         Other Integer Types           *\t\t\n");
		System.out.println("*16-bit - charOne = "+charOne+"\t\t*");
		System.out.println("\n*         Other Types           *\n");
		System.out.println("*BoolOne = "+boolOne+"\t\t\t*");
		System.out.println("*stringOne = "+stringOne+"\t*");
		System.out.println("///////////////////////////////");
	}
}
