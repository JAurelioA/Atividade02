import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class FreteTesteMockTest {
    @Test
    public void test_FreteTest(){
        Frete frete = new FreteFracionado();
        CalcularFrete calcularFreteMock = mock(CalcularFrete.class);
        calcularFreteMock.setFrete(frete);


        when(calcularFreteMock.valorFrete()).thenReturn(100.0);

        assertEquals(100.0,calcularFreteMock.valorFrete());

    }

}
