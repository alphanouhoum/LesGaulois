package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] lesVillageois;
	
	
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		lesVillageois = new Gaulois[nbVillageoisMaximum];
	}

	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	
	

	public void ajouterHabitant(Gaulois gaulois) {
		lesVillageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant (int numId) {
		return lesVillageois[numId];
	}
	
	public void affichierVillageois() {
		System.out.println("Dans le village du chef "+ chef.getNom() +" vivent les légendaire gaulois :");
		for (int i = 0; i < lesVillageois.length; i++) {
			if (lesVillageois[i] != null) {
				System.out.println("- "+ lesVillageois[i]);
			}

		}
		
		
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductible", 30);
		
//		Gaulois gaulois = village.trouverHabitant(30); 
// 		Car l'indice 30 epasse l'indice max que peut contenir le tableau
		
		Chef chef = new Chef("Abraracourcix", 6 , village);
		village.setChef(chef);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
//		Gaulois gaulois = village.trouverHabitant(1);
		
//		System.out.println(village.trouverHabitant(1));
//		On a ce probleme car dans le village il n'y a qu'un seul habitant d'indice 0
		
		village.affichierVillageois();
		}
	
	
}
