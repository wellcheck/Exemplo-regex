
public class SplintString {

	public static void main(String[] args) {
		
		String texto = "Java é uma linguagem orientada a objetos.";

		String[] palavras = texto.split(" ");
	
		for(String palavra: palavras) {
			System.out.println(palavra);
		}
	}

}
