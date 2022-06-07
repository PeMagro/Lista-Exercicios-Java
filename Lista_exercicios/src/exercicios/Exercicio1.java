package exercicios;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner prato = new Scanner(System.in);
		Scanner sobremesa = new Scanner(System.in);
		Scanner bebida = new Scanner(System.in);
		
		int caloriasPrato = 0;
		int caloriasSobremesa = 0;
		int caloriasBebida = 0;
		String nomePrato = "";
		String nomeSobremesa = "";
		String nomeBebida = "";
		
		// PRATO
		
		System.out.println("Digite o prato desejado: (1 - Vegetariano | 2 - Peixe | 3 - Frango | 4 - Carne)");
		int Prato = prato.nextInt();
		
		switch(Prato) {
		
		case 1: caloriasPrato = 180; nomePrato = "Vegetariano";
		
		case 2: caloriasPrato = 230; nomePrato = "Peixe";
		
		case 3: caloriasPrato = 250; nomePrato = "Frango";
		
		case 4: caloriasPrato = 350; nomePrato = "Carne";
		
		break;		
		
		}
		
		// SOBREMESA
		
		System.out.println("Digite a sobremesa desejada: (1 - Abacaxi | 2 - Sorvete diet | 3 - Mousse diet | 4 - Mousse chocolate)");
		int Sobremesa = sobremesa.nextInt();
		
		switch(Sobremesa) {
		
		case 1: caloriasSobremesa = 75; nomeSobremesa = "Acabaxi";
		
		case 2: caloriasSobremesa = 110; nomeSobremesa = "Sorvete diet";
		
		case 3: caloriasSobremesa = 170; nomeSobremesa = "Mousse diet";
		
		case 4: caloriasSobremesa = 200; nomeSobremesa = "Mousse chocolate";
		
		break;		
		
		}
		
		// BEBIDA
		
		System.out.println("Digite a bebida desejada: (1 - Chá | 2 - Suco de laranja | 3 - Suco de Melão | 4 - Refrigerante diet)");
		int Bebida = bebida.nextInt();
		
		switch(Bebida) {
		
		case 1: caloriasBebida = 20; nomeBebida = "Chá";
		
		case 2: caloriasBebida = 70; nomeBebida = "Suco de Laranja";
		
		case 3: caloriasBebida = 100; nomeBebida = "Suco de Melão";
		
		case 4: caloriasBebida = 65; nomeBebida = "Refrigerante diet";
		
		break;		
		
		}
		
		// RESULTADO
		
		int totalCalorias = caloriasPrato + caloriasSobremesa + caloriasBebida;
		
		System.out.println("O prato escolhido foi: " + nomePrato + " | sua caloria é de: " + caloriasPrato);
		System.out.println("O prato escolhido foi: " + nomeSobremesa + " | sua caloria é de: " + caloriasSobremesa);
		System.out.println("O prato escolhido foi: " + nomeBebida + " | sua caloria é de: " + caloriasBebida);
		
		System.out.println("O total de calorias foi de: " + totalCalorias);
		
	}

}
