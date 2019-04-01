public class SwitchLabelRule{
	public static void main(String[] args){
		labelRule();	
	}

   	public static void labelRule()
	{
	   final int integer = 4;
	   System.out.println("Switch Expression with Arrows:");
	   final String numericString =
	      switch (integer)
	      {
		 case 1 -> "uno";
		 case 2 -> "dos";
		 case 3 -> "tres";
		 case 4 -> "quatro";
		 default -> "N/A";
	      };
	   System.out.println("\t" + integer + " ==> " + numericString);
	}
}
