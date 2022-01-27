package NotOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int matNot, fizikNot, kimyaNot, turkceNot, tarihNot, muzikNot;
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Matematik notunuzu girin:  ");
		matNot = scanner.nextInt();
		
		System.out.println("Fizik notunuzu girin:  ");
		fizikNot = scanner.nextInt();
		
		System.out.println("Kimya notunuzu girin:  ");
		kimyaNot = scanner.nextInt();
		
		System.out.println("Türkçe notunuzu girin:  ");
		turkceNot = scanner.nextInt();
		
		System.out.println("Tarih notunuzu girin:  ");
		tarihNot = scanner.nextInt();
		
		System.out.println("Müzik notunuzu girin:  ");
		muzikNot = scanner.nextInt();
		
		double notOrtalamasi = (matNot + fizikNot + kimyaNot + turkceNot + tarihNot + muzikNot) / 6 ;
		System.out.println("Not ortalamanýz: " + notOrtalamasi);
		
		System.out.println(notOrtalamasi > 60 ? "Sýnýfý geçtiniz" : "Sýnýfta kaldýnýz");
		
		
	}

}
