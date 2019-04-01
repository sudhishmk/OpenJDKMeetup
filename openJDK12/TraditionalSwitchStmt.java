public class TraditionalSwitchStmt {

	public static void main(String[] args) {
		demonstrateTraditionalSwitchStatement();
	}

	public static void demonstrateTraditionalSwitchStatement()  
	{  
	   System.out.println("Traditional Switch Statement:");  
	   final int integer = 3;  
	   String numericString;  
	   switch (integer)  
	   {  
	      case 1 :  
	         numericString = "one";  
	         break;  
	      case 2 :  
	         numericString = "two";  
	         break;  
	      case 3:  
	         numericString = "three";  
	         break;  
	      default:  
	         numericString = "N/A";  
	   }  
	   System.out.println("\t" + integer + " ==> " + numericString);  
	}
}
