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


public class Sequence1 {
	
	@Test
	public void test() {
		
	//Création du Compte
	SimpleFactory factory=new SimpleFactory();

	IJoueurConnecte annaConnectee=factory.createAnnaConnecte();
	
	
	Integer nbPackAvant = annaConnectee.getPack();
	Set<String> catresAvant = annaConnectee.getCartePossedees();
	
	Boolean ouverturePack = annaConnectee.ouvrirPack();
	
	Integer nbPackApres = annaConnectee.getPack();
	Set<String> catresApres = annaConnectee.getCartePossedees();
	
	System.out.println("Nombre de packs d'Anna avant l'ouverture du pack");
	System.out.println(nbPackAvant);
	System.out.println("Liste des cartes d'Anna avant l'ouverture du pack");
	System.out.println(catresAvant);
	System.out.println("Nombre de packs d'Anna apres l'ouverture du pack");
	System.out.println(nbPackApres);
	System.out.println("Liste des cartes d'Anna apres l'ouverture du pack");
	System.out.println(catresApres);
	
	/*    BUT:
	
	- afficher les packs de Anna + leur nombre
	- afficher nombre de cartes de la collection de Anna
	- appeler la fonction "Ouvrir Pack"
	
	- afficher les packs de Anna + leur nombre =====> -1
	- afficher nombre de cartes de la collection de Anna =====> +5
	
	
	*/
	
	
	
	
	
		System.out.println(e1.accepte(vd));
		assertEquals(,);
		
		
		
		
	}

}
