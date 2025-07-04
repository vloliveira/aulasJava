package exerciciosPoo;

public class Retangulo {
	double largura;
	double altura;
	
	public Retangulo() {
		this.largura = 0.0;
		this.altura = 0.0;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
	public double calcularPerimetro() {
		return 2*(largura + altura);
	}

}
