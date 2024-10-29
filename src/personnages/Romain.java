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
	
	

	public int getForce() {
		return force;
	}


	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " :";
	}
	
	public void sEquiper(Equipement equipement) {
		
		switch (nbEquipement) {
		case 2: {
			System.out.println("Le soldat " + nom + "est dejas bien protege !");
			break;
		}
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom +" possede dejas un " + equipement +"!");
			}else {
				equipements[1] = equipement;
				nbEquipement++;
				System.out.println("Le soldat "+nom+ " s'equipe avec un "+ equipement);
				
			}
			break;
		case 0:
			equipements[0] = equipement;
			nbEquipement++;
			System.out.println("Le soldat "+nom+ " s'equipe avec un "+ equipement);
			break;
			
			
		}
		
		
	}
	
	
//	public void recevoirCoup(int forceCoup) {
//		
//		assert forcePositive();
//		
//		int forcedebut = force;
//		force -= forceCoup;
//		int forcefin = force;
//		
//		
//		if (force > 0) {
//			
//			parler("Aie");
//			
//		}else {
//			parler("J'andonne...");
//		}assert forcedebut > forcefin;
//		
//		
//	}
	



	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force == 0) {
			parler("A�e");
		}else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");	
		}
	
		return equipementEjecte;
	}
	
	private int calculResistanceEquipement(int forceCoup) {
     String texte;
	    texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
	    int resistanceEquipement = 0;

	    if (nbEquipement != 0) {
	        texte += "\nMais heureusement, grace a mon aquipement sa force est diminu�e de ";

	        for (int i = 0; i < nbEquipement; i++) {
	            if (equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) {
	                resistanceEquipement += 8;
	            } else {
	                System.out.println("Equipement casque");
	                resistanceEquipement += 5;
	            }
	        }

	        texte += resistanceEquipement + "!";
	    }

	    parler(texte);
	    forceCoup -= resistanceEquipement;
	    return forceCoup;
	}
	
	
	private Equipement[] ejecterEquipement() {
	    Equipement[] equipementEjecte = new Equipement[nbEquipement];
	    System.out.println("L'�quipement de " + nom + " s'envole sous la force du coup.");

	    int nbEquipementEjecte = 0;

	    for (int i = 0; i < nbEquipement; i++) {
	        if (equipements[i] != null) {
	            equipementEjecte[nbEquipementEjecte] = equipements[i];
	            nbEquipementEjecte++;
	            equipements[i] = null;
	        }
	    }

	    return equipementEjecte;
	}

	

	public static void main(String[] args) {
		Romain obelix = new Romain("Ob�lix", 25);
		Romain minus = new Romain("Minus", 6);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
		
		
		
		
		
		
	}
	
	
	
	
}
