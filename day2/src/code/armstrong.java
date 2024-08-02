package code;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=500;i++) {
			if(arms(i))System.out.println(i);
		}
		

	}
	
	public static boolean arms(int n) {
		int x = n;
		int s = 0;
		while(n!=0) {
			int d = n%10;
			d = (int) Math.pow(d, 3);
			s += d;
			n /= 10;
		}
		return s == x;
		
	}

}
