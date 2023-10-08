package Cofrinho;

public class Dolar extends Moeda{

	//Construtores
	public Dolar () {
		
	}
	
	public Dolar (double valor) {
		this.valor = valor;
	}
	
	//Métodos herdados da classe "Moeda"
	
	@Override
	public void info() {
		System.out.println("Moeda Dólar: " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor * 4.9;  //cotação do euro aprox R$ 4,90
		
	}
	

}
