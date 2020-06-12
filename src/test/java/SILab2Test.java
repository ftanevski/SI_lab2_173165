import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    SILab2 si = new SILab2();
    @Test
    void function() {
        assertEquals(si.function(new User("filip", "password", null), null), false)
        assertEquals(si.function(new User(), null), false)
        assertEquals(si.function(new User(), null), false)
    }
}