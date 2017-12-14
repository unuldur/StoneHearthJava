package Tests;

import java.util.*;

import Fabrique.SimpleFactory;
import Interfaces.ICarte;
import Interfaces.IJoueurConnecte;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestIntegration {
    /**
     * Pour ces test on considere le joueur anna qui a 4 cartes : "Petit Dragon", "Grand dragon", "Tres tres gros laser"
     * et "Robot Mignon", de plus elle à déjà 2 pack que l'on peux ouvrir.
     */
	@Test
	public void sequence1() {
		// La carte petit dragon ne doit apparaitre qu'une fois dans la collection d'anna

		//Création du Joueur anna
		SimpleFactory factory=new SimpleFactory();
		
		IJoueurConnecte annaConnectee=factory.createAnnaConnecte();
		
		// Recuperation du nombre de joyaux d'anna
		Integer nbJoyauxAvant = annaConnectee.getJoyaux();
		System.out.println("Nombre de joyaux d'Anna avant la destruction de la carte petit dragon");
		System.out.println(nbJoyauxAvant);

		// Recuperation des cartes possedees par anna
		List<ICarte> cartesAvant = annaConnectee.getCartePossedees();
		System.out.println("\nListe des cartes d'Anna avant la destruction de la carte petit dragon");
		for (ICarte carte: cartesAvant) {
			System.out.println(carte);
		}
		
		System.out.println("\nDestruction de la carte petit dragon");
		// Suppression de la carte petit dragon
		assertTrue(annaConnectee.supprimerCartes("Petit Dragon"));

		// Recuperation du nombre de joyaux possedees pas anna apres la destruction de la carte
		// Il doit etre egal a nbJoyauxAvant + 2
		Integer nbJoyauxApres = annaConnectee.getJoyaux();
		System.out.println("\nNombre de joyaux d'Anna apres la destruction de la carte petit dragon");
		System.out.println(nbJoyauxApres);

		// Recuperation des cartes possedees par anna apres la destruction de la carte
		// La carte petit dragon ne doit plus apparaitre
		List<ICarte> cartesApres = annaConnectee.getCartePossedees();
		System.out.println("\nListe des cartes d'Anna apres la destruction de la carte petit dragon");
		for (ICarte carte: cartesApres) {
			System.out.println(carte);
		}

		// Test de la presence de la carte petit dragon dans la collection d'anna
		boolean presence_carte = false;
		for (ICarte s : cartesApres) {
			if (s.getNom().equals("petit dragon")){
				presence_carte = true;
			}
		}

		assertTrue(nbJoyauxApres == nbJoyauxAvant + 2 && !presence_carte);
		assertFalse(annaConnectee.supprimerCartes("Carte inconnue"));
		assertFalse(annaConnectee.supprimerCartes("Grand Dragon")); //carte basique
	
	}	

	@Test
	public void sequence2() {
		
		//Création du Joueur anna
		SimpleFactory factory=new SimpleFactory();

		IJoueurConnecte annaConnectee=factory.createAnnaConnecte();
		
		// Recuperation du nombre de pack d'anna
		int nbPackAvant = annaConnectee.getPack();
		System.out.println("Nombre de packs d'Anna avant l'ouverture du pack");
		System.out.println(nbPackAvant);
		
		// Recuperation des cartes possedees par anna
		List<ICarte> cartesAvant = annaConnectee.getCartePossedees();
		int nbCarteAvant = cartesAvant.size();
		System.out.println("\nListe des cartes d'Anna avant l'ouverture du pack");
        for (ICarte carte: cartesAvant) {
            System.out.println(carte);
        }
		
		System.out.println("\nOuverture du pack");
		// Ouverture d'un pack
		assertTrue(annaConnectee.ouvrirPack());
		
		// Recuperation du nombre de pack d'anna apres l'ouverture du pack
		// Il doit etre egal a nbPackAvant - 1
		int nbPackApres = annaConnectee.getPack();
		System.out.println("\nNombre de packs d'Anna apres l'ouverture du pack");
		System.out.println(nbPackApres);

		// Recuperation des cartes possedees par anna apres l'ouverture du pack
		// La longueur de carteApres doit etre egal a la longueur de catreAvant + 5
		List<ICarte> cartesApres = annaConnectee.getCartePossedees();
		System.out.println("\nListe des cartes d'Anna apres l'ouverture du pack");
        for (ICarte carte: cartesApres) {
            System.out.println(carte);
        }
		

		assertTrue(nbCarteAvant == cartesApres.size() - 5 && nbPackApres == nbPackAvant - 1);
		assertTrue(annaConnectee.ouvrirPack());
		assertFalse(annaConnectee.ouvrirPack()); //anna n'a plus de pack
	}

}
