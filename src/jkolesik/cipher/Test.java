package jkolesik.cipher;

public class Test {
	public static void main (String[] args) {
		MonoAlphabeticCipher m1 = new MonoAlphabeticCipher();
		m1.setSecretAlphabet("qwertzuiopüasdfghjklöäyxcvbnmß");
		String newT = m1.encrypt("hallo");
		System.out.println(newT);
		System.out.println(m1.decrypt(newT));
	}
			
}	
