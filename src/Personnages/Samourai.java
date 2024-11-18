package Personnages;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String nom, String boissonFavorite, String seigneur, int argent) {
		super(nom, boissonFavorite, argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur " + seigneur + ".");
	}
	
	public void boire(String boisson) {
		this.parler("Qu'est ce que je vais choisir comme boisson? Tiens je vais prendre du " + boisson + ".");
	}
	
}
