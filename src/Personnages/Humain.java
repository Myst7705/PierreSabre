package Personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;

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
	
	public void gagnerArgent(int gain) {
		argent += gain;
		return;
	}
	
	public void perdreArgent(int perte) {
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
	
	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
		return;
	}

	public void boire() {
		this.parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
		return;
	}

}
