package id.ac.ui.cs.advprog.tutorial4.smartphone.core.brand;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.factory.SmartPhoneFactory;

public class Oddo extends SmartPhone{
    SmartPhoneFactory smartPhoneFactory;

    public Oddo(SmartPhoneFactory smartPhoneFactory){
        this.smartPhoneFactory = smartPhoneFactory;
        setName("Oddo");
    }

    // TODO: DONE
    // Membuat Oddo
    public void create() {
        setRAM(smartPhoneFactory.addRAM());
        setProcessor(smartPhoneFactory.addProcessor());
        setScreen(smartPhoneFactory.addScreen());
        System.out.println("Creating smartphone " + getName());
    }

    // TODO: DONE
    // Menghitung harga Oddo
    public void calculatePrice() {
        Double processorPrice = getProcessor().getPrice();
        Double RAMPrice = getRAM().getPrice();
        Double screenPrice = getScreen().getPrice();
        Double priceFormula = 2 * (processorPrice + RAMPrice + screenPrice);
        setPrice(priceFormula);
        System.out.println("Calculating price for " + getName());
    }
}