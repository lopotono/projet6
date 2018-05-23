package org.projet.escalade.consumer.impl;

import java.util.List;

import org.projet.escalade.consumer.contract.LongueurDAO;
import org.projet.escalade.consumer.impl.rawmapper.LongueurRawMapper;
import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Voie;

public class LongueurDAOImpl extends AbstractDAO implements LongueurDAO {
	
	public LongueurDAOImpl() {
		
	}
	
	public List<Longueur> getLongueur() {
		String vSQL = "SELECT * FROM longueur";
		
		LongueurRawMapper vRowMapper = new LongueurRawMapper();
		
		List<Longueur> vListLongueur = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListLongueur;	
	}
	
	public List<Longueur> getLongueurByVoie(Voie vVoie) {
		
		String vSQL = "SELECT * FROM longueur WHERE id_voie="+vVoie.getId();
		
		LongueurRawMapper vRowMapper = new LongueurRawMapper();
		
		List<Longueur> vListLongueur = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListLongueur;
	}

	public Longueur getLongueur(int id) {
		String vSQL = "SELECT * FROM longueur WHERE id_voie="+id;
		
		LongueurRawMapper vRowMapper = new LongueurRawMapper();
		
		List<Longueur> vListLongueur = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListLongueur.get(0);
	}
}
