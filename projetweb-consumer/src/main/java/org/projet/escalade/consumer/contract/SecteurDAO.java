package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;

public interface SecteurDAO {

	List<Secteur> getSecteur();

	List<Secteur> getSecteurBySite(Sites vSite);

	Secteur getSecteur(int id);
}