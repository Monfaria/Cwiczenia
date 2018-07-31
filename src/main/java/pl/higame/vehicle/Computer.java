package pl.higame.vehicle;

class Computer {
    int numerProcesor;
    int price;
    int number;
}

class ComputerDemo {
    public static void main(String args[]){
        Computer Apple = new Computer();
        Apple.number = 1;
        Apple.price = 100;
        Apple.numerProcesor = 4;

        System.out.println("Liczba komputerow: "+Apple.number+" cena: "+Apple.price+" numer procesora "+Apple.numerProcesor);
    }
}
