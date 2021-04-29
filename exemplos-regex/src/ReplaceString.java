
public class ReplaceString {

	public static void main(String[] args) {
		
		String texto = "O valor do produto é R$@xxxxxxxx@.";
		
		// Essa expressão regular permite substituir caracteres.
		String novoTexto = texto.replaceAll("@x+@", "2,30"); // Com o sinal de + é possivel susbstituir mesmo não sendo indentico.
		System.out.println(novoTexto);
	}

}
