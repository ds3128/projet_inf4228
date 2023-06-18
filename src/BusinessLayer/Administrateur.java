package BusinessLayer;

import BusinessLayer.DAOLayer.DeleteDAO;
import BusinessLayer.DAOLayer.SelectDAO;
import BusinessLayer.DAOLayer.InterfacesDAO.ISelectDAO;
import BusinessLayer.DAOLayer.InterfacesDAO.IUpdateDAO;
import BusinessLayer.DAOLayer.UpdateDAO;
import BusinessLayer.DAOLayer.InterfacesDAO.IInsertDAO;
import BusinessLayer.DAOLayer.InsertDAO;
import BusinessLayer.DAOLayer.InterfacesDAO.IDeleteDAO;
import BusinessLayer.InterfacesBusiness.IAdministrateur;
import BusinessLayer.InterfacesBusiness.IDepartement;
import BusinessLayer.InterfacesBusiness.IEnseignant;
import BusinessLayer.InterfacesBusiness.IEtudiant;
import BusinessLayer.InterfacesBusiness.IFiliere;
import BusinessLayer.InterfacesBusiness.IGroupe;
import BusinessLayer.InterfacesBusiness.IMatiere;
import BusinessLayer.InterfacesBusiness.INiveau;
import BusinessLayer.InterfacesBusiness.ISalle;
import BusinessLayer.InterfacesBusiness.ISemestre;
import BusinessLayer.InterfacesBusiness.ISuiviCours;
import BusinessLayer.InterfacesBusiness.IUtilisateur;

public class Administrateur extends Utilisateur implements IAdministrateur {


	/**
	 * @see IAdministrateur#ajouterEtudiant(IEtudiant)
	 *  
	 */


	public void ajouterEtudiant(IEtudiant etudiant) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertEtudiant(etudiant);
	}


	/**
	 * @see IAdministrateur#supprimerEtudiant(String)
	 *  
	 */
	public void supprimerEtudiant(String matricule) {
            IEtudiant etd = new Etudiant();
            etd.setMatricule(matricule);
            IDeleteDAO delete = new DeleteDAO();
            delete.delEtudiant(etd);
	}


	/**
	 * @see IAdministrateur#modifierEtudiant(IEtudiant)
	 *  
	 */
	public void modifierEtudiant(IEtudiant etudiant) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updEtudiant(etudiant);
	}


	/**
	 * @see IAdministrateur#ajouterEnseignant(IEnseignant)
	 *  
	 */
	public void ajouterEnseignant(IEnseignant enseignant) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertEnseignant(enseignant);
	}


	/**
	 * @see IAdministrateur#supprimerEnseignant(String)
	 *  
	 */
	public void supprimerEnseignant(String matricule) {
            IEnseignant ens = new Enseignant();
            ens.setMatricule(matricule);
            IDeleteDAO delete = new DeleteDAO();
            delete.delEnseignant(ens);
	}


	/**
	 * @see IAdministrateur#modifierEnseignant(IEnseignant)
	 *  
	 */
	public void modifierEnseignant(IEnseignant enseignant) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updEnseignant(enseignant);
	}


	/**
	 * @see IAdministrateur#ajouterSuivi(ISuiviCours)
	 *  
	 */
	public void ajouterSuivi(ISuiviCours suivi) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertSuivi(suivi);
	}


	/**
	 * @see IAdministrateur#supprimerSuivi(ISuiviCours)
	 *  
	 */
	public void supprimerSuivi(ISuiviCours suivi) {
            IDeleteDAO delete = new DeleteDAO();
            delete.delSuivi(suivi);
	}


	/**
	 * @see IAdministrateur#modifierSuivi(ISuiviCours)
	 *  
	 */
	public void modifierSuivi(ISuiviCours suivi) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updSuivi(suivi);
	}


	/**
	 * @see IAdministrateur#ajouterSemestre(ISemestre)
	 *  
	 */
	public void ajouterSemestre(ISemestre sem) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertSemestre(sem);
	}


	/**
	 * @see IAdministrateur#supprimerSemestre(String)
	 *  
	 */
	public void supprimerSemestre(String codeSemestre) {
            ISemestre sem = new Semestre();
            sem.setCodeSem(codeSemestre);
            IDeleteDAO delete = new DeleteDAO();
            delete.delSemestre(sem);
	}


	/**
	 * @see IAdministrateur#modifierSemestre(ISemestre)
	 *  
	 */
	public void modifierSemestre(ISemestre sem) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updSemestre(sem);
	}


	/**
	 * @see IAdministrateur#ajouterSalle(ISalle)
	 *  
	 */
	public void ajouterSalle(ISalle salle) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertSalle(salle);
	}


	/**
	 * @see IAdministrateur#supprimerSalle(String)
	 *  
	 */
	public void supprimerSalle(String codeSalle) {
            ISalle salle = new Salle();
            salle.setCodeSalle(codeSalle);
            IDeleteDAO delete = new DeleteDAO();
            delete.delSalle(salle);
	}


	/**
	 * @see IAdministrateur#modifierSalle(ISalle)
	 *  
	 */
	public void modifierSalle(ISalle salle) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updSalle(salle);
	}


	/**
	 * @see IAdministrateur#ajouterSalle(ISalle)
	 *  
	 */
	public void ajouterMatiere(IMatiere matiere) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertMatiere(matiere);
	}


	/**
	 * @see IAdministrateur#supprimerMatiere(String)
	 *  
	 */
	public void supprimerMatiere(String codeMatiere) {
            IMatiere mat = new Matiere();
            mat.setCodeMat(codeMatiere);
            IDeleteDAO delete = new DeleteDAO();
            delete.delMatiere(mat);
	}


	/**
	 * @see IAdministrateur#modifierMatiere(IMatiere)
	 *  
	 */
	public void modifierMatiere(IMatiere matiere) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updMatiere(matiere);
	}


	/**
	 * @see IAdministrateur#ajouterDépartement(IDepartement)
	 *  
	 */
	public void ajouterDépartement(IDepartement departement) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertDepartement(departement);
	}


	/**
	 * @see IAdministrateur#supprimerDepartement(String)
	 *  
	 */
	public void supprimerDepartement(String codeDepartement) {
            IDepartement dpt = new Departement();
            dpt.setCodeDepart(codeDepartement);
            IDeleteDAO delete = new DeleteDAO();
            delete.delDepartement(dpt);
	}


	/**
	 * @see IAdministrateur#modifierDepartement(IDepartement)
	 *  
	 */
	public void modifierDepartement(IDepartement departement) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updDepartement(departement);
	}


	/**
	 * @see IAdministrateur#ajouterNiveau(INiveau)
	 *  
	 */
	public void ajouterNiveau(INiveau niveau) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertNiveau(niveau);
	}


	/**
	 * @see IAdministrateur#supprimerNiveau(String)
	 *  
	 */
	public void supprimerNiveau(String codeNiveau) {
            INiveau niv = new Niveau();
            niv.setCodeNiv(codeNiveau);
            IDeleteDAO delete = new DeleteDAO();
            delete.delNiveau(niv);
	}


	/**
	 * @see IAdministrateur#modifierNiveau(INiveau)
	 *  
	 */
	public void modifierNiveau(INiveau niveau) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updNiveau(niveau);
	}


	/**
	 * @see IAdministrateur#ajouterFiliere(IFiliere)
	 *  
	 */
	public void ajouterFiliere(IFiliere filiere) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertFiliere(filiere);
	}


	/**
	 * @see IAdministrateur#supprimerFiliere(String)
	 *  
	 */
	public void supprimerFiliere(String codeFiliere) {
            IFiliere fil = new Filiere();
            fil.setCodeFil(codeFiliere);
            IDeleteDAO delete = new DeleteDAO();
            delete.delFiliere(fil);
	}


	/**
	 * @see IAdministrateur#modifierFiliere(IFiliere)
	 *  
	 */
	public void modifierFiliere(IFiliere filiere) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updFiliere(filiere);
	}


	/**
	 * @see IAdministrateur#ajouterGroupe(IGroupe)
	 *  
	 */
	public void ajouterGroupe(IGroupe groupe) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertGroupe(groupe);
	}


	/**
	 * @see IAdministrateur#supprimerGroupe(String)
	 *  
	 */
	public void supprimerGroupe(String codeGroupe) {
            IGroupe grp = new Groupe();
            grp.setCodeGrp(codeGroupe);
            IDeleteDAO delete = new DeleteDAO();
            delete.delGroupe(grp);
	}


	/**
	 * @see IAdministrateur#modifierFiliere(IFiliere)
	 *  
	 */
	public void modifierGroupe(IGroupe groupe) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updGroupe(groupe);
	}

	/**
	 * @see Etudiant#fillEtd(IUtilisateur)
	 */
	public void fillAdm(IUtilisateur usr) {
                this.setMatricule(usr.getMatricule());
		ISelectDAO select = new SelectDAO();
                select.selAdministrateur(this);
	}
}
