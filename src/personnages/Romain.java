package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	
	private boolean foceValide() {
		boolean forcevalide = true;
		if (force < 0) {
			forcevalide = false;
		}
		return forcevalide;
	}
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];
		assert foceValide();
	}
	
	private boolean forcePositive() {
		boolean forcepositive = true;
		if (force <=0 ) {
			forcepositive = false;
		}
		return forcepositive;
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
	
	public void sEquiper(Equipement equipement) {
		if (equipements[0] != null && equipements[1] != null) {
			System.out.println("Le soldat " + nom + "est déjas bien protégé !");
		}
		else if (equipements[0] != null && equipements[1] == null) {
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom +" possède déjas un " + equipement +"!");
			}
			
		}else {
			equipements[nbEquipement]  = equipement;
			nbEquipement++;	
			System.out.println("Le soldat "+nom+ "s'équipe avec un "+ equipement);
		}
		
	}
	
	public void recevoirCoup(int forceCoup) {
		
		assert forcePositive();
		
		int forcedebut = force;
		force -= forceCoup;
		int forcefin = force;
		
		
		if (force > 0) {
			
			parler("Aie");
			
		}else {
			parler("J'andonne...");
		}assert forcedebut > forcefin;
		
		
	}
	
	public static void main(String[] args) {
		Romain obelix = new Romain("Obélix", 25);
		Romain minus = new Romain("Minus", 6);
		System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		
		
		
	}
	
	
	
	
}
