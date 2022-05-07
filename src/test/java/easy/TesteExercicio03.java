package easy;

import easy.Exercicio03;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio03 {

    @Test
    public void testeTxibeValoresTrocados(){

        String mensagem =  "O valor do primeiro numero é :20\n"
                +"O valor do segundo numero é :10";
        Exercicio03 exercicio03 = new Exercicio03();
        Assert.assertEquals(mensagem, exercicio03.exibeValoresTrocados(10, 20));

    }
}
