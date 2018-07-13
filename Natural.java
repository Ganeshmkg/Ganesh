package Ganesh;
import java.util.Scanner;
public class Natural {
	public static void main(String[] args) {
		int a,i,sum=0;
		System.out.println("Enter the number:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		for(i=1;i<=a;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
