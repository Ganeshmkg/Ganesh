package Ganesh;
import java.util.Scanner;
public class Prime {
	public static void main(String[] arg){
		int a,c=0,i=0,b=0;
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		while(a>1){
			b=a;
			for(i=2;i<b;i++){
				c=b%i;
				if(c==0){
					System.out.println("No");
                 }
				break;
				}
			if(c==1){
			    System.out.println("Yes");
			    }
			break;
	       }
		}
}
