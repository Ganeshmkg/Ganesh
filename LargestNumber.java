package ASDF;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		int a,v;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int b[]=new int[a],max=b[0];
		for(int i=0;i<a;i++){
			b[i]=in.nextInt();
		}
		for(int i=0;i<a;i++){
			for(int j=i+1;j<a;j++){
				if(b[i]<b[j]){
					v=b[i];
					b[i]=b[j];
					b[j]=v;
				}
			}
		}
		for(int i=0;i<a;i++){
			System.out.print(b[i]);
		}
	}

}
