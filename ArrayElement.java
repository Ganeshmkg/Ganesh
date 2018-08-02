package Ganesh;
import java.util.Scanner;
public class ArrayElement {
	public static void main(String[] args) {
		int n,c=0,i=0,j=0;
		Scanner in=new Scanner(System.in);
	    n=in.nextInt();
		int b[]=new int[n],cnt=0,ct=0;
		for(i=0;i<b.length;i++){
			b[i]=in.nextInt();
		}
		for(i=0;i<b.length;i++){
			for(j=i+1;j<b.length;j++){
				if(b[i]==b[j]){
					cnt++;
				}
			}
			if(cnt==0){
				System.out.println(b[i]);
				i=j;
			}cnt=0;
		}
	}
}
