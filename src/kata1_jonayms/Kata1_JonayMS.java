package kata1_jonayms;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1_JonayMS {
    
    public static void main(String[] args) {
        Calendar dia=GregorianCalendar.getInstance();
        dia.set(1949,9,24);
        Person persona= new Person("Nombre",dia);
        System.out.print(persona.getName()+"tiene"+persona.getAge());
        
    }
    
}
