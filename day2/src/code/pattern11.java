package code;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 0;
		int n = 5;
		for(int i=0;i<n;i++) {
			if(i%2==0)start = 1;
			else start = 0;
			for(int j = 0;j<=i;j++) {
				System.out.print(start);
				start = 1 - start;
			}
			System.out.println();
		}

	}

}
