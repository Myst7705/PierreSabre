package Histoire;

import Personnages.Humain;
import Personnages.Commercant;
import Personnages.Yakuza;
import Personnages.Ronin;
import Personnages.Samourai;
import Personnages.Traitre;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Akimoto", "saké", "Miyamoto", 80);
		Traitre masako = new Traitre("Masako", "whisky", "Miyamoto", 100);
		
		/*
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi); 
		
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("the");
		*/
		
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		
		akimoto.faireConnaissanceAvec(masako);
		
		masako.ranconner(kumi);
		masako.faireConnaissanceAvec(yaku);
		
		
		masako.listerConnaissance();
		masako.faireLeGentil();
		
		masako.faireConnaissanceAvec(roro);
		
		
	}

}
