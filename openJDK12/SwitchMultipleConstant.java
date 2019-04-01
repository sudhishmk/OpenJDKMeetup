public class SwitchMultipleConstant{
	public static void main(String[] args){
		multipleConstants();
	}
		
	public static void multipleConstants()
	{
	   final int integer = 6;
	   System.out.println("Multiple Case Labels:");
	   String numericString;
	   switch (integer)
	   {
	      case 0:
		 numericString = "zero";
		 break;
	      case 1, 3, 5, 7, 9:
		 numericString = "odd";
		 break;
	      case 2, 4, 6, 8, 10:
		 numericString = "even";
		 break;
	      default:
		 numericString = "N/A";
	   };
	   System.out.println("\t" + integer + " ==> " + numericString);
	}
}
