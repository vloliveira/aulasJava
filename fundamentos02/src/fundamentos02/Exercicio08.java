package fundamentos02;

public class Exercicio08 {

	public static void main(String[] args) {
		int soma3 = 0, soma5=0, somaTotal = 0;
		for (int i = 1; i <=20; i++ ) {
			 if (i%3==0) {
				 soma3+=i;
			 }
			 if(i%5==0){
				 soma5+=i;
			 }			
		}
		somaTotal = soma3+soma5;
		
		System.out.printf("A soma dos múltiplos de 3 é: %d"
				+ ", a soma dos mútiplos de 5 é: %d"
				+ " e a soma de todos é %d", soma3, soma5, somaTotal);
	}
}
