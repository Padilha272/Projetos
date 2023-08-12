package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if((i%3==0)&&(i%5==0)) {
				System.out.println(i+ ": FizzBuzz");
			}else if(i%3==0) {
				System.out.println(i+ ": Fizz");
			}else if(i%5==0) {
				System.out.println(i+": Buzz");
			}else {
				System.out.println(i+ ": i");
			}
		}
		
		
		
		sc.close();
	}

}
