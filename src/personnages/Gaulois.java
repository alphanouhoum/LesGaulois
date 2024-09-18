package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effePotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>") ;

	}
	
	private String prendreParole() {
		return "Le gaulois " + nom  + " :"; 
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grnad coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force/3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effePotion=" + effePotion + "]";
	}
		
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 10);
		
	}
	
	

}
