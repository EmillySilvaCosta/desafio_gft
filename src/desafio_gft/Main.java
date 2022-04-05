package desafio_gft;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		programaAnalise();
	}

//questao 1
	public static void pessoa() {
		//questao 1
		//criado as variaveis 
	int idade = 0;
	float altura = 0;
	float peso = 0;
	int qtPessoas = 10;
	int media= 0;
	int count = 0;
	
	Scanner entrada = new Scanner(System.in);
	//recebendo os dados das 10 pessoas
	for(int i=0; i<=10; i++) {
		System.out.println("Olá, digite sua idade:");
	     idade = entrada.nextInt();
		System.out.println("Digite sua altura:");
		altura = entrada.nextFloat();
		System.out.println("Digite seu peso:");
		peso = entrada.nextFloat();
		//armazeno o resultado em uma variavel
	}
	//teste
	System.out.println( idade + altura + peso);
	//se idade for igual a 20
	//for (idade == 20) {
		//mostre pessoas com essa idade
		//se pessoas com idade igual ou maior que 50
		if(idade >= 50) {
			//qtPessoas
		}
	//}
	//quantidade de pessoas com mais de 50 anos
	
//	for (altura )
//	if(altura >= 10 || altura >= 20) {
//		}
	}
//questao 2

	public static void ordemAlfa() {
		// questao 2 programa que receba duas letras
		String letras;
		String ordemAlfabetica;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor, digite duas letras:");
		letras = entrada.next();
		//para ordem alfabetica 
		for (ordemAlfabetica = "a"; ordemAlfabetica <= "z"; ordemAlfabetica++) {
			if (letras != ordemAlfabetica) {
				System.out.println("Não está em ordem algabetica");
			} else {
				System.out.println("Está em ordem alfabetica.");
			}
		}

	}
	// questao 3

	public static void mercadinhoUbiratan()
	{

		float moedas;
		float cedulas;

	}

//questao 4
	public static void programaAnalise(){

     String letra;
	 String consoante;
	 String vogal;

	// public String vogal = ['a', 'e', 'i', 'o', 'u'];

	// se a letra digita for igual ao caracter a ou
	if(letra== "a"||letra== "e"||letra== "i"||letra== "o"||letra== "u")
	{
		System.out.println("Você digitou vogais." + vogal);
	}else
	{
		System.out.println("Você digitou consoantes." + consoante);
	}
	}
}
