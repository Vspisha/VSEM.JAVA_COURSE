package chu.edu.module2.inheritance;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Person
 * @since 19.03.2021 - 18.32
 **/
public class Person {
    private String firstName;
    private String lastName;
    private String patronynicName;
    private String gender;
    private LocalDate dateOfBirth;
    private String nationality;
    private String citizenship;
    private String country; // country of current residence
    private String town; // town of current residence
    private String street; //residence street
    private String houseNumber;
    private int flatNumber;
    private String maritalStatus;
    private boolean previousСonviction;

    // CONSTRUCTORS
    public Person() {
    }

    public Person(String firstName, String lastName, String patronynicName, String gender,
                  LocalDate dateOfBirth, String nationality, String citizenship,
                  String country, String town, String street, String houseNumber,
                  int flatNumber, String maritalStatus, boolean previousСonviction) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronynicName = patronynicName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.citizenship = citizenship;
        this.country = country;
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.maritalStatus = maritalStatus;
        this.previousСonviction = previousСonviction;
    }

    // GETTERS AND SETTERS

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronynicName() {
        return patronynicName;
    }

    public void setPatronynicName(String patronynicName) {
        this.patronynicName = patronynicName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public boolean isPreviousСonviction() {
        return previousСonviction;
    }

    public void setPreviousСonviction(boolean previousСonviction) {
        this.previousСonviction = previousСonviction;
    }

    // toString , hashCode , equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getFlatNumber() == person.getFlatNumber()
                && isPreviousСonviction() == person.isPreviousСonviction()
                && getFirstName().equals(person.getFirstName())
                && getLastName().equals(person.getLastName())
                && getPatronynicName().equals(person.getPatronynicName())
                && getGender().equals(person.getGender())
                && getDateOfBirth().equals(person.getDateOfBirth())
                && getNationality().equals(person.getNationality())
                && getCitizenship().equals(person.getCitizenship())
                && getCountry().equals(person.getCountry())
                && getTown().equals(person.getTown())
                && getStreet().equals(person.getStreet())
                && getHouseNumber().equals(person.getHouseNumber())
                && getMaritalStatus().equals(person.getMaritalStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronynicName(),
                getGender(), getDateOfBirth(), getNationality(), getCitizenship(),
                getCountry(), getTown(), getStreet(), getHouseNumber(),
                getFlatNumber(), getMaritalStatus(), isPreviousСonviction());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronynicName='" + patronynicName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nationality='" + nationality + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", country='" + country + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", flatNumber=" + flatNumber +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", previousСonviction=" + previousСonviction +
                '}';
    }
}
