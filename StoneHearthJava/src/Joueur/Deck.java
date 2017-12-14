/**
 * 
 */
package Joueur;

import java.util.Random;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Deck {
	private int id;
	public Deck(){
		Random r = new Random();
		id = r.nextInt();
	}
	public String getId() {
		return String.valueOf(id);
	}
	
	
	
}