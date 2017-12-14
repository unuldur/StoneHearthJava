/**
 * 
 */
package Carte;

import Interfaces.ICarte;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Carte implements ICarte {
	
	public Carte(String nom, String description, Integer attaque,
			Integer defense, Rarete rarete) {
		this.nom = nom;
		this.description = description;
		this.attaque = attaque;
		this.defense = defense;
		this.rarete = rarete;
	}

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String nom;
	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String description;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer attaque;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer defense;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Rarete rarete;

	/** 
	 * (non-Javadoc)
	 * @see ICarte#getRarete()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Rarete getRarete() {
		// begin-user-code
		return rarete;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICarte#getNom()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getNom() {
		// begin-user-code
		return nom;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICarte#getAttaque()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getAttaque() {
		// begin-user-code
		return attaque;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICarte#getDefense()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getDefense() {
		// begin-user-code
		return defense;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ICarte#getDescription()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getDescription() {
		// begin-user-code
		return description;
		// end-user-code
	}
}