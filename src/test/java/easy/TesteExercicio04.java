package easy;

import easy.Exercicio04;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio04 {

    @Test
    public void testecalcularDobro(){

        Exercicio04 exercicio04 = new Exercicio04();
        Assert.assertEquals(20, exercicio04.calcularDobro(10));

    }
}
