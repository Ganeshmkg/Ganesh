package Ganesh;
import java.util.Scanner;
public class Even {
	public static void main(String[] arg){
		int a;
		System.out.println("Enter the number:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if(a>0){
		if(a%2==0){
			System.out.println("Even Number");
		}
		else if(a%2!=0){
			System.out.println("Odd Number");
		}
	}
		else if(a<0){
			System.out.println("Invalid");
		}
	}
}
