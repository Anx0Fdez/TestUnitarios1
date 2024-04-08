import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicacionTest {

    @Test
    public void comprobarMultiplicacion(){
        assertEquals(6, Multiplicacion.multiplicar(2, 3));
    }
}
