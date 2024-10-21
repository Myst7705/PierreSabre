package Personnages;

public class Commercant extends Humain {
	// super = la classe mere
	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}
	
	
	public int seFaireExtorquer() {
		this.perdreArgent(this.getArgent());
		this.parler("J'ai tout perdu! Le monde est trop injuste...");
		return 0;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent + " sous! Je te remercie genereux donateur.");
		return;
	}

}
