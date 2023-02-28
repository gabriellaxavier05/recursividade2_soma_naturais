package controller;

public class NumNaturaisController {
	
	//criando a fun��o recursiva
	public int somaNaturais(int n) {
		//condi��o de parada; caso base.
		if (n < 0) {
			return 0; //se n for menor do que zero, retorna-se 0 
		}
		else { //in�cio da recursividade
			return 1 + somaNaturais(n-1); 
		}
	}
}
