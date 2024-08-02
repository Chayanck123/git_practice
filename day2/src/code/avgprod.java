package code;
import java.util.*;
public class avgprod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int f = 0;
		int s = 0;
		int p = 1;
		while(f==0) {
			System.out.println("Enter q to exit the loop");
			char c = sc.next().charAt(0);
			if(Character.isDigit(c)) {
				s += c - '0';
				p *= c - '0';
			}
			else {
				f = 1;
			}
		}
		System.out.println(s + " " + p);
		sc.close();

	}

}
