package taudemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class WithAssertionTest {

    @Test
     void firstAssert (){
        assertEquals(2,2);
    }

    @Test
     void secondAssert(){
        assertEquals(45,45);
    }
}
