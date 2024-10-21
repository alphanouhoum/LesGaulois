package infrastucture;

import histoire.Trophee;
import personnages.Equipement;
import personnages.Gaulois;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee = 0;
	
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		if (nbTrophee < trophees.length) {
			trophees[nbTrophee] = equipement;
			nbTrophee++;
		}else {
			System.out.println("Tableau de trohee PLEIN !");
		}
	}

}

