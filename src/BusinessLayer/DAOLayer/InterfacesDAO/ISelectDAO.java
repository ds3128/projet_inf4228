package BusinessLayer.DAOLayer.InterfacesDAO;

import BusinessLayer.InterfacesBusiness.IEtudiant;
import java.util.ArrayList;
import java.util.HashMap;

import BusinessLayer.InterfacesBusiness.*;

public interface ISelectDAO {

	public void selUser(IUtilisateur usr);

	public void selSalle(ISalle salle);

	public void selFiliere(IFiliere filiere);

	public void selGroupe(IGroupe groupe);

	public void selNiveau(INiveau niveau);

        public ArrayList<INiveau> selAllNiveau(String codeFiliere);

	public void selSemestre(ISemestre semestre);

	public void selAnnee(IAnnee annee);

	public void selMatiere(IMatiere matiere);

	public void selDepartement(IDepartement dpt);

	public void selEnseignant(IEnseignant ens);

        public ArrayList<ISalle> selAllSalle();

        public ArrayList<IEnseignant> selAllEnseignant();

        public ArrayList<IEnseignant> selAllEnseignant(String codeFiliere);

        public ArrayList<ISemestre> selAllSemestre();

        public ArrayList<IMatiere> selAllMatiere();

        public ArrayList<IMatiere> selAllMatiere(String codeFiliere, String codeNiveau);

        public ArrayList<IDepartement> selAllDepartement();

        public ArrayList<IAnnee> selAllAnnee();

        public ArrayList<INiveau> selAllNiveau();

        public ArrayList<IFiliere> selAllFiliere();

        public ArrayList<IGroupe> selAllGroupe();

        public ArrayList<IGroupe> selAllGroupe(String codeFiliere, String codeNiveau);

        public ArrayList<IEnseignant> selColleagues(IEnseignant enseignant);

	public void selAdministrateur(IAdministrateur admin);

	public void selEtudiant(IEtudiant etudiant);

        public ArrayList<IEtudiant> selComrades(IEtudiant etudiant);

	public ArrayList<HashMap<String, String>> selSuiviEtudiant(IEtudiant etudiant);

	public ArrayList<HashMap<String, String>> selSuiviEnseignant(IEnseignant enseignant);

	public boolean exist(String table, String colonne, String valeurColonne);

}
