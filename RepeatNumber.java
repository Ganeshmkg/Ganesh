package Ganesh;
import java.util.Scanner;
public class RepeatNumber {
	public static void main(String[] args) {
		int size=0;
		Scanner in=new Scanner(System.in);
		size=in.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int b=a.length;
		for(int j=0;j<b;j++){
			for(int k=j+1;k<b;k++){
				if(a[j]==a[k]){
					System.out.println(a[k]);
					for(int i=k;i<b-1;i++){ 
						a[i]=a[i+1];
						k--;
					    b--;
					    }
				}
			}
		}
	}
}
