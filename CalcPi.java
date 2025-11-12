
public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args[0]);
		double currentValue = 0;
		int denominator = 1;

		for (int i = 0; i < N; i++){
			
			double fraction = 1.0 / denominator;

			if (i % 2 == 0) {currentValue = currentValue + fraction;
				
			} else if (i % 2 != 0) {currentValue = currentValue - fraction;

			} denominator = denominator + 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + currentValue*4);
	}
}
