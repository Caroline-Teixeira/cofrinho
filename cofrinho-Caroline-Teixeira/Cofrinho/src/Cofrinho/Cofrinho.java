package Cofrinho;

import java.util.ArrayList;

public class Cofrinho { 

	//Array - coleção de moedas
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>(); 
	
	
	//Métodos
	public void adicionar (Moeda moeda) {
		this.listaMoedas.add(moeda);
		 	
	}
	
	public void remover (Moeda moeda) {
		this.listaMoedas.remove(moeda);
	
	}
	
	public void listagemMoedas() {
		if (this.listaMoedas.isEmpty()) { //se o cofrinho estiver vazio
			System.out.println("O cofrinho está vazio!");
			return;
		}
		
		
		for (Moeda m: this.listaMoedas) { //se o cofrinho contém moedas
			 m.info();
		 }
		
	}
	public void totalConvertido() {  //para conversão
		double totalc = 0;
		for (Moeda m: this.listaMoedas) {
			 totalc += m.converter();
		 }
		System.out.printf("O total convertido para real(R$) = %.2f " , totalc );
		System.out.printf("\n");
	}
	
}
