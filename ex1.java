import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x + y;
		
		System.out.println("A soma desses dois numeros é de: " + z);

		sc.close();
	}

}