package uri_iniciante_java;
/* 

Leia dois valores inteiros, no caso para variáveis A e B. 
A seguir, calcule a soma entre elas e atribua à variável SOMA. 
A seguir escrever o valor desta variável.

ENTRADA:
O arquivo de entrada contém 2 valores inteiros.

SAÍDA:
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.
Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
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
