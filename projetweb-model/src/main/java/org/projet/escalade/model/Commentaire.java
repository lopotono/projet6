package org.projet.escalade.model;

import org.apache.commons.lang3.StringUtils;

public class Commentaire {
	
	private String name;

	public Commentaire() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setname(String pName) {
		name = pName;
	}
	
	public String toString() {
		final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
		vStB.append(" {")
			.append("name=").append(name)
			.append("}");
		return vStB.toString();
	}
	
	public boolean equals(Object obj) {
		return super.equals(obj)
				|| (obj instanceof Commentaire && StringUtils.equals(((Commentaire) obj).getName(), name));
	}
	
	public int hashCode() {
		return this.name != null ? this.name.hashCode() : super.hashCode();
	}
}
