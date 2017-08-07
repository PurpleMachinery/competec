package first;
import java.util.Scanner;
public class dias {
	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		int i=entrada.nextInt();
		while(i!=0) {
			i*=365;
			System.out.println(i);
			i=entrada.nextInt();
		}
	}
}
