package org.projet.escalade.consumer.impl;

import java.sql.Types;
import java.util.List;

import org.projet.escalade.consumer.contract.TopoDAO;
import org.projet.escalade.consumer.impl.rawmapper.TopoRawMapper;
import org.projet.escalade.model.Topos;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class TopoDAOImpl extends AbstractDAO implements TopoDAO {
	
	public TopoDAOImpl() {
		
	}
	
	public List<Topos> getTopos() {
		
		String vSQL = "SELECT * FROM topo";
				
		TopoRawMapper vRowMapper = new TopoRawMapper();
						
		List<Topos> vListTopos= getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListTopos;		
	}

	public Topos getTopos(int id) {
		
		String vSQL = "SELECT * FROM topo WHERE id_topo="+id;
		
		TopoRawMapper vRowMapper = new TopoRawMapper();
		
		List<Topos> vListTopos= getJdbcTemplate().query(vSQL, vRowMapper);
				
		return vListTopos.get(0);
	}

	public Topos getSearchTopo(int id, String name) {

		String vSQL = "SELECT * FROM topo WHERE id_topo, nom_topo=" + id + name;
		
		TopoRawMapper vRowMapper = new TopoRawMapper();
		
		List<Topos> vListTopos= getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListTopos.get(0);
	}

	public Topos getAddTopo(String name, Boolean dispo, int id) {
		
		String vSQL = "INSERT INTO topo (nom_topo, topo_disponible, id_user) VALUES ('"+ name +"',"+ dispo +","+ id +")";
		System.out.println(vSQL);
		TopoRawMapper vRowMapper = new TopoRawMapper();
		
		List<Topos> topos= getJdbcTemplate().query(vSQL, vRowMapper);

		return topos.get(0);
	}

	public Topos getEmprunttopo(String name) {
		
		String vSQL = "SELECT * FROM topo WHERE nom_topo=" + name;
		
		TopoRawMapper vRowMapper = new TopoRawMapper();
		
		List<Topos> topos= getJdbcTemplate().query(vSQL, vRowMapper);
		
		return topos.get(0);
	}

	public void AjoutTopo(String name, Boolean dispo, String iduser) {
		
		String vSQL = "INSERT INTO topo (nom_topo, topo_disponible, id_user) VALUES (:nom_topo,:topo_disponible,:id_user)";
				
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("nom_topo", name, Types.VARCHAR);
		vParams.addValue("topo_disponible", dispo, Types.BOOLEAN);
		vParams.addValue("id_user", iduser, Types.INTEGER);

		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
		
		try {
		vJdbcTemplate.update(vSQL, vParams);
		} catch (DuplicateKeyException vEx) {
			System.out.println("Le topo "+ name +" existe déjà !");
		}
	}				
}