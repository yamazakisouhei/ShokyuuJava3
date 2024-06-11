
    public class DisplayCarsTrains extends MyFrame {
    public void run() {
        Vector<Vehicle> vehicles = new Vector<Vehicle>();
        vehicles.add(new car(10, 30, 3, 0));
        vehicles.add(new car(10, 100, 5, 0));
        vehicles.add(new Train(10, 150, 7, 0));
        vehicles.add(new car(180, 30, 3, 0));
        vehicles.add(new car(180, 100, -5, 0));
        vehicles.add(new Train(180, 170, 14, 0));
        vehicles.add(new Train(180, 220, -13, 0));
        vehicles.add(new Truck(10, 290, 8, 0));
        vehicles.add(new Truck(180, 360, 7, 0));

        for (int i = 0; i < 30; i++) {
            clear();                
            vehicles.get(j).draw(this);
            vehicles.get(j).move();
        }
        sleep(0.1);
        sleep(0.05);
    }
}
}