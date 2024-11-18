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
	
	public void provoquer(Yakuza adversaire) {
		int force = 2 * this.honneur;
		
		if (force >= adversaire.getReputation()) {
			this.parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand!");
			this.gagnerArgent(adversaire.getArgent());
			honneur++;
			this.parler("Je t'ai eu petit Yakuza.");
			adversaire.perdre();
		} else {
			honneur--;
			int argentPerdu = this.getArgent();
			this.perdreArgent(argentPerdu);
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argentPerdu);
		}
	}
}
