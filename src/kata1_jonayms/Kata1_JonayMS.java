package kata1_jonayms;

import java.time.LocalDate;

public class Kata1_JonayMS {
    
    public static void main(String[] args) {
        LocalDate dia=LocalDate.of(1949,5,12);
        
        Person persona= new Person("Nombre",dia);
        System.out.print(persona.getName()+"tiene"+persona.getAge());
        
    }
    
}
