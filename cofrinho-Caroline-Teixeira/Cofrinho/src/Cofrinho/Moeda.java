package Cofrinho;

public abstract class Moeda{
	protected  double valor;
	
	
	//Get e Set
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	//Métodos
	public abstract void info();
	public abstract double converter();
	
	
	//Sobreposição da função "equals" do java
	@Override
	public boolean equals (Object objeto) {    
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Moeda m = (Moeda) objeto;
		
		if (this.valor != m.valor) {
			return false;
		}
		return true;
	}
		
	
}
