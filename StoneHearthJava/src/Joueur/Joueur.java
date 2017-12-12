/**
 * 
 */
package Joueur;

import Interfaces.IJoueur;
import Interfaces.IDicoCartes;

import java.util.Date;
import java.util.Set;
import java.util.List;

import Carte.*;
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
		return (coordonneesBancaire!=null) ;
		
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#ajoutCB(String type, String numero, String crypto, Date dateE)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Boolean ajoutCB(String type, String numero, String crypto, Date dateE) {
		// begin-user-code
		this.coordonneesBancaire=new CoordonneesBancaire(numero,crypto,dateE);
		return (coordonneesBancaire!=null) ;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#getCartePossedees()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<Carte> getCartePossedees() {
		// begin-user-code
		
		return this.dicoCartes.getAllCartes();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#getListeDeck()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Deck> getListeDeck() {
		// begin-user-code
		return this.decks;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#creerDeck()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String creerDeck() {
		// begin-user-code
		Deck d = new Deck();
		this.decks.add(d);
		return d.getId();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#ajoutCarte(String Carte)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void ajoutCarte(Carte carte) {
		// begin-user-code
		this.dicoCartes.addCarte(carte);

		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#accederDeck(String idDeck)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<String> accederDeck(String idDeck) {
		// begin-user-code
		
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
		

		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#offrirPack()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void offrirPack() {
		// begin-user-code
		this.nbPack++;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#ajouterCartesPackCollection(ICarte... cartes)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void ajouterCartesPackCollection(ICarte... cartes) {
		// begin-user-code
		this.dicoCartes.addCartes(cartes);
		
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#getCoordB()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getCoordB() {
		// begin-user-code
		return this.coordonneesBancaire.toString();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#ajouterPacks()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void ajouterPacks() {
		// begin-user-code
		this.nbPack++;

		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#getJoyaux()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getJoyaux() {
		// begin-user-code
		return this.joyaux;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#enleverCartes(String nomCarte)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void enleverCartes(String nomCarte) {
		// begin-user-code
		this.dicoCartes.supprimerCarte(nomCarte);

		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#verifierAchatMax()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Rarete verifierAchatMax() {
		// begin-user-code
		int nb=this.joyaux;
		if (nb<20)
			return Rarete.Basique;
		if(nb < 50 )
			return Rarete.Commune;
		if(nb < 200 )
			return Rarete.Rare;
		
		return Rarete.Legendaire;
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
		return this.rang;
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
		this.joyaux+=quantite;

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
		return (this.nbPack>0);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IJoueur#deletePack()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void deletePack() {
		// begin-user-code
		this.nbPack--;

		// end-user-code
	}

}