package org.projet.escalade.consumer.impl;

import java.util.List;

import org.projet.escalade.consumer.contract.TopoDAO;
import org.projet.escalade.consumer.impl.rawmapper.TopoRawMapper;
import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;
import org.projet.escalade.model.User;

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

	public List<Topos> getToposBySite(Sites vSite) {
		
		String vSQL = "SELECT * FROM topo WHERE id_site_escalade=" + vSite.getSitesid();
		System.out.println(vSQL);	
		TopoRawMapper vRowMapper = new TopoRawMapper();
		
		List<Topos> vListTopos= getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListTopos;
	}

	public List<Topos> getToposByUser(User vUser) {
		
		String vSQL = "SELECT * FROM topo WHERE id_user=" + vUser.getId();
		
		TopoRawMapper vRowMapper = new TopoRawMapper();
		
		List<Topos> vListTopos= getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListTopos;
	}				
}
