import java.util.Scanner;

public class vucutKitleIndeks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Boyunuzu metre cinsinden giriniz: ");
		double boy = sc.nextDouble();
		
		System.out.print("Kilonuzu giriniz: ");
		double kilo = sc.nextDouble();
		
		double kitleIndeks = kilo / (boy * boy) ;
		
		System.out.print("Vücut kitle indeksiniz: " + kitleIndeks);
		
		
	}

}
