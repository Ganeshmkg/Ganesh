package Ganesh;
import java.util.Scanner;
public class Alphabets {
	public static void main(String[] arg){
		char s;
		System.out.println("Enter the Letter:");
		Scanner in=new Scanner(System.in);
		s=in.next().charAt(0);
		String a=String.valueOf(s).toLowerCase();
		if(a.charAt(0)>=96 && a.charAt(0)<=123){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
