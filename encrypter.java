import java.util.Scanner;
	public class encrypter{
	public static int encrypt(int n)
	{
	   int a = n / 1000;
	   int b = (n % 1000) / 100;
	   int c = (n % 100) / 10;
	   int d = n % 10;
	   a = (a + 7) % 10;
	   b = (b + 7) % 10;
	   c = (c + 7) % 10;
	   d = (d + 7) % 10;
	   return (c * 1000 + d * 100 + a * 10 + b); 
	   }
	public static int decrypt(int n)
	{
	   int a = n / 1000;
	   int b = (n % 1000) / 100;
	   int c = (n % 100) / 10;
	   int d = n % 10;
	 
	   a = (a + 3) % 10;
	   b = (b + 3) % 10;
	   c = (c + 3) % 10;
	   d = (d + 3) % 10;
	   return (c * 1000 + d * 100 + a * 10 + b);
	}

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	    int n;
	   System.out.println("Enter four-digit number: ");
	   n=sc.nextInt();
	   System.out.println("Encrypted number is: "+encrypt(n));
	   System.out.println("Number after encrypt-decrypt cycle is: "+decrypt(encrypt(n)));
	}
	}
