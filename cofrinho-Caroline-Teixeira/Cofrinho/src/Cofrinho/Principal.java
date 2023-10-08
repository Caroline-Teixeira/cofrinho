package Cofrinho;

public class Principal {

	public static void main(String[] args) {
		//Aluna: Caroline Francieli Teixeira
		//RU: 1035263
		
		Menu m = new Menu();  //Classe Menu
		m.fecharPrograma = false;
	
		while (true) {  //Laço do menu principal
			
			m.exibirMenu(); //Método da classe Menu
			
			if (m.fecharPrograma) {  //encerra o programa. 
				break;
			}
		}

	}

}
