package Ganesh;
import java.util.Scanner;
public class Hello {
	public static void main(String[] args){
		String a="Hello";
		System.out.println("Enter the Count:");
		Scanner in=new Scanner(System.in);
		int b=in.nextInt();
		for(int i=1;i<=b;i++) 
		System.out.println(a);
	}
}