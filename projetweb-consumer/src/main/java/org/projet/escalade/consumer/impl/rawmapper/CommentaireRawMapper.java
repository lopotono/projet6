package org.projet.escalade.consumer.impl.rawmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.projet.escalade.model.Commentaire;
import org.springframework.jdbc.core.RowMapper;

public class CommentaireRawMapper implements RowMapper<Commentaire> {

	public Commentaire mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Commentaire vCommentaire = new Commentaire();
		vCommentaire.setId(pRS.getInt("id_commentaire"));
		vCommentaire.setName(pRS.getString("nom_commentaire"));
		vCommentaire.setContain(pRS.getString("contenu"));
		return vCommentaire;
	}
}