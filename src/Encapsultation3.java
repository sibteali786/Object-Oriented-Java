import java.time.LocalDate;
import java.time.Period;

class Person3 {
    private String SSN;
    private String name;
    private LocalDate birthdate;

    public String getSSN() {
        return SSN;
    }
    public void setSSN(String ssn) {
        this.SSN = ssn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (SSN == null) {
            throw new IllegalStateException("SSN is not set");
        }
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int calculateAge() {
        if (birthdate == null) {
            throw new IllegalStateException("Birthdate is not set");
        }
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthdate, currentDate);
        return period.getYears();
    }
}

class demoEncapsulation3 {
    public static void main(String[] args) {
        Person3 person = new Person3();
        person.setSSN("123-45-6789");
        person.setBirthdate(LocalDate.of(2000, 1, 1));
        person.setName("John Doe");
        System.out.println(person.calculateAge()); // Output: 23
    }
}
