package code;

public class patternd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			int p = 1;
			for(int j=1;j<2*(4-i);j++) {
				System.out.print(p);
				p = 1-p;
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
