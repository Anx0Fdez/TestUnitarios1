import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaTest {

    @Test
    public void comprobarResta(){
        assertEquals(5, Resta.restar(15, 10));
    }
}
