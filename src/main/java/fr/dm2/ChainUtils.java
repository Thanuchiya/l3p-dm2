package fr.dm2;

import java.util.ArrayList;

/**
 * TODO: Implémentez les méthodes de la classe courante. Vous n'avez pas le droit de modifier la signature des méthodes.
 */
public class ChainUtils {

    /**
     * Prend une chaine de caractères en paramètre et retourne le mot avec la première lettre en majuscule.
     * <p>
     * Ex: en entrée "jE sUIS baTMan" retournera "Je Suis Batman"
     *
     * @param chain Chaine de caractères
     * @return
     */

    public String capitalize(String chain) throws IllegalArgumentException {
        // TODO
        if (chain == null) {
            throw new IllegalArgumentException();
        }
        String word = null;
        String item[] = chain.split(" ");
        for (String each : item) {
            word = word + each.substring(0, 1).toUpperCase() + each.substring(1).toLowerCase() + " ";
        }
        word = word.trim();
        return word;
    }

}