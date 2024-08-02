package code;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			char ch = 'A';
			for(int j=0;j<2*i+1;j++) {
				int num = 2*i+1;
				System.out.print(ch);
				if(j+1 > num/2)ch--;
				else ch++;
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
