package parking.vehicle;

import parking.util.Counties;

public class RegistrationPlate {
    private Long id;
    private Long lastId =1L ;
    private String country;
    private String registrationNumber;
    private Counties county;
    private String numbers;
    private String letters;

    //Constructors

    public RegistrationPlate(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        setterOfRegistrationPlate(registrationNumber);
        id = lastId;
        lastId++;
    }


    //Getter and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Counties getCounty() {
        return county;
    }

    public void setCounty(Counties county) {
        this.county = county;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public Long getLastId() {
        return lastId;
    }

    public void setLastId(Long lastId) {
        this.lastId = lastId;
    }

    //Class methods

    private void setterOfRegistrationPlate(String registrationNumber){
        for(Counties counties : Counties.values()) {
            if (registrationNumber.startsWith(counties.getCountyCode())) {
                if (counties.getCountyCode().equals("B") &&
                        Character.isDigit(registrationNumber.charAt(1))) {
                    setterOfAttributesForBucharest(registrationNumber, counties);
                } else if (counties.getCountyCode().equals("B") && Character.isLetter(registrationNumber.charAt(1))) {
                    county = null;
                    country = "FOREIGN";
                } else if(Character.isDigit(registrationNumber.charAt(2)) && Character.isDigit(registrationNumber.charAt(3))){
                    county = counties;
                    country = "ROMANIA";
                }
            }
        }
        if(country==null){
            country="FOREIGN";
        }
    }

    private void setterOfAttributesForBucharest(String registrationNumber, Counties counties) {
        if(Character.isDigit(registrationNumber.charAt(2)) && Character.isDigit(registrationNumber.charAt(3))){
            numbers = registrationNumber.substring(1,4);
            letters = registrationNumber.substring(4,7);
            county = counties;
            country = "ROMANIA";
        } else if (Character.isDigit(registrationNumber.charAt(2)) && Character.isLetter(registrationNumber.charAt(3)) &&
                Character.isLetter(registrationNumber.charAt(4)) && Character.isLetter(registrationNumber.charAt(5))) {
                    numbers = registrationNumber.substring(1,3);
                    letters = registrationNumber.substring(3,6);
                    county = counties;
                    country = "ROMANIA";
                }
    }

    public void registrationPlateDetails(){
        System.out.println("###########   PLATE  ###########");
        System.out.println("# ID: "+ String.valueOf(id));
        System.out.println("# Last ID: "+String.valueOf(lastId));
        System.out.println("# Country: "+ String.valueOf(country));
        System.out.print("# County: ");
        if(county==null){
            System.out.println("null");
        } else {
            System.out.println(county.getCountyCode() + " " + county.getCountyName());
        }
        System.out.println("# Registration number: "+registrationNumber);
        System.out.println("# Numbers: "+numbers);
        System.out.println("# Letters: "+letters);
        System.out.println("#################################");
    }


}
