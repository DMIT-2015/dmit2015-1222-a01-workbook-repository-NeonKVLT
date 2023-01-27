package dmit2015.model;


import lombok.Data;

@Data

public class Person {

    public String firstName;
    public String lastName;

    public java.time.LocalDate birthDate;

    public String birthDateString;

    public Person(String firstName, String lastName, java.time.LocalDate birthDate){


    }

    public long currentAge;

    /* public ageOn(onDate)

    */
    public String chineseZodiac;
    public String astrologicalSign;
}
