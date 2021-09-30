package agh.ii.prinjava.lab01.lst01_01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class HelloEncapsulationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void  val43 (){

        // int propVal = enDemo.propVal; // (!)
        // Pour lire ou modifier la valeur de "propVal", on ne peut pas y accéder directement
        // à cause du modificateur d'accès ("private"). Au lieu:
        HelloEncapsulation enDemo =  new  HelloEncapsulation ( 42 );
        int propVal = enDemo . getPropVal();
        propVal ++ ;
        assertEquals( 43 , propVal);
    }
}