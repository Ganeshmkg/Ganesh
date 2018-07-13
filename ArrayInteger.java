package Ganesh;
import java.util.Scanner;
public class ArrayInteger {
	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		System.out.println("Enter count of number:");
		int b,sum=0;
		b=in.nextInt();
		for(int i=1;i<=b;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
