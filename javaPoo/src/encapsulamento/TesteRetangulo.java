package encapsulamento;

public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo retangulo1 = new Retangulo(0,0);
		retangulo1.setAltura(2);
		retangulo1.setBase(2);
		
		double resultArea = retangulo1.caluloArea(retangulo1.getAltura(), retangulo1.getBase() );
		System.out.println(resultArea);
		
		double resultPerimetro = retangulo1.calcularPerimetro(retangulo1.getBase(), retangulo1.getAltura());
		System.out.println(resultPerimetro);
		
	}
}