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
        Double priceFormula = 3 * processorPrice + 3 * RAMPrice + 1.5 * screenPrice;
        setPrice(priceFormula);
        System.out.println("Calculating price for " + getName());
    }
}