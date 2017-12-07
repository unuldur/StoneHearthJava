/**
 * 
 */
package Paiement;

import java.util.Date;

import Interfaces.IPaiement;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SimplePaiement implements IPaiement {
	/** 
	 * (non-Javadoc)
	 * @see IPaiement#verifyCB(String type, String numero, String crypto, Date dateE)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Boolean verifyCB(String type, String numero, String crypto,
			Date dateE) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see IPaiement#payer(String CB, float montant)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean payer(String CB, float montant) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return false;
		// end-user-code
	}
}