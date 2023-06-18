package BusinessLayer.InterfacesBusiness;

public interface IAdministrateur extends IUtilisateur {

	/**
	 *  
	 */
        public abstract void ajouterEtudiant(IEtudiant etudiant);
	/**
	 *  
	 */
	public abstract void supprimerEtudiant(String matricule);

	/**
	 *  
	 */
	public abstract void modifierEtudiant(IEtudiant etudiant);

	/**
	 *  
	 */
        public abstract void ajouterEnseignant(IEnseignant ens);

	/**
	 *  
	 */
	public abstract void supprimerEnseignant(String matricule);

	/**
	 *  
	 */
	public abstract void modifierEnseignant(IEnseignant ens);

	/**
	 *  
	 */
        public abstract void ajouterSuivi(ISuiviCours suivi);

	/**
	 *  
	 */
	public abstract void supprimerSuivi(ISuiviCours suivi);

	/**
	 *  
	 */
	public abstract void modifierSuivi(ISuiviCours suivi);

	/**
	 *  
	 */
        public abstract void ajouterSemestre(ISemestre sem);

	/**
	 *  
	 */
        public abstract void supprimerSemestre(String codeSemestre);

	/**
	 *  
	 */
        public abstract void modifierSemestre(ISemestre sem);

	/**
	 *  
	 */
        public abstract void ajouterSalle(ISalle salle);

	/**
	 *  
	 */
        public abstract void supprimerSalle(String codeSalle);

	/**
	 *  
	 */
        public abstract void modifierSalle(ISalle salle);

	/**
	 *  
	 */
        public abstract void ajouterMatiere(IMatiere matiere);

	/**
	 *  
	 */
        public abstract void supprimerMatiere(String codeMatiere);

	/**
	 *  
	 */
        public abstract void modifierMatiere(IMatiere matiere);

	/**
	 *  
	 */
        public abstract void ajouterDépartement(IDepartement departement);

	/**
	 *  
	 */
        public abstract void supprimerDepartement(String codeDepartement);

	/**
	 *  
	 */
        public abstract void modifierDepartement(IDepartement departement);

	/**
	 *  
	 */
        public abstract void ajouterNiveau(INiveau niveau);

	/**
	 *  
	 */
        public abstract void supprimerNiveau(String codeNiveau);

	/**
	 *  
	 */
        public abstract void modifierNiveau(INiveau niveau);

	/**
	 *  
	 */
        public abstract void ajouterFiliere(IFiliere filiere);

	/**
	 *  
	 */
        public abstract void supprimerFiliere(String codeFiliere);

	/**
	 *  
	 */
        public abstract void modifierFiliere(IFiliere filiere);

	/**
	 *  
	 */
        public abstract void ajouterGroupe(IGroupe groupe);

	/**
	 *  
	 */
        public abstract void supprimerGroupe(String codeGroupe);

	/**
	 *  
	 */
        public abstract void modifierGroupe(IGroupe groupe);

	/**
	 *  
	 */
        public abstract void fillAdm(IUtilisateur usr);
}
