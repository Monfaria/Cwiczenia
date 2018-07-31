package pl.higame.vehicle;

class Vehicle {
    int passengers;
    int fuelcap;
    double lkm;
}

class VehicleDemo {
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        int range;


        minivan.passengers = 7;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        range = (int)(minivan.fuelcap/minivan.lkm * 100);
        System.out.println("Minivan przewozi " + minivan.passengers + " osob na odleglosc do " + range + " kilometrow.");
    }
}
