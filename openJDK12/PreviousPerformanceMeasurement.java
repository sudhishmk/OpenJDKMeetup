public class PreviousPerformanceMeasurement {

	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		int add = new PreviousPerformanceMeasurement().add(10, 20);
		long now = System.currentTimeMillis();
		System.out.println("Seconds elapsed: " + (now-before)/1000F + " seconds." );
		System.out.println("Addition of 2 numbers = "+add);
	}
	
	public int add(int x, int y) {
		for(int i=0; i<=5000;i++) {
			System.out.println();
		}
		return x+y;
	}

}
