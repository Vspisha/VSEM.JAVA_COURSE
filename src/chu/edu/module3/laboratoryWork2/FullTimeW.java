package chu.edu.module3.laboratoryWork2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class fullTime
 * @since 04.04.2021 - 17.33
 **/
public class FullTimeW implements IAccounting{
    private String name;
    private LocalDate workStartDate;
    private String position;
    private String englishLevel;
    private boolean isHaveHigherEducation;
    private int completedProjectsPerMounth;

    public FullTimeW() {
    }

    public FullTimeW(String name, LocalDate workStartDate, String position, String englishLevel, boolean isHaveHigherEducation, int completedProjectsPerMounth) {
        this.name = name;
        this.workStartDate = workStartDate;
        this.position = position;
        this.englishLevel = englishLevel;
        this.isHaveHigherEducation = isHaveHigherEducation;
        this.completedProjectsPerMounth = completedProjectsPerMounth;
    }

    public int getCompletedProjectsPerMounth() {
        return completedProjectsPerMounth;
    }

    public void setCompletedProjectsPerMounth(int completedProjectsPerMounth) {
        this.completedProjectsPerMounth = completedProjectsPerMounth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(LocalDate workStartDate) {
        this.workStartDate = workStartDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public boolean isHaveHigherEducation() {
        return isHaveHigherEducation;
    }

    public void setHaveHigherEducation(boolean haveHigherEducation) {
        isHaveHigherEducation = haveHigherEducation;
    }

    @Override
    public String  toString() {
        return "FullTimeW{" +
                "name='" + name + '\'' +
                ", workStartDate=" + workStartDate +
                ", position='" + position + '\'' +
                ", englishLevel='" + englishLevel + '\'' +
                ", isHaveHigherEducation=" + isHaveHigherEducation +
                ", completedProjectsPerMounth=" + completedProjectsPerMounth +
                '}';
    }

    @Override
    public int getSallary() {
        int priceForPosition = 0;
        if (this.getPosition() == "Programmer"){
            priceForPosition = 3000;
        }
        else if (this.getPosition() == "Tester"){
            priceForPosition = 2000;
        }
        else if (this.getPosition() == "Analyst"){
            priceForPosition = 5000;
        }
        else if (this.getPosition() == "TeamLeader"){
            priceForPosition = 7000;
        }


        int priceForEngLevel = 0;
        if (this.getEnglishLevel() == "B2"){
            priceForEngLevel = 500;
        }
        else if (this.getEnglishLevel() == "C1"){
            priceForEngLevel = 1500;
        }
        else if (this.getEnglishLevel() == "C2"){
            priceForEngLevel = 2500;
        }

        int priceForHigherEducation = 0;
        if(this.isHaveHigherEducation() == true){
            priceForHigherEducation = 1000;
        }
        else if (this.isHaveHigherEducation() == false){
            priceForHigherEducation = 0;
        }

        int priceForWorkStartDate = 0;
        int fullYears = (int) ChronoUnit.YEARS.between(LocalDate.now(),getWorkStartDate());
        if (fullYears == 1 ){
            priceForWorkStartDate = 300;
        }
        else if (fullYears > 1 && fullYears <=3 ){
            priceForWorkStartDate = 500;
        }
        else if (fullYears > 3 && fullYears <=7 ){
            priceForWorkStartDate = 1000;
        }
        else if (fullYears > 7 ){
            priceForWorkStartDate = 2000;
        }

        return getAward() + priceForPosition + priceForEngLevel + priceForHigherEducation + priceForWorkStartDate;
    }

    @Override
    public int getAward() {
        return getCompletedProjectsPerMounth() * 1000;
    }
}
