package application;

import java.util.InputMismatchException;

import entities.CPF;

public class Validar_CPF_Teste {

	public static void main(String[] args) {
		
		CPF cpf = new CPF();
		
		try {
			cpf.inserirCPF();
			cpf.calculoDigitoUm();
			cpf.calculoDigitoDois();
			cpf.mostrarCPF();
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
	}
}
