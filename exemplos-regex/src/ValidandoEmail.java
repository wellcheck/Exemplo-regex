import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidandoEmail {

	public static void main(String[] args) {
		String[] emails = { "jose@jose.com", "maria@maria", "well@" };

		// Expressão regular utilizada para verificação de e-mail.
		Pattern parttern = Pattern.compile("\\w+@\\w+\\.\\w+");

		for (String email : emails) {
			Matcher matcher = parttern.matcher(email);
			if (matcher.matches()) {
				System.out.println(email + " É valido");
			} else {
				System.out.println("E-mail invalido!");
			}
		}

	}

}
