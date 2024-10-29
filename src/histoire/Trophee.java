package histoire;

import personnages.Equipement;
import personnages.Gaulois;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
	
	
	public Trophee(Gaulois gaulois,Equipement equipement) {
		this.gaulois = gaulois;
		this.equipement = equipement;
		
	}


	public String donnerNom() {
		return gaulois.getNom();
	}
	
	public static void main (String[] args){
		Gaulois gaulois = new Gaulois("alpha", 8);
		Trophee kk = new Trophee(gaulois, Equipement.BOUCLIER);
		kk.donnerNom();
		
	}
	

}





