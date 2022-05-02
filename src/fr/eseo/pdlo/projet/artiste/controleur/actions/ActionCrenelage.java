package fr.eseo.pdlo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionCrenelage extends AbstractAction {
	// CONSTANTE DE CLASSE //
	public static final String NOM_ACTION = "Anti-Crenelage";
	
	// VARIABLE D'INSTANCE //
	public PanneauDessin panneauDessin = null;
	
	// CONSTRUCTEUR //
	public ActionCrenelage(PanneauDessin panneauDessin) {
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		panneauDessin.setCrenelage(!panneauDessin.getCrenelage());
		
	}

}
