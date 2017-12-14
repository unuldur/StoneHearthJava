package Tests;

import java.util.*;

import Fabrique.SimpleFactory;
import Interfaces.ICarte;
import Interfaces.IJoueurConnecte;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestIntegration {
	
	@Test
	public void sequence1() {
		// La carte petit dragon ne doit apparaitre qu'une fois dans la collection d'anna

		//Création du Joueur anna
		SimpleFactory factory=new SimpleFactory();
		
		IJoueurConnecte annaConnectee=factory.createAnnaConnecte();
		
		// Recuperation du nombre de joyaux d'anna
		Integer nbJoyauxAvant = annaConnectee.getJoyaux();
		/*System.out.println("Nombre de joyaux d'Anna avant la destruction de la carte petit dragon");
		System.out.println(nbJoyauxAvant);*/

		// Recuperation des cartes possedees par anna
		List<ICarte> catresAvant = annaConnectee.getCartePossedees();
		/*System.out.println("Liste des cartes d'Anna avant la destruction de la carte petit dragon");
		System.out.println(catresAvant);
		
		System.out.println("Destruction de la carte petit dragon");*/
		// Suppression de la carte petit dragon
		annaConnectee.supprimerCartes("petit dragon");

		// Recuperation du nombre de joyaux possedees pas anna apres la destruction de la carte
		// Il doit etre egal a nbJoyauxAvant + 2
		Integer nbJoyauxApres = annaConnectee.getJoyaux();
		/*System.out.println("Nombre de packs d'Anna apres la destruction de la carte petit dragon");
		System.out.println(nbJoyauxApres);*/

		// Recuperation des cartes possedees par anna apres la destruction de la carte
		// La carte petit dragon ne doit plus apparaitre
		List<ICarte> catresApres = annaConnectee.getCartePossedees();
		/*System.out.println("Liste des cartes d'Anna apres la destruction de la carte petit dragon");
		System.out.println(catresApres);*/

		// Test de la presence de la carte petit dragon dans la collection d'anna
		boolean presence_carte = false;
		for (ICarte s : catresApres) {
			if (s.getNom().equals("petit dragon")){
				presence_carte = true;
			}
		}

		assertTrue(nbJoyauxApres == nbJoyauxAvant + 2 && !presence_carte);
	
	}	

	@Test
	public void sequence2() {
		
		//Création du Joueur anna
		SimpleFactory factory=new SimpleFactory();

		IJoueurConnecte annaConnectee=factory.createAnnaConnecte();
		
		// Recuperation du nombre de pack d'anna
		Integer nbPackAvant = annaConnectee.getPack();
		/*System.out.println("Nombre de packs d'Anna avant l'ouverture du pack");
		System.out.println(nbPackAvant);*/
		
		// Recuperation des cartes possedees par anna
		List<ICarte> cartesAvant = annaConnectee.getCartePossedees();
		/*System.out.println("Liste des cartes d'Anna avant l'ouverture du pack");
		System.out.println(cartesAvant);
		
		System.out.println("Ouverture du pack");*/
		// Ouverture d'un pack
		Boolean ouverturePack = annaConnectee.ouvrirPack();
		
		// Recuperation du nombre de pack d'anna apres l'ouverture du pack
		// Il doit etre egal a nbPackAvant - 1
		Integer nbPackApres = annaConnectee.getPack();
		/*System.out.println("Nombre de packs d'Anna apres l'ouverture du pack");
		System.out.println(nbPackApres);*/

		// Recuperation des cartes possedees par anna apres l'ouverture du pack
		// La longueur de carteApres doit etre egal a la longueur de catreAvant + 5
		List<ICarte> catresApres = annaConnectee.getCartePossedees();
		/*System.out.println("Liste des cartes d'Anna apres l'ouverture du pack");
		System.out.println(catresApres);*/
		

		assertTrue(cartesAvant.size() == catresApres.size() - 5 && nbPackApres == nbPackAvant - 1);
		
		
		
		
	}

}
