/**
 * 
 */
package Joueur;

import Interfaces.IJoueur;
import Interfaces.IDicoCartes;

import java.util.Date;
import java.util.Set;

import Interfaces.ICarte;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Joueur implements IJoueur {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer joyaux;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer rang;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String pseudo;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer nbParties;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer nbDecks;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IDicoCartes dicoCartes;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer nbPack;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CoordonneesBancaire coordonneesBancaire;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Deck> decks;

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#IsCoordoneeBancaireRemplie()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean IsCoordoneeBancaireRemplie() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return false;
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
		return null;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#getCartePossedees()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<String> getCartePossedees() {
		// begin-user-code
		// TODO Module de remplacement de m�thode auto-g�n�r�
		return null;
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
		return null;
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
		return null;
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
		return null;
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
		return null;
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
		return null;
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
		return null;
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
		return 0;
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
		return null;
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

		// end-user-code
	}
	

	public int getPack(){
		return this.nbPack;
	}
}