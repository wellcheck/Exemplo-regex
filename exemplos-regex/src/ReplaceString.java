
public class ReplaceString {

	public static void main(String[] args) {
		
		String texto = "O valor do produto � R$@xxxxxxxx@.";
		
		// Essa express�o regular permite substituir caracteres.
		String novoTexto = texto.replaceAll("@x+@", "2,30"); // Com o sinal de + � possivel susbstituir mesmo n�o sendo indentico.
		System.out.println(novoTexto);
	}

}
