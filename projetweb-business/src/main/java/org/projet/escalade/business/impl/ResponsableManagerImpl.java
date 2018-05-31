package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.ResponsableManager;
import org.projet.escalade.model.Responsable;

public class ResponsableManagerImpl extends AbstractManager implements ResponsableManager {
	
	private List<Responsable> responsable;

	public List<Responsable> getResponsable() {
		return responsable;
	}

	public void setResponsable(List<Responsable> responsable) {
		this.responsable = responsable;
	}
}
