/**
 * 
 */
package Prix;

import Interfaces.IPrix;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Price{
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static double prixPackEuro = 1.39;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static double prixPackDollars = 1.99;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static double prixDeckEuro = 2.;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static double prixDeckDollars = 3.;

	/** 
	 * (non-Javadoc)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static double getPrixDeck(String Region) {
		// begin-user-code
		if(Region.equals("France"))
			return prixDeckEuro;
		else
		    return prixDeckDollars;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static double getPrixPack(String Region) {
		// begin-user-code
        if(Region.equals("France"))
            return prixPackEuro;
        else
            return prixPackDollars;
		// end-user-code
	}
}