package Personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la?");
		this.parler(victime.getNom() + " si tu tiens a la vie donne moi ta bourse!");
		int victimeArgent = victime.getArgent();
		this.gagnerArgent(victimeArgent);
		
		victime.seFaireExtorquer();
		this.reputation++;
		
		this.parler("J'ai pique les " + victimeArgent + " sous de " + victime.getNom() +
				", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi! Hi!");
	}
}
