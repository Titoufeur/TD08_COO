import org.junit.Test;

import static org.junit.Assert.*;

public class TelecommandeTest {
    @Test
    public void ajoutTelecomandeVide(){
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterAppareil(l);

        assertEquals(l,t.getAppareil(0));
    }

    @Test
    public void ajoutTelecommandeNonVide(){
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterAppareil(l);
        Lampe l2 = new Lampe("lampe2");
        t.ajouterAppareil(l2);
        assertEquals(l2,t.getAppareil(1));
    }

    @Test
    public void activerPremiereLampe(){
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterAppareil(l);
        t.activerAppareil(0);
        assertTrue(t.getAppareil(0).isAllume());
    }

    @Test
    public void activerDeuxiemeLampe() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterAppareil(l);
        Lampe l2 = new Lampe("lampe2");
        t.ajouterAppareil(l2);
        t.activerAppareil(1);
        assertTrue(t.getAppareil(1).isAllume());
    }


    @Test
    public void activerLampeInexistante(){
        Lampe l=new Lampe("lampe1");
        Telecommande t = new Telecommande();
        t.ajouterAppareil(l);
        t.activerAppareil(1);
        assertFalse(t.getAppareil(0).isAllume());
        assertEquals(null,t.getAppareil(1));
    }

    @Test
    public void activerCheminee(){
        Cheminee c = new Cheminee();
        ChemineeAdapter ca = new ChemineeAdapter(c);
        Telecommande t = new Telecommande();
        t.ajouterAppareil(ca);
        t.activerAppareil(ca);
        assertEquals(true, ca.estAllume());
    }

    @Test
    public void eteindreCheminee(){
        Cheminee c = new Cheminee();
        ChemineeAdapter ca = new ChemineeAdapter(c);
        Telecommande t = new Telecommande();
        t.ajouterAppareil(ca);
        t.activerAppareil(ca);
        t.eteindreAppareil(ca);
        assertEquals(false, ca.estAllume());
    }

}
