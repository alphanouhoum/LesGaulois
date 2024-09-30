package personnages;

public class Romain {
	private String nom;
	private int force;
	
	
	private boolean foceValide() {
		boolean forcevalide = true;
		if (force < 0) {
			forcevalide = false;
		}
		return forcevalide;
	}
	
	private boolean forcePositive() {
		boolean forcepositive = true;
		if (force <=0 ) {
			forcepositive = false;
		}
		return forcepositive;
	}
	

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert foceValide();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " :";
	}
	
	public void recevoirCoup(int forceCoup) {
		
		assert forcePositive();
		
		int forcedebut = force;
		force -= forceCoup;
		int forcefin = force;
		
		assert forcedebut > forcefin;
		if (force > 0) {
			
			parler("Aie");
			
		}else {
			parler("J'andonne...");
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		Romain obelix = new Romain("Obélix", 6);
		obelix.prendreParole();
		obelix.parler("je suis un romain");
		obelix.recevoirCoup(1);
		
		
		
	}
	
	
	
	
}
