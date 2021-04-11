package chu.edu.module4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Main
 * @since 07.04.2021 - 19.08
 **/
public class FilesManegement {
    public static void main(String[] args) throws IOException {
        LocalDateTime start = LocalDateTime.now();
        String logs = new String(Files.readAllBytes(Paths.get("D:\\SLOVAC\\Java course\\logs.txt")));
        final String [] lines = logs.split("\n");
        System.out.println( "Number of logs lines " + lines.length);
        System.out.println("--------------Use previous skills - String.split---------------------------------");
        LocalDateTime finish = LocalDateTime.now();
        System.out.println("Time spent : " + ChronoUnit.MILLIS.between(start,finish) + " mss");


        int counter = 0;
        for (int i = 0; i <lines.length ; i++) {
            if(lines[i].contains("ERROR")) counter++;
        }
        System.out.println("Number of errors  - " + counter);
        System.out.println("------------------ Use Files.lines.-----------------------------");

        start = LocalDateTime.now();

      /*System.out.println(Files.readAllLines(Paths.get("D:\\SLOVAC\\Java course\\logs.txt"))
                .stream().filter(element -> element.contains("ERROR")).count());*/

      /*  final List<String> linesList = Files.readAllLines(Paths.get("D:\\SLOVAC\\Java course\\logs.txt"));
        System.out.println(linesList.stream().filter(element -> element.contains("ERROR")).count());*/

        System.out.println("Number of errors  - " + Files.lines(Paths.get("D:\\SLOVAC\\Java course\\logs.txt"))
                .filter(element -> element.contains("ERROR")).count());


        finish = LocalDateTime.now();
        System.out.println("Time spent : " +ChronoUnit.MILLIS.between(start,finish) + "  mss");
    }
}
 /*

  Number of logs lines 2845607

        --------------Use previous skills - String.split---------------------------------
        Time spent : 3438 mss
        Number of errors  - 361

        ------------------ Use Files.lines.-----------------------------
        Number of errors  - 361
        Time spent : 1284  mss

        Conclusions:

        Using the "Files.lines" speed increases by about ~ 3 times



        */