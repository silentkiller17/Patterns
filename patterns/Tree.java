package patterns;
import java.util.Scanner;
public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   int a;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of pyramids to be printed ");
      a=sc.nextInt();
      sc.nextLine();
      int[] array = new int[10];
            System.out.println("Enter sizes of "+a+"  pyramids ");
for(int i=0;i<a;i++){
    array[i]=sc.nextInt();
}
for(int x=0; x<array.length;x++)
{ int n=array[x];
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }            System.out.println();

    }
}
    }
}