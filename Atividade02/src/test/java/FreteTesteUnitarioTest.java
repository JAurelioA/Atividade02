import junit.framework.*;


public class FreteTesteUnitarioTest extends TestCase {
    public void testCalculoFrete() {
        CalcularFrete calcularFrete = new CalcularFrete();
        Frete frete = new FreteFracionado();
        calcularFrete.setFrete(frete);
        double ValorEsperado = 100;

        double ValorFeito = calcularFrete.valorFrete();

        assertEquals(ValorEsperado,ValorFeito,0);

    }

}
