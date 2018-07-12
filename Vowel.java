package Ganesh;
import java.util.Scanner;
public class Vowel {
	public static void main(String[] arg){
		char b;
		System.out.println("Enter the letter:");
		Scanner in=new Scanner(System.in);
		b=in.next().charAt(0);
		String s=String.valueOf(b).toLowerCase();
		if(s.charAt(0)>96&&s.charAt(0)<123){
		if(s=="a" || s=="e" || s=="i" || s=="o" || s=="u" ){
			System.out.println("Vowel");
		}
		else{
			System.out.println("Consonant");
		}
	}
		 System.out.println("Invalid ");
	}
}
