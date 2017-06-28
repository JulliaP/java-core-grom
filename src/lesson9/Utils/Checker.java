package lesson9.Utils;

public class Checker {

	// Modificator dostupa = oblast' vidimosti
	// public
	// private - dostupen tol'ko vnutri klassa
	// default (package-private) = no any modifier;
	// protected - to zhe samoe chto i default, no eshjo dostupen i v
	// nasledstvennyx klassax

	// v porjadke vidimosti:
	// private
	// default
	// protected
	// public

	 private int companyNamesValidatedCount = 0;

	public boolean checkCompanyName(String companyName) {
		// if (companyName == "Google" || companyName == "Amazon")
		// return false;
		// return true;
		if (companyNamesValidatedCount > 10)
			return false;

		companyNamesValidatedCount++;
		// zamenili if na return, esli ne ravo = true, ravno =false
		return companyName != "Google" && companyName != "Amazon";
	}
}
