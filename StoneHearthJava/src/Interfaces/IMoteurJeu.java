/**
 * 
 */
package Interfaces;

import Joueur.Joueur;
import Joueur.Deck;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IMoteurJeu {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param joueur1
	 * @param deck1
	 * @param joueur2
	 * @param deck2
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean jouer(Joueur joueur1, Deck deck1, Joueur joueur2, Deck deck2);
}