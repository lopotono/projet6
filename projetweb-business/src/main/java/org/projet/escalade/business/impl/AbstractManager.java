package org.projet.escalade.business.impl;

import org.projet.escalade.consumer.contract.DaoFactory;

public abstract class AbstractManager {

	private DaoFactory daoFactory;

    public DaoFactory getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
}
