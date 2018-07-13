package Ganesh;
import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		int a,count=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		while(a!=0){
			a=a/10;
			count++;
		}
		System.out.println(count);
	}
}
