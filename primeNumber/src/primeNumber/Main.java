package primeNumber;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number = scan.nextInt();
		int remainder= number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Number is not prime");
			return;
		}
		if(number <1) {
			System.out.println("incorrect data");
		}
		
		for(int i=2; i<number; i++) {
			if(number % 2 ==0)
				isPrime=false;
		}
		if(isPrime) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
	}

}
