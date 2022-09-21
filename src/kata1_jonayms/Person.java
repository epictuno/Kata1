package kata1_jonayms;
import java.time.LocalDate;
import java.time.Period;
public class Person {
  private final String name;
  private final LocalDate Birthdate;
    public Person(String name, LocalDate Age) {
        this.name = name;
        this.Birthdate = Age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return (int) (Period.between(LocalDate.now(), Birthdate).getYears());
    }
}
