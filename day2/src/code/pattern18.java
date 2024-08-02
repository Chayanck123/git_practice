package code;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
			for(int ch = 'E'- i;ch <= 'E';ch++) {
				System.out.print((char)ch);
			}
			System.out.println();
		}
	}

}
