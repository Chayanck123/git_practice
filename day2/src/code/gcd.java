package code;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 98;
		int b = 56;
		int res = Math.min(a, b);
		while(res !=0) {
			if(a%res == 0 && b%res==0)break;
			res--;
		}
		System.out.println(res);
	}

}
