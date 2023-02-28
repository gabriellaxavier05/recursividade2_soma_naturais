package view;

import controller.NumNaturaisController;

public class PrincipalNumNaturais {
	
	public static void main (String[] args) {
		//instanciando a classe controller e criando um objeto
		NumNaturaisController nm = new NumNaturaisController();
		
		//atribuindo
		int n = 10;
	
		//chamando a função recursiva
		int soma = nm.somaNaturais(n);
		System.out.println("Somatório: " +soma);
		
	}
}
