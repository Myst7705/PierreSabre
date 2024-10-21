package Personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentDonne = this.getArgent() / 10;
		parler(beneficiaire.getNom() + " prend ces " + argentDonne + " sous.");
		this.perdreArgent(argentDonne);
		beneficiaire.gagnerArgent(argentDonne);

		beneficiaire.parler(argentDonne + " sous! Je te remercie genereux donateur.");
		return;
	}
}
