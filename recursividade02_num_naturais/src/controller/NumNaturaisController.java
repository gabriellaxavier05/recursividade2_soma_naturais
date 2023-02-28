package controller;

public class NumNaturaisController {
	
	//criando a função recursiva
	public int somaNaturais(int n) {
		//condição de parada; caso base.
		if (n < 0) {
			return 0; //se n for menor do que zero, retorna-se 0 
		}
		else { //início da recursividade
			return 1 + somaNaturais(n-1); 
		}
	}
}
