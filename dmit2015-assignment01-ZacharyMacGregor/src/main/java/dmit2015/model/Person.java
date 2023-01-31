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

    public static void main (String[] args) {
        int day = 7;
        String month = "August";
        String sign="";
        if (month == "January") {
            if (day < 20)
                sign = "Capricorn";
            else
                sign = "Aquarius";
        }
        else if (month == "February") {
            if (day < 19)
                sign = "Aquarius";
            else
                sign = "Pisces";
        }
        else if(month == "March") {
            if (day < 21)
                sign = "Pisces";
            else
                sign = "Aries";
        }
        else if (month == "April") {
            if (day < 20)
                sign = "Aries";
            else
                sign = "Taurus";
        }
        else if (month == "May") {
            if (day < 21)
                sign = "Taurus";
            else
                sign = "Gemini";
        }
        else if( month == "June") {
            if (day < 21)
                sign = "Gemini";
            else
                sign = "Cancer";
        }
        else if (month == "July") {
            if (day < 23)
                sign = "Cancer";
            else
                sign = "Leo";
        }
        else if( month == "August") {
            if (day < 23)
                sign = "Leo";
            else
                sign = "Virgo";
        }
        else if (month == "September") {
            if (day < 23)
                sign = "Virgo";
            else
                sign = "Libra";
        }
        else if (month == "October") {
            if (day < 23)
                sign = "Libra";
            else
                sign = "Scorpio";
        }
        else if (month == "November") {
            if (day < 22)
                sign = "scorpio";
            else
                sign = "Sagittarius";
        }
        else if (month == "December") {
            if (day < 22)
                sign = "Sagittarius";
            else
                sign ="Capricorn";
        }
        System.out.println("The astrological sign for " + day + " " + month + " is " + sign );
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        switch (year % 12) {
            case 0: System.out.println("monkey"); break;
            case 1: System.out.println("rooster"); break;
            case 2: System.out.println("dog"); break;
            case 3: System.out.println("pig"); break;
            case 4: System.out.println("rat"); break;
            case 5: System.out.println("ox"); break;
            case 6: System.out.println("tiger"); break;
            case 7: System.out.println("rabbit"); break;
            case 8: System.out.println("dragon"); break;
            case 9: System.out.println("snake"); break;
            case 10: System.out.println("horse"); break;
            case 11: System.out.println("sheep"); break;
        }
    }
}
