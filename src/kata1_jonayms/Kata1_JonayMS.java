package kata1_jonayms;

import java.util.Date;

public class Kata1_JonayMS {
    
    public static void main(String[] args) {
        Person persona= new Person("Nombre",new Date(48,5,20));
        System.out.print(persona.getName()+"tiene"+persona.getAge());
        
    }
    
}
