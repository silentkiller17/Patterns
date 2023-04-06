package patterns;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int m=4;
		//outer Loop
		for (int i = 1; i<=n; i++) {
			//inner loop
			for (int j = 1; j<=m; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
