package fr.dm2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Comme vu en cours avec la fonction `generateSpaceTabs()`,
 * pour chaque fonction de la classe {@link ListUtils},
 * testez le cas nominal, vide (cf: 0 et/ou null et/ou ""), et d'erreur.
 * N'oubliez pas d'indiquer le nom des trois blocs dans chacunes de vos fonctions de test (cf: GIVEN/WHEN/THEN)
 */
public class ListUtilsTest {
	private ListUtils listUtils = new ListUtils();

	// TODO: Créez les méthodes de test ICI
	@Test
	public void cutTest(){
		//GIVEN
		List<String> liste = new ArrayList<>();
		liste.add("Hello");
		liste.add("World");
		List<List<String>> expected = new ArrayList<List<String>>();
		expected.add(new ArrayList<String>(liste.subList(0,2)));
		expected.add(new ArrayList<String>(liste.subList(2,4)));
		List<List<String>> testListe;

		//WHEN
		testListe = listUtils.cut(liste, 2);
		//THEN
		Assert.assertEquals(expected, testListe);
	}

	@Test
	public void cutTest_nominal_empty(){
		//GIVEN
		List<String> a = new ArrayList<>();
		List<List<String>> actual;
		List<List<String>> expected = new ArrayList<>();
		//WHEN
		actual = listUtils.cut(a, 2);
		//THEN
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = RuntimeException.class)
	public void cutTest_nominal_error(){
		//GIVEN

		//WHEN
		listUtils.cut(null, 2);
		//THEN => EXCEPTION
	}
}
