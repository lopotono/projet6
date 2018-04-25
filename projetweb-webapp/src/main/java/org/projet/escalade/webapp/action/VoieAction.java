package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Voie;

import com.opensymphony.xwork2.ActionSupport;

public class VoieAction extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7474717297285737007L;

	// ==================== Attributs ====================
    // ----- Paramètres en entrée
    private Integer id;

    // ----- Eléments en sortie
    private List<Voie> listVoie;
    private Voie voie;


    // ==================== Getters/Setters ====================
    public Integer getId() {
        return id;
    }
    public void setId(Integer pId) {
        id = pId;
    }
    public Voie getVoie() {
        return voie;
    }
    
	public List<Voie> getListVoie() {
		return listVoie;
	}	
    
    // ==================== Méthodes ====================
    public String doList() {
    	listVoie = getManagerFactory().getVoieManager().getListVoie();
    	return ActionSupport.SUCCESS;
    }
}
