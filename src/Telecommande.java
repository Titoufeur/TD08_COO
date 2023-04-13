import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Appareil> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil p) {
        this.appareils.add(p);
    }
    public void activerAppareil(int numero) {
        try {
            this.appareils.get(numero).allumer();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("appareil inexistante");
        }
    }

    public void desactiverAppareil(int numero) {
        this.appareils.get(numero).eteindre();
    }

    public String toString() {
        String r = "";
        for (Appareil lampe : this.appareils) {
            r += lampe.toString() + "\n";
        }
        return r;
    }

    public void activerTout() {
        for (Appareil appareil : this.appareils) {
            appareil.allumer();
        }
    }

    public Appareil getAppareil(int numero) {
        try {
            return this.appareils.get(numero);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("appareil inexistante");
            return null;
        }
    }

    public int getNombre(){
        return this.appareils.size();
    }
}
