package Java;

import java.util.Scanner;


	class SkillsDemo {

		public static void main(String[]args) {

			String FName, LName;
			char Fn, Ln;
			int num1, num2, num3, Total;
			double Average;

				Scanner MyInput = new Scanner(System.in);


			System.out.println("Type First Name: ");
			FName = MyInput.next();
			Fn = FName.charAt(0);


			System.out.println("Type Last Name: ");
			LName = MyInput.next();
			Ln = LName.charAt(0);


			System.out.println("Type Number: ");
			num1 = MyInput.nextInt();
			System.out.println("Type Number: ");
			num2 = MyInput.nextInt();
			System.out.println("Type Number: ");
			num3 = MyInput.nextInt();

			System.out.println("*****************");
			System.out.println("*****************");

			System.out.println( Fn+ "," +Ln);
			System.out.println("Your Numbers: " +num1+"," +num2+ ","  +num3+" ");

				Total = num1 + num2 + num3;

			System.out.println( "The Total is: " +Total);

				Average = (Total)/3;


			System.out.println("The Average is: " +Average);

        MyInput.close();





		}}

        