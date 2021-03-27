package chu.edu.module2.builder;

import java.time.LocalDate;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class bilderMain
 * @since 27.03.2021 - 17.30
 **/
public class builderMain {
    public static void main(String[] args) {
        Student1 Masha = new Student1.Builder()
                .setFirstName("Masha")
                .setLastName("Pizzovna")
                .setPatronymicName("Konfetkovna")
                .setGender("Female")
                .setDateOfBirth(LocalDate.of(1998, 2, 18))
                .setNationality("Ukrainian")
                .setCitizenship("Ukrainian")
                .setCountry("Slovacia")
                .setTown("Bratislava")
                .setStreet("Tortovaya")
                .setHouseNumber("69A")
                .setFlatNumber(96)
                .setMaritalStatus("Married")
                .setPreviousСonviction(true)
                .setDateOfAdmission(LocalDate.of(2021, 9, 1))
                .setUniversityName("VSEM")
                .setDepartmentName("Сomputer sciences")
                .setChairName("Software Engineering and Information Technology")
                .setSpecialtyName("Software Engineer")
                .setGroup("Uk-1A")
                .setAcademicDegree("Master")
                .setScholarship(true)
                .setLivesInDormitory(true)
                .setLearningType("Full-time")
                .setLearningForm("State funded")
                .setGroupLeader(false)
                .build();
        System.out.println(Masha);
    }
}
