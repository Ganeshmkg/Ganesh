package Ganesh;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		int a,b,c=0,d;
		System.out.println("Enter the number:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		d=a;
		while(a>0){
			b=a%10;
			c=c*10+b;
			a=a/10;
		}
		if(c==d){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

}
