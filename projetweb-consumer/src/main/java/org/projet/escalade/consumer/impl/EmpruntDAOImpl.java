package org.projet.escalade.consumer.impl;

import java.sql.Types;
import java.util.Date;
import java.util.List;

import org.projet.escalade.consumer.contract.EmpruntDAO;
import org.projet.escalade.consumer.impl.rawmapper.EmpruntRawMapper;
import org.projet.escalade.model.Emprunttopo;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmpruntDAOImpl extends AbstractDAO implements EmpruntDAO {

	public EmpruntDAOImpl() {

	}

	public List<Emprunttopo> getEmprunttopo() {

		String vSQL = "SELECT * FROM emprunt_topo";

		EmpruntRawMapper vRowMapper = new EmpruntRawMapper();

		List<Emprunttopo> vListEmprunttopo = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListEmprunttopo;
	}

	public void AddEmprunt(Date datedebut, Date datefin, int id_topo, int id_user) {

		String vSQL = "INSERT INTO emprunt_topo (date_debut_emprunt, date_fin_emprunt, id_user, id_topo) VALUES (:date_debut_emprunt,:date_fin_emprunt,:id_user,:id_topo)";
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("date_debut_emprunt", datedebut, Types.DATE);
		vParams.addValue("date_fin_emprunt", datefin, Types.DATE);
		vParams.addValue("id_user", id_user, Types.INTEGER);
		vParams.addValue("id_topo", id_topo, Types.INTEGER);

		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

		try {
			vJdbcTemplate.update(vSQL, vParams);
		} catch (DuplicateKeyException vEx) {

		}
	}
}