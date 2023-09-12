package projeto;
import java.util.Scanner;

public class Aula9Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] notasDaAmandaCristina = new int [4];
		
		System.out.println("Insira a nota 1 da Amanda Cristina");
		notasDaAmandaCristina[0] = ler.nextInt();
		
		System.out.println("Insira a nota 2");
		notasDaAmandaCristina[1] = ler.nextInt();
		
		System.out.println("Insira a nota 3");
		notasDaAmandaCristina[2] = ler.nextInt();
		
		System.out.println("Insira a nota 4");
		notasDaAmandaCristina[3] = ler.nextInt();
		
		System.out.println("Notas da aluna Amanda Cristina");
		System.out.println("Português: " + notasDaAmandaCristina[0]);
		System.out.println("Matemática: " + notasDaAmandaCristina[1]);
		System.out.println("Ciências: " + notasDaAmandaCristina[2]);
		System.out.println("História: " + notasDaAmandaCristina[3]);

	}

}
