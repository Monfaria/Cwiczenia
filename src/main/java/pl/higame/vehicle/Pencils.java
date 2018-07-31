package pl.higame.vehicle;

class Pencils {
    int length;
    int width;
    int numberInBox;
    int price;
    int numberShops;
}

class PencilsTest{
    public static void main(String args[]){
        Pencils MaxFactor = new Pencils();
        MaxFactor.length = 10;
        MaxFactor.width = 20;
        MaxFactor.numberInBox = 20;
        MaxFactor.price = 1000;
        MaxFactor.numberShops = 800;

        System.out.println("Dlugosc olowka to: "+ MaxFactor.length);
        System.out.println("Grubosc olowka to: "+ MaxFactor.width);
        System.out.println("Liczba olowkow w pudelku to: "+MaxFactor.numberInBox);
        System.out.println("Cena olowkow to:" + MaxFactor.price);
    }
}
