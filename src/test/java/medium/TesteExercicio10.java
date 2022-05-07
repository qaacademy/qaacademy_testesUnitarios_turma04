package medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteExercicio10 {
    Exercicio10 exercicio10;

    @Before
    public void before() {
        exercicio10 = new Exercicio10();
    }

    @Test
    public void testeFibonacciSemVetor() {
        Assert.assertEquals(34, exercicio10.calcularFibonacci(10));
    }

    @Test
    public void testeFibonacciComVetor() {
        int [] vetorEsperado = {0,1,1,2,3,5,8,13,21,34};
        Assert.assertArrayEquals(vetorEsperado, exercicio10.calcularFibonacciVetor(10));
    }



}
