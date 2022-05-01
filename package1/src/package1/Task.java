package package1;
import java.util.Scanner

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int num1, num2, i;
		int sum=0;
		System.out.println("entr the two digit number:");
		num1=sc.nextInt();
		while(num1>0) {
			num2=num1%10;
			sum=sum+num2;
			num1=num1/10;
		}
        System.out.println( "th sum of the two numbers s:"+sum );
        sc.close(0);
	}

}
