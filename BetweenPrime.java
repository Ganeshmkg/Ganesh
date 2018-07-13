package Ganesh;
import java.util.Scanner;
public class BetweenPrime {
	public static void main(String[] args) {
		int a,b,c=0,d;
		System.out.println("Enter the interval:");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		for(int i=a+1;i<b;i++){
			for(int j=2;j<i;j++){
					c=i%j;
					if(c==0){
						break;
					}
				}
			if(c==1 || i==1 || i==2){
				System.out.print(i);
				}
			System.out.print(" ");
			}
		}
	}
