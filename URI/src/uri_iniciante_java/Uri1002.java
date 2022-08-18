package uri_iniciante_java;

import java.io.IOException;
import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		double pi = 3.14159;
		double r = scan.nextDouble();
		double a = (r * r) * pi;
		System.out.println(String.format("A=%.4f", a));

	}

}
