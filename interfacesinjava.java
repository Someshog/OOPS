
interface Car {

    int x = 45; //all properties created in an interface are final

    void applybrake(int decrement);

    void speedup(int increment);
}

interface Car2 {

    int y = 45; //all properties created in an interface are final

    void applyclutch();

    void releaseclutch();
}

class creta implements Car, Car2 {

    /*extended to car2 also which can't be done in abstract classes as they can only be extended to one class*/

    void blowhorn() {
        System.out.println("Blown!");
    }

    ;

    public void applyclutch() {
        System.out.println("Clutch pressed");
    }

    public void applybrake(int decrement) {
        System.out.println("Brake applied");
    }

    public void releaseclutch() {
        System.out.println("Clutch released");
    }

    public void speedup(int increment) {
        System.out.println("Speed increased");
    }
}

public class interfacesinjava {

    public static void main(String[] args) {
        creta someshcycle = new creta();
        someshcycle.applyclutch();
        someshcycle.applybrake(1);
        someshcycle.blowhorn();
        someshcycle.releaseclutch();
        someshcycle.speedup(1);
        System.out.println(someshcycle.x); //accessing contents of interface bicycle
        // someshcycle.x = 70; //can't be changed 
    }
}
