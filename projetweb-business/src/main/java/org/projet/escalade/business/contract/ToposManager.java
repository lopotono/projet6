package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Topos;
import org.projet.escalade.model.exception.NotFoundException;

public interface ToposManager {

	List<Topos> getListTopos();

    Topos getTopos(Integer pID) throws NotFoundException;

}
