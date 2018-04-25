package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.ToposManager;
import org.projet.escalade.model.Topos;
import org.projet.escalade.model.exception.NotFoundException;


public class ToposManagerImpl extends AbstractManager implements ToposManager {

	
    public List<Topos> getListTopos() {
		return getDaoFactory().getTopoDao().getTopos();
	}  

    public Topos getTopos(Integer pID) throws NotFoundException {
        return null;
    }	
}
