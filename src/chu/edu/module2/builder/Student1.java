package chu.edu.module2.builder;

import chu.edu.module2.inheritance.Person;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Student
 * @since 19.03.2021 - 18.34
 **/
public class Student1 extends Person {
    private LocalDate dateOfAdmission; // to university
    private String universityName;
    private String departmentName;
    private String chairName;
    private String specialtyName;
    private String group;
    private String academicDegree; // bachelor, master, postgraduate student
    private boolean scholarship; // receives scholarship or not
    private boolean livesInDormitory; // whether the student lives in a dormitory or not
    private String learningType; // full-time education or extramural education
    private String learningForm; // contract or state funded
    private boolean groupLeader; // whether the student is a group leader or a regular student in the group

    // CONSTRUCTORS
    public Student1() {
    }

    public Student1(LocalDate dateOfAdmission, String universityName, String departmentName, String chairName,
                    String specialtyName, String group, String academicDegree, boolean scholarship,
                    boolean livesInDormitory, String learningType, String learningForm, boolean groupLeader) {
        this.dateOfAdmission = dateOfAdmission;
        this.universityName = universityName;
        this.departmentName = departmentName;
        this.chairName = chairName;
        this.specialtyName = specialtyName;
        this.group = group;
        this.academicDegree = academicDegree;
        this.scholarship = scholarship;
        this.livesInDormitory = livesInDormitory;
        this.learningType = learningType;
        this.learningForm = learningForm;
        this.groupLeader = groupLeader;
    }

    public Student1(String firstName, String lastName, String patronymicName,
                    String gender, LocalDate dateOfBirth, String nationality,
                    String citizenship, String country, String town, String street,
                    String houseNumber, int flatNumber, String maritalStatus,
                    boolean previousСonviction, LocalDate dateOfAdmission,
                    String universityName, String departmentName,
                    String chairName, String specialtyName, String group,
                    String academicDegree, boolean scholarship,
                    boolean livesInDormitory, String learningType,
                    String learningForm, boolean groupLeader) {

        super(firstName, lastName, patronymicName, gender, dateOfBirth,
                nationality, citizenship, country, town, street, houseNumber, flatNumber,
                maritalStatus, previousСonviction);

        this.dateOfAdmission = dateOfAdmission;
        this.universityName = universityName;
        this.departmentName = departmentName;
        this.chairName = chairName;
        this.specialtyName = specialtyName;
        this.group = group;
        this.academicDegree = academicDegree;
        this.scholarship = scholarship;
        this.livesInDormitory = livesInDormitory;
        this.learningType = learningType;
        this.learningForm = learningForm;
        this.groupLeader = groupLeader;
    }

    // GETTERS AND SETTERS

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getChairName() {
        return chairName;
    }

    public void setChairName(String chairName) {
        this.chairName = chairName;
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public boolean isLivesInDormitory() {
        return livesInDormitory;
    }

    public void setLivesInDormitory(boolean livesInDormitory) {
        this.livesInDormitory = livesInDormitory;
    }

    public String getLearningType() {
        return learningType;
    }

    public void setLearningType(String learningType) {
        this.learningType = learningType;
    }

    public String getLearningForm() {
        return learningForm;
    }

    public void setLearningForm(String learningForm) {
        this.learningForm = learningForm;
    }

    public boolean isGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(boolean groupLeader) {
        this.groupLeader = groupLeader;
    }

    // toString , hashCode , equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student1 student = (Student1) o;
        return isScholarship() == student.isScholarship()
                && isLivesInDormitory() == student.isLivesInDormitory()
                && isGroupLeader() == student.isGroupLeader()
                && getDateOfAdmission().equals(student.getDateOfAdmission())
                && getUniversityName().equals(student.getUniversityName())
                && getDepartmentName().equals(student.getDepartmentName())
                && getChairName().equals(student.getChairName())
                && getSpecialtyName().equals(student.getSpecialtyName())
                && getGroup().equals(student.getGroup())
                && getAcademicDegree().equals(student.getAcademicDegree())
                && getLearningType().equals(student.getLearningType())
                && getLearningForm().equals(student.getLearningForm());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDateOfAdmission(),
                getUniversityName(), getDepartmentName(), getChairName(),
                getSpecialtyName(), getGroup(), getAcademicDegree(), isScholarship(),
                isLivesInDormitory(), getLearningType(), getLearningForm(), isGroupLeader());
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "dateOfAdmission=" + dateOfAdmission +
                ", universityName='" + universityName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", chairName='" + chairName + '\'' +
                ", specialtyName='" + specialtyName + '\'' +
                ", group='" + group + '\'' +
                ", academicDegree='" + academicDegree + '\'' +
                ", scholarship=" + scholarship +
                ", livesInDormitory=" + livesInDormitory +
                ", learningType='" + learningType + '\'' +
                ", learningForm='" + learningForm + '\'' +
                ", groupLeader=" + groupLeader +
                '}';
    }

    public static class Builder {
        private Student1 studentToBuild;

        public Builder() {
            this.studentToBuild = new Student1();
        }

        public Builder setDateOfAdmission(LocalDate dateOfAdmission) {
            studentToBuild.setDateOfAdmission(dateOfAdmission);
            return this;
        }

        public Builder setUniversityName(String universityName) {
            studentToBuild.setUniversityName(universityName);
            return this;
        }

        public Builder setDepartmentName(String departmentName) {
            studentToBuild.setDepartmentName(departmentName);
            return this;
        }

        public Builder setChairName(String chairName) {
            studentToBuild.setChairName(chairName);
            return this;
        }

        public Builder setSpecialtyName(String specialtyName) {
            studentToBuild.setSpecialtyName(specialtyName);
            return this;
        }

        public Builder setGroup(String group) {
            studentToBuild.setGroup(group);
            return this;
        }

        public Builder setAcademicDegree(String academicDegree) {
            studentToBuild.setAcademicDegree(academicDegree);
            return this;
        }

        public Builder setScholarship(boolean scholarship) {
            studentToBuild.setScholarship(scholarship);
            return this;
        }

        public Builder setLivesInDormitory(boolean livesInDormitory) {
            studentToBuild.setLivesInDormitory(livesInDormitory);
            return this;
        }

        public Builder setLearningType(String learningType) {
            studentToBuild.setLearningType(learningType);
            return this;
        }

        public Builder setLearningForm(String learningForm) {
            studentToBuild.setLearningForm(learningForm);
            return this;
        }

        public Builder setGroupLeader(boolean groupLeader) {
            studentToBuild.setGroupLeader(groupLeader);
            return this;
        }

        public Builder setFirstName(String firstName) {
            studentToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName) {
            studentToBuild.setLastName(lastName);
            return this;
        }

        public Builder setPatronymicName(String patronymicName) {
            studentToBuild.setPatronymicName(patronymicName);
            return this;
        }

        public Builder setGender(String gender) {
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            studentToBuild.setDateOfBirth(dateOfBirth);
            return this;
        }

        public Builder setNationality(String nationality) {
            studentToBuild.setNationality(nationality);
            return this;
        }

        public Builder setCitizenship(String citizenship) {
            studentToBuild.setCitizenship(citizenship);
            return this;
        }

        public Builder setCountry(String country) {
            studentToBuild.setCountry(country);
            return this;
        }

        public Builder setTown(String town) {
            studentToBuild.setTown(town);
            return this;
        }

        public Builder setStreet(String street) {
            studentToBuild.setStreet(street);
            return this;
        }

        public Builder setHouseNumber(String houseNumber) {
            studentToBuild.setHouseNumber(houseNumber);
            return this;
        }

        public Builder setFlatNumber(int flatNumber) {
            studentToBuild.setFlatNumber(flatNumber);
            return this;
        }

        public Builder setMaritalStatus(String maritalStatus) {
            studentToBuild.setMaritalStatus(maritalStatus);
            return this;
        }

        public Builder setPreviousСonviction(boolean previousСonviction) {
            studentToBuild.setPreviousСonviction(previousСonviction);
            return this;
        }

        public Student1 build() {
            return studentToBuild;
        }
    }

}




