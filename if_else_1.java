import java.util.Scanner;

public class if_else_1 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		num = sc.nextInt();
		
		if(num<0)
		{
			System.out.println("The number is -ve");
		}
		else if(num>0) {
			System.out.println("The number is +ve");
		}
		else {
			System.out.println("The number is zero");
		}
		

	}

}
