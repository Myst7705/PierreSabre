package Personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise = 0;
	
	public Traitre(String nom, String boissonFavorite, String seigneur, int argent) {
		super(nom, boissonFavorite, seigneur, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mais je suis un traitre et mon niveau de traitrise est: "
		+ niveauTraitrise + ". Chut!");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = (int) (argentCommercant * (2.0/10.0));
			
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			
			niveauTraitrise++;
			
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne moi " 
					+ argentRanconner + " sous ou gare a toi!");
			commercant.parler("Tout de suite grand " + this.getNom() + ".");
		} else {
			this.parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me demasquer.");
		}
	}
	
	public void faireLeGentil() {
		if (this.nbConnaissance < 1) {
			this.parler("Je ne peux faire ami ami avec personne car je ne connais personnes! Sniff.");
		} else {
			Random random = new Random();
			Humain ami = this.memoire[random.nextInt(this.nbConnaissance)];
			int don = (int) (this.getArgent() * (1.0/20.0));
			
			String nomAmi = ami.getNom();
			this.parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " 
					+ nomAmi + ".");
			this.parler("Bonjour l'ami! Je voudrais vous aider en vous donnant " +
					 don + " sous.");
			
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			
			ami.parler("Merci " + this.getNom() + ". Vous etes quelqu'un de bien.");
			
			this.niveauTraitrise--;
		}
	}
}
