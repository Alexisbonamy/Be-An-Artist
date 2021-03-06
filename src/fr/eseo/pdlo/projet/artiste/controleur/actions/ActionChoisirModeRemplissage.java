package fr.eseo.pdlo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.pdlo.projet.artiste.modele.Remplissage;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionChoisirModeRemplissage extends AbstractAction {
	// VARIABLE D'INSTANCE //
	private PanneauDessin panneauDessin;
	
	// CONSTRUCTEUR //
	public ActionChoisirModeRemplissage(PanneauDessin panneauDessin, Remplissage remplissage) {
		super(remplissage.getMode());
		this.panneauDessin = panneauDessin;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		switch (event.getActionCommand()) {
		
		case "Aucun" :
			panneauDessin.setModeRemplissageCourant(Remplissage.AUCUNE);
			break;
		
		case "Uniforme" :
			panneauDessin.setModeRemplissageCourant(Remplissage.UNIFORME);
			break;
			
		case "Bicolore" :
			panneauDessin.setModeRemplissageCourant(Remplissage.BICOLORE);
			break;
			
		default :
			break;
		}
	}

}
