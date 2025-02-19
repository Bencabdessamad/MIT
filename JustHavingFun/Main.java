package JustHavingFun;

public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();
        Voiture voiture = new Voiture("Golf 7" , 2);
        Moto moto = new Moto("Yamaha", 1000);

        garage.ajouterVehicule(voiture);
        garage.ajouterVehicule(moto);
        garage.affocherVehicule();


        voiture.demarer();
        moto.demarer();

    }
}
