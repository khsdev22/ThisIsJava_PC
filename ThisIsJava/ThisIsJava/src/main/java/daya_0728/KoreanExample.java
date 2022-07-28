package daya_0728;

public class KoreanExample {
	
	public static void main(String[] args) {
		Korean k1 = new Korean("ºòÀÚ¹Ù", "010-7553-5128");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("±èÀÚ¹Ù", "010-7553-5127");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
