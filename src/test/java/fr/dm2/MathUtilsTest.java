package fr.dm2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Comme vu en cours avec la fonction `generateSpaceTabs()`,
 * pour chaque fonction de la classe {@link MathUtils},
 * testez le cas nominal, vide (cf: 0 et/ou null et/ou ""), et d'erreur.
 * N'oubliez pas d'indiquer le nom des trois blocs dans chacunes de vos fonctions de test (cf: GIVEN/WHEN/THEN)
 * Vous ne devrez PAS modifier la classe {@link MathUtils}, mais observez attentivement l'implémentation des méthodes de la classe {@link MathUtils}
 */
public class MathUtilsTest {
	private MathUtils mathUtils = new MathUtils();

	// TODO: Créez les méthodes de test ICI
    @Test
    public void powerTest(){
        //GIVEN
        int expected = 4096;
        //WHEN
		int actual = mathUtils.power(8, 4);
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialTest(){
        //GIVEN
        int actual;
        int expected = 6;

        //WHEN
        actual = mathUtils.factorial(3);

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialTest_under_zero(){
        //GIVEN

        //WHEN
        mathUtils.factorial(-10);

        //THEN => EXCEPTION
    }

    @Test
    public void fibonacciTest(){
        //GIVEN
        int actual;
        int expected = 6765;
        //WHEN
        actual = mathUtils.fibonacci(20);
        //THEN
        Assert.assertEquals(expected, actual);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void fibonacciTest_error(){
        //GIVEN
        //WHEN
        mathUtils.fibonacci(-10);
        //THEN => EXCEPTION
    }
}


