package uri_iniciante_java;
/* 

Leia dois valores inteiros, no caso para vari�veis A e B. 
A seguir, calcule a soma entre elas e atribua � vari�vel SOMA. 
A seguir escrever o valor desta vari�vel.

ENTRADA:
O arquivo de entrada cont�m 2 valores inteiros.

SA�DA:
Imprima a mensagem "SOMA" com todas as letras mai�sculas, com um espa�o em branco antes e depois da igualdade seguido pelo valor correspondente � soma de A e B.
Como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri1003 {
	
	public static void main(String[] args) throws IOException {
	 
	 Scanner scan = new Scanner(System.in);
	 int a = scan.nextInt();
	 int b = scan.nextInt();
	 int soma = a + b;
     System.out.println("SOMA = "+ soma);
	}

}
