package Ex_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    private Animal animal;

    @BeforeEach
    public void setUp(){
        animal =new Animal("Leao", Alimento.CARNE );
    }

    @Test
    public void testeComer(Alimento.CARNE){
        assertEquals();

    }
}
