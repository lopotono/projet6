package org.projet.escalade.model;

public class User {

	private Integer id;
	private String username;
	private String userprenom;
	private String usermail;
	private String useradresse;
	private Integer usercodepostal;
	private String userville;
	private String usermotdepasse;
		
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserprenom() {
		return userprenom;
	}
	public void setUserprenom(String userprenom) {
		this.userprenom = userprenom;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUseradresse() {
		return useradresse;
	}
	public void setUseradresse(String useradresse) {
		this.useradresse = useradresse;
	}
	public Integer getUsercodepostal() {
		return usercodepostal;
	}
	public void setUsercodepostal(Integer usercodepostal) {
		this.usercodepostal = usercodepostal;
	}
	public String getUserville() {
		return userville;
	}
	public void setUserville(String userville) {
		this.userville = userville;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsermotdepasse() {
		return usermotdepasse;
	}
	public void setUsermotdepasse(String usermotdepasse) {
		this.usermotdepasse = usermotdepasse;
	}
}
