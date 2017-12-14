/**
 *
 */
package Interfaces;

import java.util.List;

import Carte.Rarete;
import Carte.*;
import java.util.Set;
import java.util.List;

/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IDicoCartes {
	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<ICarte> getAllCartes();

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param nom
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ICarte getCarte(String nom);

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param Carte
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void addCarte(ICarte Carte);

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param nom
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void supprimerCarte(String nom);

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param cartes
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void addCartes(List<ICarte> cartes);

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param rarete
	 * @return
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ICarte getCarteRandom(Rarete rarete);
}
