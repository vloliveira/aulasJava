package fundamentos03;

public class exemplo01 {

	public static void main(String[] args) {
		String str = new String();
		String texto = " Hello mundo";
		
		str = texto.substring(2);
		str = texto.replace("l","w");
		str = texto.trim();
		char c = str.charAt(1);
		//System.out.println(3+3+" "+str.toUpperCase());
		System.out.println(c);		
	}
}