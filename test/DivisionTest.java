import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {

    @Test
    public void comprobarDivision(){
        assertEquals(3, Division.dividir(6, 2));
    }
}
