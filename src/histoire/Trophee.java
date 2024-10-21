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


	public String doonerNom() {
		return gaulois.getNom();
	}
	
	
	

}





