package ListaDeEmails;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FiltraLista {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/Users/12546446/Desktop/infra/Original.txt");
		// InputStream is = System.in;
		Scanner sc = new Scanner(is);

		PrintStream ps = new PrintStream("C:/Users/12546446/Desktop/infra/NoPadrao.csv");
		PrintStream ps1 = new PrintStream("C:/Users/12546446/Desktop/infra/ForaDoPadrao.txt");

		String linhaOriginal = "";
		String email = "";
		String nome = "";
		String masp = "";
		int posicaoDoTab = 0;
		int posicaoDoEspaco = 0;

		while (sc.hasNextLine()) {
			linhaOriginal = sc.nextLine();

			if (linhaOriginal.contains(".")) {
				posicaoDoTab = linhaOriginal.indexOf("\t");
				posicaoDoEspaco = linhaOriginal.indexOf(" ");
				email = linhaOriginal.substring(0, posicaoDoTab);
				masp = linhaOriginal.replaceAll("[^0-9]*", "");
				nome = linhaOriginal.substring(posicaoDoEspaco, linhaOriginal.length() - masp.length());
				nome = nome.trim().replaceAll("-", "");
				ps.println(email.trim() + "@hemominas.mg.gov.br;" + nome.trim() + ";" + masp + ";" + email.length());
			} else {
				ps1.println(linhaOriginal);
			}

		}

		sc.close();
		ps.close();
		ps1.close();
	}
}