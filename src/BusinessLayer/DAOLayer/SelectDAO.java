package BusinessLayer.DAOLayer;

import BusinessLayer.Annee;
import BusinessLayer.DAOLayer.InterfacesDAO.*;
import BusinessLayer.Departement;
import BusinessLayer.Enseignant;
import BusinessLayer.Etudiant;
import BusinessLayer.Filiere;
import BusinessLayer.Groupe;

import java.util.ArrayList;
import java.util.HashMap;

import BusinessLayer.InterfacesBusiness.*;
import BusinessLayer.Matiere;
import BusinessLayer.Niveau;
import BusinessLayer.Salle;
import BusinessLayer.Semestre;

public class SelectDAO implements ISelectDAO {

	public boolean exist(String table, String colonne, String valeurColonne){

		Requete request = new Requete();
		int nbr = 0;

		request.executeQuery(
				"SELECT COUNT(*) nbr FROM " + table + " WHERE " + colonne + " = '" + valeurColonne + "'");
		while (request.next()) {
                    nbr = Integer.parseInt(request.getString("nbr"));
		}
		return nbr != 0;
	}

	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selPass(String)
	 */
	public void selUser(IUtilisateur usr) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Utilisateur WHERE matricule='"+usr.getMatricule()+"'");
		while(request.next()) {
                    usr.setNom(request.getString("nom"));
                    usr.setPrenom(request.getString("prenom"));
                    usr.setMdp(request.getString("mdp"));
                    usr.setEmail(request.getString("email"));
                    usr.setDateNais(request.getString("dateNais"));
                    usr.setType(request.getString("type"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selSalle(ISalle)
	 */
	public void selSalle(ISalle salle) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Salle WHERE codeSalle='"+salle.getCodeSalle()+"'");
		while(request.next()) {
                    salle.setNomSalle(request.getString("nomSalle"));
                    salle.setType(request.getString("typeSalle"));
                    salle.setCapacite(Integer.parseInt(request.getString("capacite")));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selFiliere(IFiliere)
	 */
	public void selFiliere(IFiliere filiere) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Filiere WHERE codeFiliere='"+filiere.getCodeFil()+"'");
		while(request.next()) {
                    filiere.setNomFil(request.getString("nomFiliere"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selGroupe(IGroupe)
	 */
	public void selGroupe(IGroupe groupe) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Groupe WHERE idGrp='"+groupe.getIdGrp()+"'");
		while(request.next()) {
                    groupe.setNomGrp(request.getString("groupeClass"));
                    groupe.setEffectifGrp(Integer.parseInt(request.getString("effectif")));
                    groupe.setIdNiveau(Integer.parseInt(request.getString("idNiveau")));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selNiveau(INiveau)
	 */
	public void selNiveau(INiveau niveau) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Niveau WHERE idNiveau='"+niveau.getIdNiv()+"'");
		while(request.next()) {
                    niveau.setCodeNiv(request.getString("codeNiveau"));
                    niveau.setNomNiv(request.getString("nomNiveau"));
                    niveau.setCodeFiliere(request.getString("codeFiliere"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selSemestre(ISemestre)
	 */
	public void selSemestre(ISemestre semestre) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Semestre WHERE idSem='"+semestre.getIdSem()+"'");
		while(request.next()) {
                    semestre.setCodeSem(request.getString("codeSemestre"));
                    semestre.setNomSem(request.getString("nomSem"));
                    semestre.setIdAnnee(Integer.parseInt(request.getString("idAnnee")));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAnnee(IAnnee)
	 */
	public void selAnnee(IAnnee annee) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Annee WHERE idAnnee='"+annee.getIdAnnee()+"'");
		while(request.next()) {
                    annee.setAnneeDebut(request.getString("anneeDebut"));
                    annee.setAnneeFin(request.getString("anneeFin"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selMatiere(IMatiere)
	 */
	public void selMatiere(IMatiere matiere) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Matiere WHERE codeMatiere='"+matiere.getCodeMat()+"'");
		while(request.next()) {
                    matiere.setIntituleMat(request.getString("intituleMatiere"));
                    matiere.setCodeDepartement(request.getString("codeDepartement"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selDepartement(IDepartement)
	 */
	public void selDepartement(IDepartement dpt) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Departement WHERE codeDepartement='"+dpt.getCodeDepart()+"'");
		while(request.next()) {
                    dpt.setNomDepart(request.getString("nomDepartement"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selEnseignant(projet.BusinessLayer.IEnseignant)
	 */
	public void selEnseignant(IEnseignant ens) {
		selUser(ens);
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Enseignant WHERE matricule='"+ens.getMatricule()+"'");
		while(request.next()) {
                    ens.setGradeEns(request.getString("gradeEns"));
                    ens.setCodeDepartement(request.getString("codeDepartement"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllSalle()
	 */
	public ArrayList<ISalle> selAllSalle() {
            ArrayList<ISalle> salles = new ArrayList<>();
            ISalle salle;
            Requete request = new Requete();
            request.executeQuery("SELECT * FROM Salle");
            while(request.next()) {
                salle = new Salle();
                salle.setCodeSalle(request.getString("codeSalle"));
                salle.setNomSalle(request.getString("nomSalle"));
                salle.setType(request.getString("typeSalle"));
                salle.setCapacite(Integer.parseInt(request.getString("capacite")));
                salles.add(salle);
            }
            return salles;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllEnseignant()
	 */
	public ArrayList<IEnseignant> selAllEnseignant() {
            ArrayList<IEnseignant> enseignants = new ArrayList<>();
            IEnseignant enseignant;
            Requete request = new Requete();
            request.executeQuery("SELECT * FROM Enseignant");
            while(request.next()) {
                enseignant = new Enseignant();
                enseignant.setMatricule(request.getString("matricule"));
                enseignant.setGradeEns(request.getString("gradeEns"));
                enseignant.setCodeDepartement(request.getString("codeDepartement"));
                enseignants.add(enseignant);
            }
            return enseignants;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllEnseignant(String)
	 */
	public ArrayList<IEnseignant> selAllEnseignant(String codeFiliere) {
            ArrayList<IEnseignant> enseignants = new ArrayList<>();
            IEnseignant enseignant;
            Requete request = new Requete();
            request.executeQuery("SELECT ens.matricule, nom, prenom, gradeEns, codeDepartement FROM enseignant ens, utilisateur usr, faireCours cours, groupe grp, niveau niv, filiere fil WHERE ens.matricule = cours.matricule AND cours.idGrp = grp.idGrp AND grp.idNiveau = niv.idNiveau AND niv.codeFiliere = fil.codeFiliere AND ens.matricule = usr.matricule AND fil.codeFiliere = '" + codeFiliere + "'");
            while(request.next()) {
                enseignant = new Enseignant();
                enseignant.setMatricule(request.getString("matricule"));
                enseignant.setNom(request.getString("nom"));
                enseignant.setPrenom(request.getString("prenom"));
                enseignant.setGradeEns(request.getString("gradeEns"));
                enseignant.setCodeDepartement(request.getString("codeDepartement"));
                enseignants.add(enseignant);
            }
            return enseignants;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllSemestre()
	 */
	public ArrayList<ISemestre> selAllSemestre() {
            ArrayList<ISemestre> semestres = new ArrayList<>();
            ISemestre semestre;
            Requete request = new Requete();
            request.executeQuery("SELECT * FROM Semestre");
            while(request.next()) {
                semestre = new Semestre();
                semestre.setIdSem(Integer.parseInt(request.getString("idSem")));
                semestre.setCodeSem(request.getString("codeSemestre"));
                semestre.setNomSem(request.getString("nomSem"));
                semestre.setIdAnnee(Integer.parseInt(request.getString("idAnnee")));
                semestres.add(semestre);
            }
            for(ISemestre sem: semestres) {
                sem.setAnnee(new Annee());
                sem.getAnnee().setIdAnnee(sem.getIdAnnee());
                selAnnee(sem.getAnnee());
            }
            return semestres;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllMatiere()
	 */
	public ArrayList<IMatiere> selAllMatiere() {
            ArrayList<IMatiere> matieres = new ArrayList<>();
            IMatiere matiere;
            Requete request = new Requete();
            request.executeQuery("SELECT * FROM Matiere");
            while(request.next()) {
                matiere = new Matiere();
                matiere.setCodeMat(request.getString("codeMatiere"));
                matiere.setIntituleMat(request.getString("intituleMatiere"));
                matiere.setCodeDepartement(request.getString("codeDepartement"));
                matieres.add(matiere);
            }
            return matieres;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllMatiere()
	 */
	public ArrayList<IMatiere> selAllMatiere(String codeFiliere, String codeNiveau) {
            ArrayList<IMatiere> matieres = new ArrayList<>();
            IMatiere matiere;
            Requete request = new Requete();
            request.executeQuery("SELECT mat.codeMatiere, intituleMatiere, codeDepartement FROM matiere mat, faireCours cours, groupe grp,  niveau niv, filiere fil WHERE mat.codeMatiere = cours.codeMatiere AND cours.idGrp = grp.idGrp AND grp.idNiveau = niv.idNiveau AND niv.codeFiliere = fil.codeFiliere AND fil.codeFiliere = '" + codeFiliere + "' AND niv.codeNiveau = '" + codeNiveau + "'");
            while(request.next()) {
                matiere = new Matiere();
                matiere.setCodeMat(request.getString("codeMatiere"));
                matiere.setIntituleMat(request.getString("intituleMatiere"));
                matiere.setCodeDepartement(request.getString("codeDepartement"));
                matieres.add(matiere);
            }
            return matieres;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllDepartement()
	 */
	public ArrayList<IDepartement> selAllDepartement() {
            ArrayList<IDepartement> departements = new ArrayList<>();
            IDepartement departement;
            Requete request = new Requete();
            request.executeQuery("SELECT * FROM Departement");
            while(request.next()) {
                departement = new Departement();
                departement.setCodeDepart(request.getString("codeDepartement"));
                departement.setNomDepart(request.getString("nomDepartement"));
                departements.add(departement);
            }
            return departements;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllAnnee()
	 */
	public ArrayList<IAnnee> selAllAnnee() {
            ArrayList<IAnnee> annees = new ArrayList<>();
            IAnnee annee;
            Requete request = new Requete();
            request.executeQuery("SELECT * FROM annee");
            while(request.next()) {
                annee = new Annee();
                annee.setIdAnnee(Integer.parseInt(request.getString("idAnnee")));
                annee.setAnneeDebut(request.getString("anneeDebut"));
                annee.setAnneeFin(request.getString("anneeFin"));
                annees.add(annee);
            }
            return annees;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllNiveau()
	 */
	public ArrayList<INiveau> selAllNiveau() {
            ArrayList<INiveau> niveaux = new ArrayList<>();
            INiveau niveau;
            Requete request = new Requete();
            request.executeQuery("SELECT * FROM niveau");
            while(request.next()) {
                niveau = new Niveau();
                niveau.setIdNiv(Integer.parseInt(request.getString("idNiveau")));
                niveau.setCodeNiv(request.getString("codeNiveau"));
                niveau.setNomNiv(request.getString("nomNiveau"));
                niveau.setCodeFiliere(request.getString("codeFiliere"));
                niveaux.add(niveau);
            }
            return niveaux;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllNiveau(String)
	 */
	public ArrayList<INiveau> selAllNiveau(String codeFiliere) {
            ArrayList<INiveau> niveaux = new ArrayList<>();
            INiveau niveau;
            Requete request = new Requete();
            request.executeQuery("SELECT * FROM niveau WHERE codeFiliere = '" + codeFiliere + "'");
            while(request.next()) {
                niveau = new Niveau();
                niveau.setIdNiv(Integer.parseInt(request.getString("idNiveau")));
                niveau.setCodeNiv(request.getString("codeNiveau"));
                niveau.setNomNiv(request.getString("nomNiveau"));
                niveau.setCodeFiliere(request.getString("codeFiliere"));
                niveaux.add(niveau);
            }
            return niveaux;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllFiliere()
	 */
	public ArrayList<IFiliere> selAllFiliere() {
            ArrayList<IFiliere> filieres = new ArrayList<>();
            IFiliere filiere;
            Requete request = new Requete();
            request.executeQuery("SELECT * FROM filiere");
            while(request.next()) {
                filiere = new Filiere();
                filiere.setCodeFil(request.getString("codeFiliere"));
                filiere.setNomFil(request.getString("nomFiliere"));
                filieres.add(filiere);
            }
            return filieres;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllGroupe()
	 */
	public ArrayList<IGroupe> selAllGroupe() {
            ArrayList<IGroupe> groupes = new ArrayList<>();
            IGroupe groupe;
            Requete request = new Requete();
            request.executeQuery("SELECT * FROM groupe");
            while(request.next()) {
                groupe = new Groupe();
                groupe.setIdGrp(Integer.parseInt(request.getString("idGrp")));
                groupe.setCodeGrp(request.getString("groupeClass"));
                groupe.setNomGrp(request.getString("nomGroupe"));
                groupe.setEffectifGrp(Integer.parseInt(request.getString("effectif")));
                groupe.setIdNiveau(Integer.parseInt(request.getString("idNiveau")));
                groupe.setNiveau(new Niveau());
                groupe.getNiveau().setIdNiv(groupe.getIdNiveau());
                selNiveau(groupe.getNiveau());
                groupe.getNiveau().setFiliere(new Filiere());
                groupe.getNiveau().getFiliere().setCodeFil(groupe.getNiveau().getCodeFiliere());
                selFiliere(groupe.getNiveau().getFiliere());
                groupes.add(groupe);
            }
            return groupes;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAllGroupe(String, String)
	 */
	public ArrayList<IGroupe> selAllGroupe(String codeFiliere, String codeNiveau) {
            ArrayList<IGroupe> groupes = new ArrayList<>();
            IGroupe groupe;
            Requete request = new Requete();
            request.executeQuery("SELECT idGrp, groupeClass, nomGroupe, effectif, grp.idNiveau FROM groupe grp, niveau niv, filiere fil WHERE grp.idNiveau = niv.idNiveau AND niv.codeFiliere = fil.codeFiliere AND fil.codeFiliere = '" + codeFiliere + "' AND codeNiveau = '" + codeNiveau + "'");
            while(request.next()) {
                groupe = new Groupe();
                groupe.setIdGrp(Integer.parseInt(request.getString("idGrp")));
                groupe.setCodeGrp(request.getString("groupeClass"));
                groupe.setNomGrp(request.getString("nomGroupe"));
                groupe.setEffectifGrp(Integer.parseInt(request.getString("effectif")));
                groupe.setIdNiveau(Integer.parseInt(request.getString("idNiveau")));
                groupes.add(groupe);
            }
            for(IGroupe group: groupes) {
                group.setNiveau(new Niveau());
                group.getNiveau().setIdNiv(group.getIdNiveau());
                selNiveau(group.getNiveau());
                group.getNiveau().setFiliere(new Filiere());
                group.getNiveau().getFiliere().setCodeFil(group.getNiveau().getCodeFiliere());
                selFiliere(group.getNiveau().getFiliere());
            }
            return groupes;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAdministrateur(IAdministrateur)
	 */
	public void selAdministrateur(IAdministrateur admin) {
		selUser(admin);
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selEtudiant(IEtudiant)
	 */
	public void selEtudiant(IEtudiant etudiant) {
		selUser(etudiant);
		Requete request = new Requete();
		request.executeQuery("SELECT idGrp FROM Etudiant WHERE matricule='"+etudiant.getMatricule()+"'");
		while(request.next()) {
                    etudiant.setIdGrp(Integer.parseInt(request.getString("idGrp")));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selEtudiant(IEtudiant)
	 */
	public ArrayList<IEtudiant> selComrades(IEtudiant etudiant) {
		ArrayList<IEtudiant> comrades = new ArrayList<>();
		Etudiant etd;
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Etudiant WHERE idGrp='"+etudiant.getIdGrp()+"'");
		while(request.next()) {
                    etd = new Etudiant();
                    etd.setMatricule(request.getString("matricule"));
                    etd.setIdGrp(Integer.parseInt(request.getString("idGrp")));
                    comrades.add(etd);
		}
                for(IEtudiant student: comrades)
                    student.fillEtd(student);

                return comrades;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selSuiviEtudiant(IEtudiant)
	 */
	public ArrayList<HashMap<String, String>> selSuiviEtudiant(IEtudiant etudiant) {
		ArrayList<HashMap<String, String>> suivis = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> suivi = null;
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM FaireCours WHERE idGrp='"+etudiant.getIdGrp()+"' ORDER BY jour ASC");
		while(request.next()) {
                    suivi = new HashMap<String, String>();
                    suivi.put("codeMatiere", request.getString("codeMatiere"));
                    suivi.put("matricule", request.getString("matricule"));
                    suivi.put("codeSalle", request.getString("codeSalle"));
                    suivi.put("idSem", request.getString("idSem"));
                    suivi.put("idGrp", request.getString("idGrp"));
                    suivi.put("heureDebut", request.getString("heureDebut"));
                    suivi.put("heureFin", request.getString("heureFin"));
                    suivi.put("jour", request.getString("jour"));

			// On ajoute le suivi dans le ArrayList.
                    suivis.add(suivi);
		}
		return suivis;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selSuiviEnseignant(IEnseignant)
	 */
	public ArrayList<HashMap<String, String>> selSuiviEnseignant(IEnseignant enseignant) {
		ArrayList<HashMap<String, String>> suivis = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> suivi = null;
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM FaireCours WHERE matricule='"+enseignant.getMatricule()+"'");
		while(request.next()) {
                    suivi = new HashMap<String, String>();
                    suivi.put("codeMatiere", request.getString("codeMatiere"));
                    suivi.put("matricule", request.getString("matricule"));
                    suivi.put("codeSalle", request.getString("codeSalle"));
                    suivi.put("idSem", request.getString("idSem"));
                    suivi.put("idGrp", request.getString("idGrp"));
                    suivi.put("heureDebut", request.getString("heureDebut"));
                    suivi.put("heureFin", request.getString("heureFin"));
                    suivi.put("jour", request.getString("jour"));

			// On ajoute le suivi dans le ArrayList.
                    suivis.add(suivi);
		}
		return suivis;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selEtudiant(IEtudiant)
	 */
	public ArrayList<IEnseignant> selColleagues(IEnseignant enseignant) {
		ArrayList<IEnseignant> colleagues = new ArrayList<>();
		Enseignant ens;
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Enseignant WHERE codeDepartement='"+enseignant.getCodeDepartement()+"'");
		while(request.next()) {
                    ens = new Enseignant();
                    ens.setMatricule(request.getString("matricule"));
                    ens.setGradeEns(request.getString("gradeEns"));
                    ens.setCodeDepartement(request.getString("codeDepartement"));
                    colleagues.add(ens);
		}
                for(IEnseignant teacher: colleagues)
                    teacher.fillEns(teacher);

                return colleagues;
	}

}
