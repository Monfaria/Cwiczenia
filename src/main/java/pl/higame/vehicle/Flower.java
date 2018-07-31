package pl.higame.vehicle;

class Flower {
    int numberOfFlower;
    int numberOfWeekGrow;
    int price;
}

class FlowerTest {
    public static void main(String args[]){
        Flower Tulip = new Flower();
        Tulip.numberOfFlower = 5;
        Tulip.numberOfWeekGrow = 8;
        Tulip.price = 20;

        System.out.println("Liczba kwiatkow: "+Tulip.numberOfFlower);
        System.out.println("Czas wzrozstu w tygodniach: "+Tulip.numberOfWeekGrow);
        System.out.println("Cena " + Tulip.price);
    }
}
