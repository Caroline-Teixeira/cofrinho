package Cofrinho;

public class Real extends Moeda{

	//Construtores
	public Real() {
		
	}
	public Real(double valor) {
		this.valor = valor;
	}
	
	
	//Métodos herdados da classe "Moeda"
	@Override
	public void info() {
		System.out.println("Moeda Real: " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor;
		
	}
	


}
