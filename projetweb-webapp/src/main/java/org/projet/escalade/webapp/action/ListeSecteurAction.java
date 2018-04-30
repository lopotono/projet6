package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.exception.NotFoundException;

import com.opensymphony.xwork2.ActionSupport;


public class ListeSecteurAction extends AbstractAction {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 992333797563228317L;

	// ======= Attributs =========
    // ------- Paramètres en entrée
    private Integer id;

    // ------- Eléments en sortie
    private List<Secteur> listSecteur;
    private Secteur secteur;

    // ======= Getters/Setters =======
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public List<Secteur> getListSecteur() {
        return listSecteur;
    }
    public Secteur getSecteur() {
        return secteur;
    }
    
    // ======= Méthodes =======
    public String doListSecteur() {
    	listSecteur = AbstractAction.getManagerFactory().getSecteurManager().getListSecteur();
    	return ActionSupport.SUCCESS;
    }
    
    public String doDetail() {
    	if (id == null) {
    		this.addActionError("Vous devez indiquer un id de secteur");
    	} else {
    		try {
    			secteur = AbstractAction.getManagerFactory().getSecteurManager().getSecteur(id);
    		} catch (NotFoundException pE) {
    			this.addActionError("Secteur non trouvé. ID = " + id);
    		}
    	}
    	return (this.hasActionErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }  
}
