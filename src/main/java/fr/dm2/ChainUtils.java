package fr.dm2;

import java.util.ArrayList;

/**
 * TODO: Implémentez les méthodes de la classe courante. Vous n'avez pas le droit de modifier la signature des méthodes.
 */
public class ChainUtils {

	/**
	 * Prend une chaine de caractères en paramètre et retourne le mot avec la première lettre en majuscule.
	 *
	 * Ex: en entrée "jE sUIS baTMan" retournera "Je Suis Batman"
	 *
	 * @param chain		Chaine de caractères
	 * @return
	 */
	public String capitalize(String chain) {
		ArrayList<String> array = new ArrayList<String>();
		String lChain;
		String[] arrayWord = chain.split(" ");
		for(String word : arrayWord){
			array.add(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
		}
		lChain = String.join(" ", array);
		String lChain1 = lChain;
		return lChain1;
	}

	}

