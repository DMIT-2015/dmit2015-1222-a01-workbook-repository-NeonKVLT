package dmit2015.model;


import lombok.Data;

@Data
public class CanadianPersonalIncomeTaxRate {


    private String regionAbbreviation;
    private String regionName;

    private int taxYear;

    private int bracketNo;

    private double startingIncome;

    private double endingIncome;

    private double taxRate;

    private double baseTax;

}
