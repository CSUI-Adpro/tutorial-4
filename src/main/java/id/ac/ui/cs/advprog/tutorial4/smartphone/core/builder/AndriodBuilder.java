package id.ac.ui.cs.advprog.tutorial4.smartphone.core.builder;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.brand.*;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.factory.*;
import id.ac.ui.cs.advprog.tutorial4.smartphone.repository.*;

public class AndriodBuilder extends SmartPhoneBuilder{
    // TODO: DONE
    // Tutorial 4 - Part 1 DONE
    // Buatlah sebuah method yang mengembalikan sebuah objek SmartPhone
    protected SmartPhone createSmartPhone(SmartPhoneBrand smartPhoneBrand){
        SmartPhone smartPhone = null;
        SmartPhoneFactory smartPhoneFactory;

        if(smartPhoneBrand.equals(SmartPhoneBrand.SUMSANG)){
            smartPhoneFactory = new SumsangFactory();
            smartPhone = new Sumsang(smartPhoneFactory);
        }else if(smartPhoneBrand.equals(SmartPhoneBrand.SIOMI)){
            smartPhoneFactory = new SiomiFactory();
            smartPhone = new Siomi(smartPhoneFactory);
        }else if(smartPhoneBrand.equals(SmartPhoneBrand.ODDO)){
            smartPhoneFactory = new OddoFactory();
            smartPhone = new Oddo(smartPhoneFactory);
        }

        return  smartPhone;
    }
}