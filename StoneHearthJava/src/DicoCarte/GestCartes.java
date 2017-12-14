/**
 *
 */
package DicoCarte;

import Interfaces.IDicoCartes;



import Interfaces.ICarte;
import Carte.Carte;
import Carte.Rarete;

import java.util.*;
/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GestCartes implements IDicoCartes {
	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private List<ICarte> cartes=new ArrayList<>();



	private GestCartes(List<ICarte> cartes){
		this.cartes=cartes;
	}
	/**
	 * (non-Javadoc)
	 * @see IDicoCartes#getAllCartes()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<ICarte> getAllCartes() {

		return cartes;
	}

	/**
	 * (non-Javadoc)
	 * @see IDicoCartes#getCarte(String nom)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */


	//returner  la 1ere ICarte
	public ICarte getCarte(String nom) {


		for(ICarte e :cartes){

			if(e.getNom().equals(nom)){
				 return e;
			}

		}

		return null;
	}

	/**
	 * (non-Javadoc)
	 * @see IDicoCartes#addCarte(ICarte Carte)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void addCarte(ICarte carte) {

		cartes.add(carte);
	}

	/**
	 * (non-Javadoc)
	 * @see IDicoCartes#supprimerCarte(String nom)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void supprimerCarte(String nom) {

		for(ICarte e :cartes){

			if(e.getNom().equals(nom)){
				 cartes.remove(e);
			}

		}

	}

	/**
	 * (non-Javadoc)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void addCartes(List<ICarte> cartes) {

		this.cartes.addAll(cartes);
	}

	/**
	 * (non-Javadoc)
	 * @see IDicoCartes#getCarteRandom(Rarete rarete)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ICarte getCarteRandom(Rarete rarete) {

		List<ICarte> lr= new ArrayList<>();

		for(ICarte e :cartes){

			if(e.getRarete().equals(rarete))
				lr.add(e);

		}

		Random r= new Random();
		int rndm =r.nextInt(lr.size());
		return lr.get(rndm);



	}
}
