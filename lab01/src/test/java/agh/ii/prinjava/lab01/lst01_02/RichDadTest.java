package agh.ii.prinjava.lab01.lst01_02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RichDadTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void  testNom (){
        RichDad richDad =  new  RichDad ( " R " , " Doe ", BigDecimal.valueOf(10), List.of("School Mate") );
        //papa riche . augmenter la richesse();
        // ...

        RichDadsKid richDadsKid =
                new RichDadsKid ( " Mike " , richDad.surname, richDad.getFortune(), richDad.getContacts());
       // assertEquals( " Doe " , richDadsKid.surname);

    }
}