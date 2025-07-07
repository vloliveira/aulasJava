package encapsulamento;

public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = 0;
		this.altura = 0;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}
	
	public double caluloArea(double base, double altura) {
		return base*altura;
	}
	
	public double calcularPerimetro(double base, double altura) {
		return 2*(altura+base);
	}

}
