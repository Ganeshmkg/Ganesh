package Ganesh;
import java.util.Scanner;
public class NumberReverse {
	public static void main(String[] args) {
		int a,b,r=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		while(a>0){
			b=a%10;
			r=(r*10)+b;
			a=a/10;
		}
		System.out.println(r);
	}
}
