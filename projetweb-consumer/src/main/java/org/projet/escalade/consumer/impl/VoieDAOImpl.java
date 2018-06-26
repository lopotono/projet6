package org.projet.escalade.consumer.impl;

import java.util.List;

import org.projet.escalade.consumer.contract.VoieDAO;
import org.projet.escalade.consumer.impl.rawmapper.VoieRawMapper;
import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Voie;

public class VoieDAOImpl extends AbstractDAO implements VoieDAO {
	
	public VoieDAOImpl() {
		
	}

	public List<Voie> getVoie() {
		
		String vSQL = "SELECT * FROM voie";		
		
		VoieRawMapper vRowMapper = new VoieRawMapper();
			
		List<Voie> vListVoie = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListVoie;
	}

	public Voie getVoie(int id) {
		
		String vSQL = "SELECT * FROM voie WHERE id_voie="+id;
		
		VoieRawMapper vRowMapper = new VoieRawMapper();
		
		List<Voie> vListVoie = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListVoie.get(0);		
	}

	public List<Voie> getVoieBySecteur(Secteur vSecteur) {
		
		String vSQL = "SELECT * FROM voie WHERE id_secteur=" + vSecteur.getSecteurid();
			
		VoieRawMapper vRowMapper = new VoieRawMapper();
		
		List<Voie> vListVoie = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListVoie;
	}

	public List<Voie> getSearchVoie(String name) {
		
		String vSQL = "SELECT * FROM voie WHERE LOWER(nom_voie) LIKE '%" + name + "%'";
		
		VoieRawMapper vRowMapper = new VoieRawMapper();
		
		List<Voie> voie = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return voie;
	}

	public Voie getAddVoie(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
