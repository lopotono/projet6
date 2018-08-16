package org.projet.escalade.consumer.impl;

import java.sql.Types;
import java.util.Calendar;
import java.util.List;

import org.projet.escalade.consumer.contract.EmpruntDAO;
import org.projet.escalade.consumer.impl.rawmapper.EmpruntRawMapper;
import org.projet.escalade.model.Emprunttopo;
import org.projet.escalade.model.User;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmpruntDAOImpl extends AbstractDAO implements EmpruntDAO {

	public EmpruntDAOImpl() {

	}

	public List<Emprunttopo> getListEmprunttopo() {

		String vSQL = "SELECT * FROM emprunt_topo";

		EmpruntRawMapper vRowMapper = new EmpruntRawMapper();

		List<Emprunttopo> vListEmprunttopo = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListEmprunttopo;
	}

	public void SaveEmprunt(Calendar datedebut, Calendar datefin, String vUser, String topoid) {

		String vSQL = "INSERT INTO emprunt_topo (date_debut_emprunt, date_fin_emprunt, id_user, id_topo) VALUES (:date_debut_emprunt,:date_fin_emprunt,:id_user,:id_topo)";

		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("date_debut_emprunt", datedebut, Types.DATE);
		vParams.addValue("date_fin_emprunt", datefin, Types.DATE);
		vParams.addValue("id_user", vUser, Types.INTEGER);
		vParams.addValue("id_topo", topoid, Types.INTEGER);
		
		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

		try {
			vJdbcTemplate.update(vSQL, vParams);
		} catch (DuplicateKeyException vEx) {

		}
	}

	public List<Emprunttopo> getEmpruntByUser(User vUser) {

		String vSQL = "SELECT * FROM emprunt_topo WHERE id_user="+vUser.getId();
					
		EmpruntRawMapper vRowMapper = new EmpruntRawMapper();
		
		List<Emprunttopo> emprunttopos = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return emprunttopos;
	}

	public Emprunttopo getTopos(String id_topo) {
		return null;
	}

	public Emprunttopo getUser(String vUser) {
		return null;
	}
}