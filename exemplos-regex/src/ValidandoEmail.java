import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidandoEmail {

	public static void main(String[] args) {
		String[] emails = { "jose@jose.com", "maria@maria", "well@" };

		// Express�o regular utilizada para verifica��o de e-mail.
		Pattern parttern = Pattern.compile("\\w+@\\w+\\.\\w+");

		for (String email : emails) {
			Matcher matcher = parttern.matcher(email);
			if (matcher.matches()) {
				System.out.println(email + " � valido");
			} else {
				System.out.println("E-mail invalido!");
			}
		}

	}

}
