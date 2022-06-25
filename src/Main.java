import java.util.Scanner;
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Qual é o dia de 1 a 7: ");
			int x = sc.nextInt();
			String dia;
			if (x == 1) {
				dia = "Domingo";
			}
			else if (x == 2) {
				dia = "Segunda";
			}
			else if (x == 3) {
				dia = "Terca";
			}
			else if (x == 4) {
				dia = "Quarta";
			}
			else if (x == 5) {
				dia = "Quinta";
			}
			else if (x == 6) {
				dia = "Sexta";
			}
			else if (x == 7) {
				dia = "Sábado";
			}
			else {
				dia = "Valor Inválido";
			}
			System.out.println("Dia da semana: " + dia);
			sc.close();
		}
	}