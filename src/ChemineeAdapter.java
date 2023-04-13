public class ChemineeAdapter implements Appareil{
    private Cheminee cheminee;

    public ChemineeAdapter(Cheminee c){
        this.cheminee = c;
    }
    public boolean estAllume(){
        return (this.cheminee.getLumiere()>0);
    }

    public void allumer(){
        this.cheminee.changerIntensite(this.cheminee.getLumiere()+10);
    }

    public void eteindre(){
        this.cheminee.changerIntensite(0);
    }

    public String toString() {
        String r = "";
        r += "Cheminee : " + this.cheminee.getLumiere();
        return (r);
    }
}