// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

	    String inputLetter = args[1];
		inputLetter.equals("v");

		int Input = Integer.parseInt(args[0]);

		int count = 1;

		if (inputLetter.equals("v")) {

			for (int M = 1; M <= Input; M++){

		int N = M;
		count = 1;
				
		do {
			System.out.print(N + " ");
			if (N % 2 == 0) { N = N / 2;
				
			} else N = N * 3 + 1;

			count++;
		}

		while (N != 1);

		System.out.println(N + " (" + count +  ")");
			
			}
		System.out.println("");	
		System.out.println("Every one of the first " + Input + " hailstone sequences reached 1.");
			
		}

		else if (inputLetter.equals("c")) {
			for (int M = 1; M <= Input; M++){

			int N = M;
			count = 1;
				
			do {
				if (N % 2 == 0) { N = N / 2;
				
				} else N = N * 3 + 1;

				count++;
				}

			while (N != 1);
		}

		System.out.println("Every one of the first " + Input + " hailstone sequences reached 1.");
	}
}
}