package code;
import java.util.*;
public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = sc.nextInt();
		double p = ((double)a/t)*100;
		System.out.printf("per: %.2f%%",p);
		System.out.println();
		char c = sc.next().charAt(0);
		if(p<75.0 && c=='n')System.out.println("Not");
		else System.out.println("Allowed");
		
		sc.close();

	}

}
