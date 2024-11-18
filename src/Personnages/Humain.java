package Personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected Humain memoire[] = new Humain[30];
	protected int nbConnaissance = 0;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
		return;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
		return;
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			this.parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " a " + prix + " sous.");
			this.perdreArgent(prix);
		} else {
			this.parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir " + bien + "a " + prix + "sous.");
		}
		return;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
		return;
	}

	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
		return;
	}

	public void boire() {
		this.parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
		return;
	}
	
	private void repondre(Humain homme1) {
		this.direBonjour();
		memoriser(homme1);
	}
	
	private void memoriser(Humain homme1) {
		if (nbConnaissance < 30) {
			memoire[nbConnaissance] = homme1;
			nbConnaissance++;
		} else {
			for (int i = 0; i < 29; i++) {
				memoire[i] = memoire[i+1];
			}
			
			memoire[29] = homme1;
		}
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		
		autreHumain.repondre(this);
		
		this.memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		System.out.print("(" + this.nom + ") - " + "Je connais beaucoup de monde dont: ");
		
		for (int i = 0; i < nbConnaissance - 1; i++) {
			System.out.print(memoire[i].nom + ", ");
		}
		System.out.println(memoire[nbConnaissance - 1].nom);
	}

}
