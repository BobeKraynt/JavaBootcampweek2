public class Main {

	public static void main(String[] args) {
		String mesaj = sehirVer();
		int toplam = topla(34, 65);

		System.out.println(mesaj);
		System.out.println(toplam);

	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
}
