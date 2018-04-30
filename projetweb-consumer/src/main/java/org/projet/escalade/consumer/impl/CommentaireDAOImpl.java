package org.projet.escalade.consumer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.projet.escalade.consumer.contract.CommentaireDAO;
import org.projet.escalade.model.Commentaire;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CommentaireDAOImpl extends AbstractDAO implements CommentaireDAO {

	public List<Commentaire> getCommentaire() {
		String vSQL = "SELECT * FROM commentaire";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		
		RowMapper<Commentaire> vRowMapper = new RowMapper<Commentaire>() {
			public Commentaire mapRow(ResultSet pRS, int pRowNum) throws SQLException {
				Commentaire vCommentaire = new Commentaire();
				vCommentaire.setCommentairename(pRS.getString("nom_commentaire"));
				return vCommentaire;
			}
		};
		List<Commentaire> vListCommentaire = vJdbcTemplate.query(vSQL, vRowMapper);
		
		return vListCommentaire;
	}
}
