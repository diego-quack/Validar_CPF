package entities;

import java.util.Scanner;

public class CPF {

	private Scanner input = new Scanner(System.in);
	private String cpf;
	private String cpfTeste;
	private int soma = 0;
	private int digitoUm = 0;
	private int digitoDois = 0;

	public CPF() {

	}

	public void inserirCPF() {
		System.out.print("Digite seu CPF(apenas números): ");
		cpf = input.nextLine();
	}

	public void calculoDigitoUm() {

		soma = 0;
		int i = 0;
		int j = 10;

		while (i < 9) {
			soma += (Integer.parseInt((cpf.charAt(i) + "")) * j);
			i++;
			j--;
		}

		digitoUm = (soma % 11);
		digitoUm = 11 - digitoUm;

		if (digitoUm > 9) {
			digitoUm = 0;
		}

		cpfTeste = cpf.substring(0, 9) + digitoUm;
	}

	public void calculoDigitoDois() {


		soma = 0;
		int i = 0;
		int j = 11;

		while (i < 10) {
			soma += (Integer.parseInt(cpf.charAt(i) + "") * j);
			i++;
			j--;
		}
		
		digitoDois = (soma % 11);
		digitoDois = (11 - digitoDois);
		
		if(digitoDois > 9) {
			digitoDois = 0;
		}
		cpfTeste += digitoDois;
	}
	
	public void mostrarCPF() {
		
		if(cpf.equals(cpfTeste)) {
			System.out.println("CPF: " + cpfTeste.substring(0, 9) + "-" + cpfTeste.substring(9, 11) + " - Válido!");
		}
		else {
			System.out.println("CPF: " + cpf.substring(0, 9) + "-" + cpf.substring(9, 11) + " - Inválido!");
		}
	}
}
