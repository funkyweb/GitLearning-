package youtube;
import java.util.Scanner;
public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int  temp = n;
//		while(n > 0) {
//			sum = sum + (n%10);
//			n = n/10;
//		}
//		System.out.println(sum);
		while(temp > 0) {
			int num = temp % 10;
			sum = sum*10 + num;
			temp = temp/10;
		}
		if(sum == n) {
			System.out.println(n + " is a Palandrome");
		}
		else 
			System.out.println(n + " is not palandrome");
	}

}
