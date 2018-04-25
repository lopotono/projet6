package org.projet.escalade.consumer.impl;

import javax.sql.DataSource;

public abstract class AbstractDAO {
	
    private DataSource dataSource;

    protected DataSource getDataSource() {
        return dataSource;
    }
    
    public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
