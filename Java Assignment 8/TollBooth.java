class TollBooth {
    int totalCars = 0;
    int unpaidCars = 0;
    int totalCash = 0;

    void payingCar() {
        totalCars++;
        totalCash += 50;
    }

    void nonPayingCar() {
        totalCars++;
        unpaidCars++;
    }

    void display() {
        System.out.println(totalCars);
        System.out.println(unpaidCars);
        System.out.println(totalCash);
    }

    public static void main(String[] args) {
        TollBooth t = new TollBooth();

        t.payingCar();
        t.payingCar();
        t.nonPayingCar();
        t.payingCar();

        t.display();
    }
}