package BusinessLayer.InterfacesBusiness;

public interface IUtilisateur {

	public boolean connecter(String login, String pass);

	public abstract void deconnecter();

	/**
	 *  
	 */
	public abstract String getMatricule();

	/**
	 *  
	 */
	public abstract String getMdp();

	/**
	 *  
	 */
	public abstract String getNom();

	/**
	 *  
	 */
	public abstract String getPrenom();

	/**
	 *  
	 */
	public abstract String getEmail();

	/**
	 *  
	 */
	public abstract String getDateNais();

	/**
	 *  
	 */

        public abstract String getType();

	/**
	 *  
	 */
	public abstract void setMatricule(String matricule);

	/**
	 *  
	 */
	public abstract void setMdp(String mdp);

	/**
	 *  
	 */
	public abstract void setNom(String nom);

	/**
	 *  
	 */
	public abstract void setPrenom(String prenom);

	/**
	 *  
	 */
	public abstract void setEmail(String email);

	/**
	 *  
	 */
	public abstract void setDateNais(String dateNais);

        public abstract void setType(String type);

        public boolean isStudent();

        public boolean isTeacher();

        public boolean isAdmin();

}
