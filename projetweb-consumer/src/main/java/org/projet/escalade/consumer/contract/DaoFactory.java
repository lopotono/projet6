package org.projet.escalade.consumer.contract;

public interface DaoFactory {

    public TopoDAO getTopoDao();
    public VoieDAO getVoieDao();
    public SecteurDAO getSecteurDao();
    public SitesDAO getSitesDao();
}
