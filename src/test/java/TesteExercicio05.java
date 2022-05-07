import easy.Exercicio05;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio05 {

    @Test
    public void testExercicio05CalcularSoma() {

        Exercicio05 exercicio05 = new Exercicio05();
        Assert.assertEquals(60, exercicio05.calcularSoma(10, 20, 30));
    }

    @Test
    public void testeCalcularSubtracao(){
        Exercicio05 exercicio05 = new Exercicio05();
        Assert.assertEquals(30, exercicio05.calcularSubtracao(60,20,10));

    }

    @Test
    public void testMultiplicacao(){
        Exercicio05 exercicio05 = new Exercicio05();
        Assert.assertEquals(400, exercicio05.calcularMultiplicacao(2,10,20));

    }

    @Test
    public void testCalcularMedia(){
        Exercicio05 exercicio05 = new Exercicio05();
        Assert.assertEquals("5.0", String.valueOf(exercicio05.calcularMedia(5,5,5)));
    }
}
