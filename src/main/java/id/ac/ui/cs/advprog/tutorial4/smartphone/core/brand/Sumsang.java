package id.ac.ui.cs.advprog.tutorial4.smartphone.core.brand;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.factory.SmartPhoneFactory;

public class Sumsang extends SmartPhone{
    SmartPhoneFactory smartPhoneFactory;

    public Sumsang(SmartPhoneFactory smartPhoneFactory){
        this.smartPhoneFactory = smartPhoneFactory;
        setName("Sumsang");
    }

    // TODO: DONE
    // Membuat Sumsang
    public void create(){
        setRAM(smartPhoneFactory.addRAM());
        setProcessor(smartPhoneFactory.addProcessor());
        setScreen(smartPhoneFactory.addScreen());
        System.out.println("Creating smartphone " + getName());
    }

    // TODO: DONE
    // Menghitung harga Sumsang
    public void calculatePrice() {
        Double processorPrice = getProcessor().getPrice();
        Double RAMPrice = getRAM().getPrice();
        Double screenPrice = getScreen().getPrice();
        setPrice(processorPrice + RAMPrice + screenPrice);
        System.out.println("Calculating price for " + getName());
    }
}