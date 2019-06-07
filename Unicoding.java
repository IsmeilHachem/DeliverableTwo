import java.util.Scanner;

public class Unicoding {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		
		int strUni1 = 0;
		int strUni2 = 0;
		int finalAnswer = 0;
		int count = 0;
		
				
		System.out.print("Please enter your first string: ");
		str1 = scan.nextLine();
		
		System.out.print("Please enter your second string: ");
		str2 = scan.nextLine();
		
		while(count < str1.length()) {
			System.out.print(str1.charAt(count) + " " + (int)str1.charAt(count) + "\n");
			strUni1 = strUni1 + (int)str1.charAt(count); count++;
		}
		count = 0;
		while(count < str2.length()) {
			System.out.print(str2.charAt(count) + " " + (int)str2.charAt(count) + "\n");
			strUni2 = strUni2 + (int)str2.charAt(count); count++;
		}
				
		finalAnswer = Math.abs(strUni1 - strUni2);
		System.out.print("The total unicode value of string 1 is: " + strUni1 + "\nThe total unicode value of string 2 is: " + strUni2 + "\nThe absolute value of the difference is: " + finalAnswer);
	}

}


