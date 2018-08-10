package org.projet.escalade.consumer.impl;

import java.sql.Types;
import java.util.List;

import org.projet.escalade.consumer.contract.CommentaireDAO;
import org.projet.escalade.consumer.impl.rawmapper.CommentaireRawMapper;
import org.projet.escalade.model.Commentaire;
import org.projet.escalade.model.Sites;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class CommentaireDAOImpl extends AbstractDAO implements CommentaireDAO {

	public List<Commentaire> getCommentaireBySite(Sites vSite) {
		
		String vSQL = "SELECT * FROM commentaire WHERE id_site_escalade=" + vSite.getSitesid();
		
		CommentaireRawMapper vRowMapper = new CommentaireRawMapper();
		
		List<Commentaire> vListCommentaire = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListCommentaire;
	}

	public List<Commentaire> getListCommentaire() {
		
		String vSQL = "SELECT * FROM commentaire ORDER BY nom_commentaire";
		
		CommentaireRawMapper vRowMapper = new CommentaireRawMapper();
		
		List<Commentaire> vListCommentaire = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListCommentaire;
	}

	public void AddCommentaire(String name, String contain, String idsite) {
		
		String vSQL = "INSERT INTO commentaire (nom_commentaire, contenu, id_site_escalade) VALUES (:nom_commentaire,:contenu,:id_site_escalade)";
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("nom_commentaire", name, Types.VARCHAR);
		vParams.addValue("contenu", contain, Types.INTEGER);
		vParams.addValue("id_site_escalade", idsite, Types.VARCHAR);
		
		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
			
		try {
			vJdbcTemplate.update(vSQL, vParams);
		} catch (DuplicateKeyException vEx) {
		
		}		
	}
}