package Ganesh;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		String a;
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		String reverse="";
		for(int i=a.length()-1;i>=0;i--){
			reverse=reverse+a.charAt(i);
		}
		System.out.print(reverse);
	}
}
