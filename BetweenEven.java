package Ganesh;
import java.util.Scanner;
public class BetweenEven {
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the interval:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		for(int i=a+1;i<b;i=i+1){
			if(i%2==0){
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}

}
