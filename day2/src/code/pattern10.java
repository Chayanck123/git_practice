package code;

public class pattern10 {

	public static void main(String[] args) {
		int n = 5;
		// TODO Auto-generated method stub
		for(int i=0;i<2*n;i++) {
			int star = i;
			if(i>n)star = 2*n -i;
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
