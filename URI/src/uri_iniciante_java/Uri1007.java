package uri_iniciante_java;

import java.util.Scanner;

/*
 Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
 
Entrada:
O arquivo de entrada cont�m 4 valores inteiros.

Sa�da:
Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade.
 */

public class Uri1007 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		
		System.out.println("DIFERENCA = " + (A*B - C*D));
	}

}
