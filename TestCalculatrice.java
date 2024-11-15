import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculatrice {
    public static void test_des_opperation() throws Exception{
        Nombre six = new Nombre(6) ;  
        Nombre dix = new Nombre(10) ;
        Nombre zero = new Nombre(0) ;
        
        Operation s = new Soustraction(dix,six) ;
        Operation a = new Addition(dix,six);
        Operation m = new Multiplication(dix,six);
        Operation d = new Division(dix,six);
        
        assertEquals(s.valeur(), 4);
        assertEquals(a.valeur(), 16);
        assertEquals(m.valeur(), 60);

    }
}
