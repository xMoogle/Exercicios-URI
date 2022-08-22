package uri_iniciante_java;

/*
 

Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno.
A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
Considere que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.

Entrada:
O arquivo de entrada cont�m 3 valores com uma casa decimal, de dupla precis�o (double).

Sa�da:
Imprima a mensagem "MEDIA" e a m�dia do aluno conforme exemplo abaixo, com 1 d�gito ap�s o ponto decimal e com um espa�o em branco antes e depois da igualdade.
Assim como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".

 */

import java.util.Scanner;
import java.io.IOException;

public class Uri1006 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;
		System.out.println(String.format("MEDIA = %.1f", MEDIA));
	}
}
