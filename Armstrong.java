package Ganesh;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		int a,b,c,d=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=a;
		while(a>0){
			c=a%10;
			a=a/10;
			d=d+(c*c*c);
		}
		if(b==d){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
