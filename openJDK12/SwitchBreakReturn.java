public class SwitchBreakReturn{
	public static void main(String [] args){
		switchBreak();
	}

	public static void switchBreak()
	{
	   final int integer = 1;
	   System.out.println("Switch Expression with Colons/Breaks:");
	   final String numericString =
	      switch (integer)
	      {
		 case 1 :
		    break "uno";
		 case 2 :
		    break "dos";
		 case 3 :
		    break "tres";
		 default :
		    break "N/A";
	      };
	   System.out.println("\t" + integer + " ==> " + numericString);
	}
}
