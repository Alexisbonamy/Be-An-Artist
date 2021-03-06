package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import fr.eseo.pdlo.projet.artiste.modele.formes.Ligne;

public class VueLigne extends VueForme {
	// VARIABLE DE CLASSE //
	Color couleurCourante;
	boolean crenelage;
	
	// CONSTRUCTEUR //
	public VueLigne(Ligne ligne) {
		super(ligne);
	}

	@Override
	public void affiche(Graphics2D g2d) {
		Ligne ligne = (Ligne) this.forme;
		if (ligne.getCrenelage()) {
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	            RenderingHints.VALUE_ANTIALIAS_ON);
		}
		g2d.setColor(ligne.getCouleur());
		g2d.drawLine((int) Math.round(ligne.getC1().getAbscisse()), (int) Math.round(ligne.getC1().getOrdonnee()),
                (int) Math.round(ligne.getC2().getAbscisse()),
                (int) Math.round(ligne.getC2().getOrdonnee()));
		this.couleurCourante = ligne.getCouleur();
		this.crenelage = ligne.getCrenelage();
	}
}
