/**
 * 
 */
package Fabrique;

import Interfaces.ICarte;
import Interfaces.IDicoCartes;
import Interfaces.IJoueur;
import Interfaces.IMoteurJeu;
import Interfaces.IPaiement;
import Interfaces.IStrategieOpenPack;
import Interfaces.IJoueurs;
import Interfaces.IConnexion;
import Interfaces.IJoueurConnecte;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SimpleFactory {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param nom 
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ICarte createCarte(String nom) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param cartes
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IDicoCartes createDicoCartes(ICarte... cartes) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param collection
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IJoueur createJoueur(IDicoCartes collection) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IMoteurJeu createMoteurDeJeu() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IPaiement createPaiment() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param dicoCarte
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IStrategieOpenPack createStrategiePack(IDicoCartes dicoCarte) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param joueurs
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IJoueurs createJoueurs(IJoueur... joueurs) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ensembleJoueurs
	 * @param JoueursCherchantPartie
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IConnexion createConnexion(IJoueurs ensembleJoueurs,
			IJoueurs JoueursCherchantPartie) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param joueur
	 * @param paiement
	 * @param stratOpenPack
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IJoueurConnecte createJoueurConnecte(IJoueur joueur,
			IPaiement paiement, IStrategieOpenPack stratOpenPack) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return null;
		// end-user-code
	}

	public IJoueurConnecte createAnnaConnecte() {
		// TODO Module de remplacement de méthode auto-généré
		// createCarte dans Factory doit avoir des parametres !!
		IDicoCartes dicoCollectionAll = createDicoCartes();

		ICarte c2 = dicoCollectionAll.getCarte("");
		ICarte c4 = dicoCollectionAll.getCarte("");
		ICarte c6 = dicoCollectionAll.getCarte("");
		
		IDicoCartes dicoCarteAnna = createDicoCartes(c2, c4, c6);

		
		//création de 2 joueurs 
		IJoueur anna=createJoueur(dicoCarteAnna);
		
		
		//créer un joueur connecté 
		IPaiement pAnna= createPaiment();
		IStrategieOpenPack stratOpenPackAnna=createStrategiePack(dicoCollectionAll);

		IJoueurConnecte annaConnectee=createJoueurConnecte(anna,pAnna,stratOpenPackAnna);
		
		return annaConnectee;
	}
}