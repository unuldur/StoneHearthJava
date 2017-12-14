/**
 * 
 */
package Fabrique;

import Carte.Carte;
import Carte.Rarete;
import DicoCarte.GestCartes;
import Interfaces.ICarte;
import Interfaces.IDicoCartes;
import Interfaces.IJoueur;
import Interfaces.IMoteurJeu;
import Interfaces.IPaiement;
import Interfaces.IStrategieOpenPack;
import Interfaces.IJoueurs;
import Interfaces.IConnexion;
import Interfaces.IJoueurConnecte;
import JoueurConnecte.GestJoueurConnecte;
import MoteurDeJeu.SimpleMoteurDeJeu;
import Paiement.SimplePaiement;
import StrategiePack.SimpleStrategiePack;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SimpleFactory {
	
	private IDicoCartes collection;
	
	public SimpleFactory() {
		collection = new GestCartes();
		collection.addCarte(new Carte("Petit Dragon", "Petit dragon deviendra grand !", 2, 2, Rarete.Basique));
		collection.addCarte(new Carte("Grand Dragon", "Il est fort maintenant !", 6, 3, Rarete.Basique));
		collection.addCarte(new Carte("Dragon de la mort", "Ses apprentissages des arts martiaux ont payés", 12, 12, Rarete.Basique));
		collection.addCarte(new Carte("Robot Mignon", "🤖 <3 🤖", 1, 3, Rarete.Commune)); // avec mes betises, y a des chances que ne fonctionne
		collection.addCarte(new Carte("Robot Colerique", "🤖  >_< 🤖", 2, 7, Rarete.Rare)); // avec mes betises, y a des chances que ne fonctionne
		collection.addCarte(new Carte("Petit laser", "Piou piou", 4, 1, Rarete.Commune));
		collection.addCarte(new Carte("Tres tres gros laser", "PIOU PIOU", 9, 1, Rarete.Rare));
		collection.addCarte(new Carte("Mage Primaire", "Il est encore à l'école", 1, 1, Rarete.Commune));
		collection.addCarte(new Carte("Elfe Normale", "Longues oreilles, longs cheveux et long nez", 4, 5, Rarete.Commune));
		collection.addCarte(new Carte("Antodas", "Coeur de pierre ? Jamais entendu parler", 5, 7, Rarete.Legendaire));
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ICarte createCarte(String nom, String description, int attaque, int defense, Rarete rarete) {
		// begin-user-code
		return new Carte(nom, description, attaque, defense, rarete);
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
		IDicoCartes dico = new GestCartes();
		for (ICarte iCarte : cartes) {
			dico.addCarte(iCarte);
		}
		return dico;
		// end-user-code
	}
	
	public IDicoCartes createDicoCartes() {
		// begin-user-code
		return new GestCartes();
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
		return new SimpleMoteurDeJeu();
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
		return new SimplePaiement();
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
		return new SimpleStrategiePack(dicoCarte);
		// end-user-code
	}

	/**
	 * Retourne un IStrategieOpenPack sur la collection
	 * @return
	 */
	public IStrategieOpenPack createStrategiePack() {
		// begin-user-code
		return new SimpleStrategiePack(collection);
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
		return new GestJoueurConnecte(joueur, paiement, stratOpenPack);
		// end-user-code
	}
}