package easy;

import easy.Exercicio02;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio02 {
    @Test
    public void testePalavraDigitada() {
        Exercicio02 exercicio02 = new Exercicio02();
        Assert.assertEquals("Voce digitou: Teste", exercicio02.retornaPalavraDigitada("Teste"));
    }
}
