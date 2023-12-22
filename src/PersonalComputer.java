//In the example below, we are using composition to assign the ComputerCase class, the Monitor class, and the Motherboard
//class as attributes to teh PersonalComputer class.
public class PersonalComputer extends Product{

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //Setting drawLogo to private and calling monitor.drawPixelAt, then making a public method called powerUp, which
    //accesses drawLogo, we can call on powerUp from our Main class, without Main needing to know anything about our
    //computer parts.

    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}

//Inheritance is a way to reuse functionality and attributes.
//Composition is a way to make the combination of classes, act like a single coherent object.
