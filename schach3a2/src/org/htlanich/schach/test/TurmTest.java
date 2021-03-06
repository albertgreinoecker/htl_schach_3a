package org.htlanich.schach.test;

import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.SpielFeldIO;
import org.htlanich.schach.figur.Turm;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.lang.model.util.SimpleElementVisitor6;
import java.io.FileNotFoundException;

class TurmTest {

    private SpielFeld f1 = null;
    private SpielFeld f2 = null;


    @BeforeEach
    void setUp() throws FileNotFoundException {
        this.f1 = SpielFeldIO.einlesen("testfelder/T1.txt");
    }

    @Test
    void testSpielzugMoeglich1() {
        Turm t = (Turm) f1.getFeld(7, 7);
        boolean m1 = t.spielzugMoeglich(f1, new Position(7, 7), new Position(3, 7));
        Assert.assertTrue(m1);
    }

    @Test
    void testSpielzugMoeglich2() {
        Turm t = (Turm) f1.getFeld(7, 7);
        boolean m1 = t.spielzugMoeglich(f1, new Position(7, 7), new Position(7, 6));
        Assert.assertFalse(m1);
    }
    
    void testSpielzugMoeglich3() {
        Turm t = (Turm) f1.getFeld(7, 7);
        boolean m1 = t.spielzugMoeglich(f1, new Position(7, 7), new Position(0, 7));
        Assert.assertFalse(m1);
    }

}
