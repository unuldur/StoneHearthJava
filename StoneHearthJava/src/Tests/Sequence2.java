package Tests;

import java.util.*;

import Fabrique.SimpleFactory;
import Interfaces.ICarte;
import Interfaces.IDicoCartes;
import Interfaces.IJoueur;
import Interfaces.IMoteurJeu;
import Interfaces.IPaiement;
import Interfaces.IStrategieOpenPack;
import Interfaces.IJoueurs;
import Interfaces.IConnexion;
import Interfaces.IJoueurConnecte;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Sequence2 {
	
	@Test
	public void test() {
		
	//Création du Compte
	SimpleFactory factory=new SimpleFactory();

	
	IJoueurConnecte annaConnectee=factory.createAnnaConnecte();
	
	Set<String> catresAvant = annaConnectee.getCartePossedees();
	Integer nbJoyauxAvant = annaConnectee.getJoyaux();
	
	annaConnectee.supprimerCartes("petit dragon");

	Integer nbJoyauxApres = annaConnectee.getJoyaux();
	Set<String> catresApres = annaConnectee.getCartePossedees();
	
	System.out.println("Nombre de joyaux d'Anna avant la destruction de la carte");
	System.out.println(nbJoyauxAvant);
	System.out.println("Liste des cartes d'Anna avant la destruction de la carte");
	System.out.println(catresAvant);
	System.out.println("Nombre de packs d'Anna apres la destruction de la carte");
	System.out.println(nbJoyauxApres);
	System.out.println("Liste des cartes d'Anna apres la destruction de la carte");
	System.out.println(catresApres);
	
	/*
	 Afficher les cartes d'Anna
	 Afficher les joyaux d'Anna
	 Supprimer la carte petit dragon
	 Afficher les cartes d'Anna ==> la carte petit dragon n'apparaît plus
	 Afficher le nombre de joyaux d'Anna ==> +2
	 */
	
	System.out.println(e1.accepte(vd));
	assertEquals(,);
	
	
	}
}
