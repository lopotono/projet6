package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Voie;

public interface VoieDAO {	

	Voie getVoie(int id);

	List<Voie> getVoie();

	List<Voie> getVoieBySecteur(Secteur vSecteur);

	List<Voie> getSearchVoie(String name);

	void AddVoie(int id, String name, int hauteur, int numero, int nbpoints, int id_secteur);
}