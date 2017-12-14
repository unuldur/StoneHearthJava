/**
 * 
 */
package JoueurConnecte;

import Carte.Rarete;
import Interfaces.IJoueurConnecte;
import Interfaces.IJoueur;
import Interfaces.IPaiement;
import Interfaces.IStrategieOpenPack;

import java.util.Date;
import java.util.List;
import java.util.Set;

import Interfaces.ICarte;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GestJoueurConnecte implements IJoueurConnecte {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IJoueur iJoueur;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IPaiement iPaiement;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IStrategieOpenPack iStrategieOpenPack;
	
	
	public GestJoueurConnecte(IJoueur iJoueur, IPaiement iPaiement,
			IStrategieOpenPack iStrategieOpenPack) {
		super();
		this.iJoueur = iJoueur;
		this.iPaiement = iPaiement;
		this.iStrategieOpenPack = iStrategieOpenPack;
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#IsCoordoneeBancaireRemplie()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean IsCoordoneeBancaireRemplie() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return iJoueur.IsCoordoneeBancaireRemplie();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#ajoutCB(String type, String numero, String crypto, Date dateE)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Boolean ajoutCB(String type, String numero, String crypto, Date dateE) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return iJoueur.ajoutCB(type, numero, crypto, dateE);
		// end-user-code
	}
	

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#getCartePossedees()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<ICarte> getCartePossedees() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return iJoueur.getCartePossedees();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#getListeDeck()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<String> getListeDeck() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return iJoueur.getListeDeck();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#creerDeck()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String creerDeck() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return iJoueur.creerDeck();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#ajoutCarte(String Carte)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void ajoutCarte(String Carte) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		iJoueur.ajoutCarte(Carte);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#accederDeck(String idDeck)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<String> accederDeck(String idDeck) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return iJoueur.accederDeck(idDeck);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#supprimerDeck(String idDeck)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void supprimerDeck(String idDeck) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		iJoueur.supprimerDeck(idDeck);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#gererRang()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void gererRang() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		iJoueur.gererRang();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#offrirPack()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void offrirPack() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		iJoueur.offrirPack();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#ajouterCartesPackCollection(ICarte... cartes)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void ajouterCartesPackCollection(ICarte... cartes) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		iJoueur.ajouterCartesPackCollection(cartes);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#getCoordB()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getCoordB() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return iJoueur.getCoordB();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#ajouterPacks()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void ajouterPacks() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		iJoueur.ajouterPacks();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#getJoyaux()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getJoyaux() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return iJoueur.getJoyaux();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#enleverCartes(String nomCarte)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void enleverCartes(String nomCarte) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		iJoueur.enleverCartes(nomCarte);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#verifierAchatMax()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String verifierAchatMax() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return iJoueur.verifierAchatMax();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#getRang()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getRang() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return iJoueur.getRang();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#addDeck()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void addDeck() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		iJoueur.addDeck();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#ajouterJoyaux(Integer quantite)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void ajouterJoyaux(Integer quantite) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		iJoueur.ajouterJoyaux(quantite);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#havePackToOpen()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Boolean havePackToOpen() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return iJoueur.havePackToOpen();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#deletePack()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void deletePack() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		iJoueur.deletePack();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueurConnecte#AcheterEmplacementDeck(int prixDeck)
	 */
	public boolean AcheterEmplacementDeck(int prixDeck) {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		String bancaire = iJoueur.getCoordB();
		if(!iPaiement.payer(bancaire, prixDeck)){
			return false;
		}
		iJoueur.addDeck();
		return true;
		
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueurConnecte#creerCompteBancaire(String type, String numero, String crypto, Date dateE)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean creerCompteBancaire(String type, String numero,
			String crypto, Date dateE) {
		// begin-user-code
		if(!iPaiement.verifyCB(type, numero, crypto, dateE))
			return false;
		iJoueur.ajoutCB(type, numero, crypto, dateE);
		return true;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueurConnecte#supprimerCartes(String nomCarte)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void supprimerCartes(String nomCarte) {
		// begin-user-code
		List<ICarte> cartes = iJoueur.getCartePossedees();
		ICarte carte = null;
		for(ICarte c : cartes){
			if(c.getNom().equals(nomCarte)){
				carte = c;
				break;
			}
		}
		if(carte == null) return;
		Rarete r = carte.getRarete();
		int prix = 0;
		switch(r){
		case Commune:
			prix = 2;
			break;
		case Rare:
			prix = 5;
            break;
		case Legendaire:
			prix = 20;
		}
		if(prix == 0) return;
		iJoueur.ajouterJoyaux(prix);
		iJoueur.enleverCartes(nomCarte);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueurConnecte#ouvrirPack()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean ouvrirPack() {
		// begin-user-code
		if(!iJoueur.havePackToOpen()){
			return false;
		}
		List<ICarte> cartes = iStrategieOpenPack.ouvrirPack();
		iJoueur.deletePack();
		for(ICarte c: cartes){
			iJoueur.ajouterCartesPackCollection(c);
		}
		return true;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueurConnecte#acheterPacks(int nb, int prixUnPack)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean acheterPacks(int nb, int prixUnPack) {
		// begin-user-code
		if(!iJoueur.IsCoordoneeBancaireRemplie()){
			return false;
		}
		String cb = iJoueur.getCoordB();
		iPaiement.payer(cb, prixUnPack);
		iJoueur.ajouterPacks();
		return true;
		// end-user-code
	}
}