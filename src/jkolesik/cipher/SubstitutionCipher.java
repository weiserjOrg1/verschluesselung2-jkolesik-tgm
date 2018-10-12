package jkolesik.cipher;
import javax.swing.JOptionPane;

/**
 * Diese Klasse setzt das SecretAlphabet.
 * @author jkolesik
 * @version 10.10.2018
 */

public class SubstitutionCipher extends MonoAlphabeticCipher{
	/**
	 * Konstruktor der Klasse SubstitutionCipher.
	 * @param secretAlphabet übernimmt das zum Verschlüsseln benütigte SecretAlphabet
	 */
	
	public SubstitutionCipher(String secretAlphabet) {
		setSecretAlphabet(secretAlphabet);
	}
	
	/**
	 * Diese Methode setzt das secret Alphabet mit Hilfe der dazugehürigen Superklassenmethode.
	 * Referenz: MonoAlphabeticCipher -> setSecretAlphabet(text:String):void
	 */
	
	public void setSecretAlphabet(String secretAlphabet) {
		super.setSecretAlphabet(secretAlphabet);
	}
}