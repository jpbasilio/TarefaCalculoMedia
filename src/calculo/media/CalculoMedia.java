package calculo.media;
/**
 * 
 * @author joao
 *
 */

import java.util.Locale;
import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		
		calculandoMedia();
	}
	
	public static void calculandoMedia(){
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, md;
			
		System.out.print("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = ler.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4 = ler.nextDouble();
		
		
		md = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Média das Notas: " + md);
		
	}

}
