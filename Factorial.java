package Ganesh;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int a,b=1;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		for(int i=1;i<=a;i++){
			b=b*i;
			}
		System.out.println(b);
	}

}
