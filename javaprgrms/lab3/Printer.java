package lab3;

abstract class Printer {
    abstract void configuration();
    abstract void display();
}

class DotMatrix extends Printer {
    void configuration() {
        System.out.println("Dot-Matrix Printer: 9-pin print head, low resolution");
    }

    void display() {
        System.out.println("Printing in progress...");
    }
}

class LaserJet extends Printer {
    void configuration() {
        System.out.println("LaserJet Printer: Laser technology, high resolution");
    }

    void display() {
        System.out.println("Printing in progress...");
    }
}