import thermos.Thermostat;

public class Adapter implements Appareil{
    private Thermostat therm;

    public Adapter(Thermostat t){
        this.therm = t;
    }

    public void allumer(){
        this.therm.monterTemperature();
    }

    public void eteindre(){
        this.therm.baisserTemperature();
    }

    public String toString() {
        String r = "";
        r += "Thermostat : ";
        return (r);
    }
}