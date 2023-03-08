package id.ac.ui.cs.advprog.tutorial4.smartphone.core.brand;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.factory.SmartPhoneFactory;

public class Siomi extends SmartPhone{
    private SmartPhoneFactory smartPhoneFactory;

    public Siomi(SmartPhoneFactory smartPhoneFactory){
        this.smartPhoneFactory = smartPhoneFactory;
        setName("Siomi");
    }

    // TODO: DONE
    // Membuat Siomi
    public void create(){
        setRAM(smartPhoneFactory.addRAM());
        setProcessor(smartPhoneFactory.addProcessor());
        setScreen(smartPhoneFactory.addScreen());
        System.out.println("Creating smartphone " + getName());
    }

    // TODO: DONE
    // Menghitung harga Siomi
    public void calculatePrice(){
        Double processorPrice = getProcessor().getPrice();
        Double RAMPrice = getRAM().getPrice();
        Double screenPrice = getScreen().getPrice();
        setPrice(processorPrice + RAMPrice + screenPrice);
        System.out.println("Calculating price for " + getName());
    }
}