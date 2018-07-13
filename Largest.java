package Ganesh;
import java.util.Scanner;
public class Largest {
	public static void main(String[] args) {
		int a,b,c,d=0;
		System.out.println("Enter the Number:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a>=b && a>=c){
			System.out.println(a);
		}
		else if(b>=c && b>=a){
			System.out.println(b);
		}
		else{
			System.out.println(c);	
		}
	}
}
