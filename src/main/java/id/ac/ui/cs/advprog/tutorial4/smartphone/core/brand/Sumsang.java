package id.ac.ui.cs.advprog.tutorial4.smartphone.core.brand;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.factory.SmartPhoneFactory;

public class Sumsang extends SmartPhone{
    SmartPhoneFactory smartPhoneFactory;

    public Sumsang(SmartPhoneFactory smartPhoneFactory){
        this.smartPhoneFactory = smartPhoneFactory;
        setName("Sumsang");
    }

    // TODO: Complete this method
    public void create(){
        System.out.println("Creating smartphone " + getName());
    }

    // TODO: Complete this method
    public void calculatePrice() {
        System.out.println("Calculating price for " + getName());
    }
}