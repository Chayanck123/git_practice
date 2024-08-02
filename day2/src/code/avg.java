package code;
import java.util.*;
public class avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=10;
		int s = 0;
		while(n!=0) {
			int a = sc.nextInt();
			s += a;
			n--;
		}
		System.out.println((double)s/10);
		sc.close();
	}

}
