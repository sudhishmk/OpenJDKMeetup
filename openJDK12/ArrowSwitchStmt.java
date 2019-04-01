

public class ArrowSwitchStmt {

	public static void main(String[] args) {
		demonstrateEnhancedSwitchStatement();
	}
	public static void demonstrateEnhancedSwitchStatement()  
	{  
	   System.out.println("Enhanced Switch Statement:");  
	   final int integer = 2;  
	   String numericString;  
	   switch (integer)  
	   {  
	      case 1 -> numericString = "one";  
	      case 2 -> numericString = "two";  
	      case 3 -> numericString = "three";  
	      default -> numericString = "N/A";  
	   }  
	   System.out.println("\t" + integer + " ==> " + numericString);  
	}
}
