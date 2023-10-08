package Cofrinho;

public class Euro extends Moeda{

	
	//Construtores
		public Euro() {
			
		}
		public Euro(double valor) {
			this.valor = valor;
		}
		
		
	//Métodos herdados da classe "Moeda"
	@Override
	public void info() {
		System.out.println("Moeda Euro: " + valor);
			
		}
	

	@Override
	public double converter() {
		return this.valor * 5.3; //cotação do euro aprox R$ 5,30
		
	}

}
