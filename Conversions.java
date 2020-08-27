import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {
		int randomlyGenerated = (int)(Math.random() * 1000);
		System.out.println("The randomly generated number is " + randomlyGenerated + ".");
		pause(randomlyGenerated);
	}
	
	public static void pause(int randomlyGenerated) {
		System.out.println("Press enter to view the answers!");
		Scanner input = new Scanner(System.in);
		if (input.nextLine().contentEquals("")){
			resume(randomlyGenerated);}
		else {
			pause(randomlyGenerated);
		}
		input.close();
	}
	
	public static void resume(int randomlyGenerated) {
		binaryConversion(randomlyGenerated);
		hexadecimalConversion(randomlyGenerated);
	}
	
	public static void binaryConversion(int decimal) {
		String output = "";
		
		while (decimal > 0) {
			output = (decimal % 2) + output;
			decimal = ((decimal - (decimal % 2)) / 2) ;
		}
		
		System.out.println("Binary conversion: " + output);
	}
	
	public static void hexadecimalConversion (int decimal) {
		String[] array = new String[(int) (decimal/16)];
		String output = "";
		int i = 0;
		
		while (decimal > 0) {
			array[i] = hexadecimalEvaluation(decimal % 16);
			decimal = ((decimal - (decimal % 16)) / 16) ;
			i++;
		}
		
		for (int j = i ; j > 0; j--) {
			output = output + array[j - 1];
		}
		
		System.out.println("Hexadecimal conversion: " + output);
	}
	
	public static String hexadecimalEvaluation (int number) {
		switch (number){
		case 10:
			return "A";
		case 11:
			return "B";
		case 12:
			return "C";
		case 13:
			return "D";
		case 14:
			return "E";
		case 15:
			return "F";
		default:
			return String.valueOf(number);
		}
	}

}