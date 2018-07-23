package org.projet.escalade.business.impl;

import org.projet.escalade.consumer.contract.DaoFactory;
import org.springframework.transaction.PlatformTransactionManager;

public abstract class AbstractManager {

	private DaoFactory daoFactory;

    public DaoFactory getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }
    
    /*@Inject
    @Named("txManagerSite")*/
    private PlatformTransactionManager platformTransactionManager;
    
    public PlatformTransactionManager getPlatformTransactionManager() {
		return platformTransactionManager;
	}
    
    public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}
}