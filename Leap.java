package Ganesh;
import java.util.Scanner;
public class Leap {
	public static void main(String[] args) {
		int a;
		System.out.println("Enter the Year:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if(a%4==0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
