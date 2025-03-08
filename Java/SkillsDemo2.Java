import java.util.Scanner;


class SkillsDemo2 {

	public static void main(String[]args) {

		System.out.println("Days in a week");
		for(int i = 1; i <=7; i = i +1){
			System.out.print(i + "," );}

		System.out.println(" ");


		for (int i = 1; i <=7; i = i + 1){

			int num;
			Scanner MyInput = new Scanner(System.in);
	
			System.out.println("\nMenu:");
			System.out.println("1 = Monday");
			System.out.println("2 = Tuesday");
			System.out.println("3 = Wednesday");
			System.out.println("4 = Thursday");
			System.out.println("5 = Friday");
			System.out.println("6 = Saturday");
			System.out.println("7 = Sunday");
			System.out.println("10 = Close");
			System.out.println("\nEnter a number between 1 to 7: \n");
			num = MyInput.nextInt();

			switch (num) {
			case 1:
			System.out.println("Today is Monday! ");
			break;
			case 2:
			System.out.println("Today is Tuesday! ");
			break;
			case 3:
			System.out.println("Today is Wednesday! ");
			break;
			case 4:
			System.out.println("Today is Thursday! ");
			break;
			case 5:
			System.out.println("Today is Friday! ");
			break;
			case 6:
			System.out.println("Today is Saturday! ");
			break;
			case 7:
			System.out.println("Today is Sunday! ");
			break;
			case 10:
			System.out.println("Press any key to close program\n");
			System.exit(0);
			break;
			default:
			System.out.println("Invalid - please enter 1 - 7 or 10\n"); i--;
			}

			
			System.out.println("\n*********************");

			}

	


		}}