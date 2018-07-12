package Ganesh;
import java.util.Scanner;
public class Positive {
	public static void main(String[] arg){
		int a;
		System.out.println("Enter the Integer:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if(a==0){
			System.out.println("Zero");
		}
		else if(a>=1){
			System.out.println("Positive");
		}
		else{
			System.out.println("Negative");
		}
	}

}
