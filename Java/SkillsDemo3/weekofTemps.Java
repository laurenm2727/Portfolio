import java.util.Scanner;

class weekofTemps {

	double[] temps = new double[7];


	public void setTemp()  {
		Scanner myInput = new Scanner(System.in);
		for (int i = 0; i < temps.length; i++) {

			System.out.println("Temperature for day " + (i + 1) + ":");
			temps[i] = myInput.nextDouble();
		}

	}

	
	public void printArray() {
		System.out.println("\nTemperatures for the week:\n");

		for (int i = 0; i < 7; i++) {

			System.out.println(+temps[i] + "°C");
		}
		System.out.println();
	}

	public void maxTemp() {
		double maxTemp = temps[0];

		for (int i = 1; i < temps.length; i++)
		 {
			if (temps[i] > maxTemp) {
				maxTemp = temps[i];

			}
		}
		System.out.println("The highest recorded temperature of the week was: " + maxTemp + "°C");

		myInput.close();
	}
}