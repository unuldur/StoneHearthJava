/**
 * 
 */
package StrategiePack;

import java.util.ArrayList;

import Carte.Rarete;
import Interfaces.IStrategieOpenPack;
import Interfaces.IDicoCartes;
import Interfaces.ICarte;

/** 
 * <!-- begin-UML-doc -->
 * genereRareteSimple = 3 Communes, 1 Rare, 1 Legendaire
 * <!-- end-UML-doc -->
 * @author julie
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class SimpleStrategiePack implements IStrategieOpenPack {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IDicoCartes dicoCarte;

	public SimpleStrategiePack(IDicoCartes dicoCarte) {
		this.dicoCarte = dicoCarte;
	}

	/** 
	 * (non-Javadoc)
	 * @see IStrategieOpenPack#ouvrirPack()
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<ICarte> ouvrirPack() {
		// begin-user-code
		// 3 Communes, 1 Rare, 1 Legendaire
		Rarete[] probas = genereRareteSimple();
		ArrayList<ICarte> cartes = new ArrayList<>();
		for (Rarete rarete : probas)
			cartes.add(dicoCarte.getCarteRandom(rarete));
		return cartes;
		// end-user-code
	}

	private Rarete[] genereRareteSimple() {
		Rarete res[] = new Rarete[5];
		res[0] = Rarete.Commune;
		res[1] = Rarete.Commune;
		res[2] = Rarete.Commune;
		res[3] = Rarete.Rare;
		res[4] = Rarete.Legendaire;
		return res;
	}
	
	/*
	 * Probas : 1% leg ; 20% rare ; au moins une rare par pack
	 *
	private Rarete[] genereRareteComplexe() {
		Rarete res[] = new Rarete[5];
		boolean quota = false;
		for (int j = 0; j < res.length; j++) {
			double i = Math.random();
			if (i < 0.01) {
				res[j] = Rarete.Legendaire;
				quota = true;
			}
			else if (i < 0.2) {
				res[j] = Rarete.Rare;
				quota = true;
			}
			else
				res[j] = Rarete.Commune;
			
		}
		if (!quota)
			res[0] = Rarete.Rare;
		return res;
	}*/
}