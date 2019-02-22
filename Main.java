import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String text = readTextFromConsole();
		displayTextInTwoColumns(text);
	}

	private static String readTextFromConsole() {
		Scanner scanner= new Scanner(System.in);
		String text = scanner.nextLine();
		scanner.close();
		return text;
	}

	private static void displayTextInTwoColumns(String text) {
		for (int i = 0; i < text.length(); i++) {
			System.out.println(text.charAt(i) + "   " + text.charAt(i));
		}
	}
}
