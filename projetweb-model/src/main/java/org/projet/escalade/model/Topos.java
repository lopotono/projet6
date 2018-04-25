package org.projet.escalade.model;

public class Topos {
	
	private Integer id;
	private String toposname;
	private boolean topodispo;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    public String getToposname() {
        return toposname;
    }

    public void setToposname(String toposname) {
        this.toposname = toposname;
    }

	public boolean isTopodispo() {
		return topodispo;
	}

	public void setTopodispo(boolean topodispo) {
		this.topodispo = topodispo;
	}	
}
