

		import java.util.Scanner;
		public class main {
			public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);
				
				double nota1, nota2, nota3, media;
				
				System.out.println("Digite a primeira nota: ");
				nota1 = leia.nextDouble();
				
				System.out.println("Digite a segunda nota: ");
				nota2 = leia.nextDouble();
				
				System.out.println("Digite a terceira nota: ");
				nota3 = leia.nextDouble();
				
				media = (nota1 + nota2 + nota3)/3;
				
				System.out.printf("Sua m�dia � : %.1f \n", media);
				
				if (media >= 7) {
					System.out.println("Voc� foi aprovado! :D ");
				} else if (media >= 5 && media < 7) {
					System.out.println("Voc� ficou de recupera��o! :| ");
				} else {
					System.out.println("Voc� foi reprovado! :( ");
				}
				
				leia.close();
			}
		}
