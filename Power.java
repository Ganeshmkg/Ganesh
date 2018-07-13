package Ganesh;
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		int a,b,sum=1;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		while(b!=0){
			sum=sum*a;
			b--;
		}
		System.out.println(sum);
	}
}
