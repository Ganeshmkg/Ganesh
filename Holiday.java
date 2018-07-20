package Ganesh;
import java.util.Scanner;
public class Holiday {
	public static void main(String[] args) {
		String a;
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		String b=a.toLowerCase();
		if(b.equals("sunday") || b.equals("saturday")){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
