package application;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Computador;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Computador> lista = new ArrayList<>();
		
		int n = lerInteiro(sc, "Quantos computadores deseja cadastrar? ");
		
		if (n == 1){
			System.out.println("Você vai cadastra " + n + "computador ");
		}
		else {
		System.out.println("Você vai cadastrar " + n + " computadores");
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Computador #" + i);
			String nome = lerTexto(sc, "Nome: ");
			String processador = lerTexto(sc, "Processador: ");
			int ramGb = lerInteiro(sc, "RAM (GB): ");
			int discoGb = lerInteiro(sc, "Disco (GB): ");

			Computador pc = new Computador(nome, processador, ramGb, discoGb, LocalDateTime.now());
			lista.add(pc);
		}
		
		System.out.println();
		System.out.println("=== COMPUTADORES CADASTRADOS ===");
		for (Computador c : lista) {
			System.out.println(c);
		}
		
		int totalRam = 0;
		Computador menosRam = lista.get(0);

		for (Computador c : lista) {
			totalRam += c.getRamGB();
			if (c.getRamGB() < menosRam.getRamGB()) {
				menosRam = c;
			}
		}

		System.out.println();
		System.out.println("Total de RAM: " + totalRam + " GB");
		System.out.println("Menor RAM: " + menosRam.getName() + " (" + menosRam.getRamGB() + " GB)");
		
		sc.close();
	}
	
	private static String lerTexto(Scanner sc, String mensagem){
		while (true) {
			System.out.print(mensagem);
			String entrada = sc.nextLine().trim();
			if (!entrada.isEmpty()) {
				return entrada;
			}
			System.out.println("Erro: este campo não pode ficar vazio.");
		}
	}
	
	
	
	private static int lerInteiro(Scanner sc, String mensagem) {
		while (true) {
			System.out.print(mensagem);
			String entrada = sc.nextLine().trim();
			try {
				int valor = Integer.parseInt(entrada);
				if (valor <= 0) {
					System.out.println("Erro: digite um número maior que zero.");
					continue;
				}
				return valor;
			} catch (NumberFormatException e) {
				System.out.println("Erro: '" + entrada + "' não é um número válido. Tente novamente.");
			}
		}
	}
}