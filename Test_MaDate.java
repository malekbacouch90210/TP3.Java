import java.util.Scanner;
public class Test_MaDate {

	public static void main(String[] args) {
		MaDate d1=new MaDate(25,8,2012);
		MaDate d2=new MaDate(11,2,2022);
		MaDate d3=new MaDate(2017);
		d1.setJour(7);
		d2.setMois(4);
		d3.setAnnee(2018);
		System.out.println("date1 :"+d1);
		System.out.println("date2 :"+d2);
		System.out.println("date3 :"+d3);
	
		System.out.println("menu");
		System.out.println("1-Ajout d'un jour");
		System.out.println("2-Ou ajout de plusieurs jours");
		System.out.println("3-Ajout d'un mois");
		System.out.println("4-Ajout d'une annee");
		Scanner s=new Scanner(System.in);
		int c = s.nextInt();
		switch(c){
			case 1:
				d1.ajouterJour();
				break;
			case 2:
				System.out.println("combien du jour ?");
				int n = s.nextInt();
				d1.ajouterPluseursjour(n) ;
				
			
				break;
			case 3:
				d1.ajouterUnmois();
				break;
			case 4:
				d1.ajouterUnannee();
				break;
			default:
				System.out.println("pas de modification");
		}
		System.out.println("apres modification :"+d1);
	}
		
}