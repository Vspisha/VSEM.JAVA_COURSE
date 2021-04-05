package chu.edu.module3.laboratoryWork2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class MainLab2
 * @since 05.04.2021 - 15.15
 **/
public class MainLab2 {
    public static void main(String[] args) {
        List<IAccounting> list = new ArrayList<>(
                Arrays.asList(
                        new FullTimeW("John lenon", LocalDate.of(2015,5,23),
                                "TeamLeader","C2",true, 2),
                        new FullTimeW("Freddie Mercury", LocalDate.of(2019,3,2),
                                "Tester","B2",false, 1),
                        new FullTimeW("Tarja Turunen", LocalDate.of(2021,1,14),
                                "Analyst","C1",true, 1),
                        new FullTimeW("Paul McCartney", LocalDate.of(2018,12,24),
                                "Programmer","C1",true, 1),
                        new FullTimeW("Yoko Ono", LocalDate.of(2010,1,14),
                                "Programmer","C1",true, 1),
                        new PartTimeW("Robert Pattinson","Programmer",true,
                                "C1",4,20,3),
                        new PartTimeW("Tom Holland","Tester",false,
                                "B2",3,16,3),
                        new PartTimeW("Benedict Cumberbatch","Tester",false,
                                "B2",2,17,3),
                        new PartTimeW("Kit Harington","Analyst",false,
                                "C1",5,10,3),
                        new PartTimeW("Tom Hardy","TeamLeader",true,
                                "C2",2,18,3)
                )
        );
        double totalSallary = list.stream().mapToDouble(IAccounting::getSallary).sum();
        double hightSallary = list.stream().mapToDouble(IAccounting::getSallary).max().getAsDouble();
        double lowSallary = list.stream().mapToDouble(IAccounting::getSallary).min().getAsDouble();
        double midSallary = list.stream().mapToDouble(IAccounting::getSallary).average().getAsDouble();
        System.out.println("All who have more 5k sallary : ");
        List<IAccounting>  more5k = list.stream().filter(item -> item.getSallary() > 5000 )
                .collect(Collectors.toList());
        System.out.println(more5k);
        System.out.println("Sum of all salaries : " + totalSallary);
        System.out.println("The highest salary : " + hightSallary);
        System.out.println("The lowest salary : " + lowSallary);
        System.out.println("Average salary : " + midSallary);

    }
}
