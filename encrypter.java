import java.util.Scanner;

public class pivowar_pa1{
	
	public static void main(String args[]) {
		
		int number, encryptedNum, digit1, digit2, digit3, digit4;
		
		System.out.println("Enter a four digit number: ");
		Scanner scnr = new Scanner(System.in);
		
		number = scnr.nextInt();
		digit1 = (number / 1000 + 7) % 10;
        digit2 = (number % 1000 / 100 + 7) % 10;
        digit3 = (number % 100 / 10 + 7) % 10;
        digit4 = (number % 10 + 7) % 10;
        encryptedNum = (digit1 * 10) + digit2 + (digit3 * 1000) + (digit4 * 100);
        System.out.println("Encrypted number is: " + encryptedNum);
		
	}

}
