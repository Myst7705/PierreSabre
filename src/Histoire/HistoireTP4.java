package Histoire;
import Personnages.Humain;
import Personnages.Commercant;
import Personnages.Yakuza;
import Personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
		// Histoire humain
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
		
		// Histoire Commercant
//		Commercant marco = new Commercant("Marco", 20);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		
		// Histoire Yakuza
//		Commercant marco = new Commercant("Marco", 15);
//		Yakuza yaku = new Yakuza("Yaku le Noir", "Whisky", 30, "Konoha");
//		yaku.direBonjour();
//		yaku.extorquer(marco);
		
		// Histoire Ronin
//		Commercant marco = new Commercant("Marco", 15);
//		Ronin roro = new Ronin("Ronin", "shochu", 60);
//		roro.direBonjour();
//		roro.donner(marco);
		
		// Histoire Duel
		Ronin roro = new Ronin("Ronin", "shochu", 54);
		Yakuza yaku = new Yakuza("Yaku le Noir", "Whisky", 45, "Warsong");
		roro.provoquer(yaku);
		
	}
}
