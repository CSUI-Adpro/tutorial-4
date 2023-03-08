package id.ac.ui.cs.advprog.tutorial4.smartphone.core.builder;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.factory.SmartPhoneFactory;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.brand.SmartPhone;
import id.ac.ui.cs.advprog.tutorial4.smartphone.repository.SmartPhoneBrand;

public class AndriodBuilder extends SmartPhoneBuilder{
    // TODO: Complete this method
    protected SmartPhone createSmartPhone(SmartPhoneBrand smartPhoneBrand){
        SmartPhone smartPhone = null;
        SmartPhoneFactory smartPhoneFactory;

        if(smartPhoneBrand.equals(SmartPhoneBrand.SUMSANG)){
        }else if(smartPhoneBrand.equals(SmartPhoneBrand.SIOMI)){
        }else if(smartPhoneBrand.equals(SmartPhoneBrand.ODDO)){
        }

        return  smartPhone;
    }
}