package chu.edu.module3.laboratoryWork2;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class partTime
 * @since 04.04.2021 - 17.33
 **/
public class PartTimeW  implements IAccounting{
    private String name;
    private String position;
    private boolean isHaveHigherEducation;
    private String englishLevel;
    private int workingHoursPerDay;
    private int workingDaysPerMounth;
    private int completedProjectsPerMounth;

    public PartTimeW() {
    }

    public PartTimeW(String name, String position, boolean isHaveHigherEducation, String englishLevel,
                     int workingHoursPerDay, int workingDaysPerMounth, int completedProjectsPerMounth) {
        this.name = name;
        this.position = position;
        this.isHaveHigherEducation = isHaveHigherEducation;
        this.englishLevel = englishLevel;
        this.workingHoursPerDay = workingHoursPerDay;
        this.workingDaysPerMounth = workingDaysPerMounth;
        this.completedProjectsPerMounth = completedProjectsPerMounth;
    }

    public String getName() {
        return name;
    }

    public int getCompletedProjectsPerMounth() {
        return completedProjectsPerMounth;
    }

    public void setCompletedProjectsPerMounth(int completedProjectsPerMounth) {
        this.completedProjectsPerMounth = completedProjectsPerMounth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isHaveHigherEducation() {
        return isHaveHigherEducation;
    }

    public void setHaveHigherEducation(boolean haveHigherEducation) {
        isHaveHigherEducation = haveHigherEducation;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public int getWorkingHoursPerDay() {
        return workingHoursPerDay;
    }

    public void setWorkingHoursPerDay(int workingHoursPerDay) {
        this.workingHoursPerDay = workingHoursPerDay;
    }

    public int getWorkingDaysPerMounth() {
        return workingDaysPerMounth;
    }

    public void setWorkingDaysPerMounth(int workingDaysPerMounth) {
        this.workingDaysPerMounth = workingDaysPerMounth;
    }

    @Override
    public String toString() {
        return "PartTimeW{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", isHaveHigherEducation=" + isHaveHigherEducation +
                ", englishLevel='" + englishLevel + '\'' +
                ", workingHoursPerDay=" + workingHoursPerDay +
                ", workingDaysPerMonth=" + workingDaysPerMounth +
                ", completedProjectsPerMonth=" + completedProjectsPerMounth +
                '}';
    }

    @Override
    public int getSallary() {
        int priceForPosition = 0;
        if (this.getPosition() == "Programmer"){
            priceForPosition = 1000;
        }
        else if (this.getPosition() == "Tester"){
            priceForPosition = 700;
        }
        else if (this.getPosition() == "Analyst"){
            priceForPosition = 2000;
        }
        else if (this.getPosition() == "TeamLeader"){
            priceForPosition = 3000;
        }


        int priceForEngLevel = 0;
        if (this.getEnglishLevel() == "B2"){
            priceForEngLevel = 500;
        }
        else if (this.getEnglishLevel() == "C1"){
            priceForEngLevel = 1000;
        }
        else if (this.getEnglishLevel() == "C2"){
            priceForEngLevel = 1500;
        }


        int priceForHigherEducation = 0;
        if(this.isHaveHigherEducation() == true){
            priceForHigherEducation = 500;
        }
        else if (this.isHaveHigherEducation() == false){
            priceForHigherEducation = 0;
        }



        return getAward() + priceForEngLevel + priceForHigherEducation + priceForPosition +
                 (getWorkingDaysPerMounth() * getWorkingHoursPerDay() * 35);
    }

    @Override
    public int getAward() {
        return getCompletedProjectsPerMounth() * 700;
    }
}
