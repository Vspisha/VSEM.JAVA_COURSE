package chu.edu.module4;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Main
 * @since 09.04.2021 - 18.42
 **/
public class Main {
    public static void main(String[] args) throws IOException {
        LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 10);


        LocalDateTime start = LocalDateTime.now();

        for (int i = 0; i < 5 ; i++) {

            LogsService.getLogsCountByDate(date.plusDays(i));
        }
        for (int i = 0; i < 5; i++) {
            LogsService.logsByDateToFile("D:\\SLOVAC\\Java course\\logs.txt", date.plusDays(i));

        }
        LocalDateTime finish = LocalDateTime.now();

        System.out.println("Duration is  " + ChronoUnit.MILLIS.between(start, finish) + " msc");



        System.out.println("------------------------------MultiThread-----------------------------------------------");


        date =  LocalDate.of(2020, Month.FEBRUARY, 10);

 /*       for (int i = 0; i < 5 ; i++) {
            System.out.println(date.plusDays(i) + " - ");
            System.out.println(LogsService.getLogsCountByDate(date.plusDays(i)));
        }*/



        for (int i = 0; i < 5 ; i++) {
            new MyThread(date.plusDays(i)).start();
        }
        for (int i = 0; i < 5; i++) {
            LogsService.logsByDateToFile("D:\\SLOVAC\\Java course\\logs.txt", date.plusDays(i));

        }

    }

/*    2020-02-10 6987
            2020-02-11 7086
            2020-02-12 4731
            2020-02-13 4817
            2020-02-14 5315
    Duration is  4916 msc
------------------------------MultiThread-----------------------------------------------
    Thread-0 has been started at 2021-04-16T13:59:33.867
    Thread-3 has been started at 2021-04-16T13:59:33.867
    Thread-1 has been started at 2021-04-16T13:59:33.867
    Thread-2 has been started at 2021-04-16T13:59:33.867
    Thread-4 has been started at 2021-04-16T13:59:33.867
            2020-02-12 4731
    Thread-2 has been finished 2021-04-16T13:59:35.253
    Thread-2 Duration is  1386 msc
2020-02-13 4817
    Thread-3 has been finished 2021-04-16T13:59:35.275
    Thread-3 Duration is  1408 msc
2020-02-11 7086
    Thread-1 has been finished 2021-04-16T13:59:35.302
    Thread-1 Duration is  1435 msc
2020-02-10 6987
    Thread-0 has been finished 2021-04-16T13:59:35.344
    Thread-0 Duration is  1477 msc
2020-02-14 5315
    Thread-4 has been finished 2021-04-16T13:59:35.365
    Thread-4 Duration is  1498 msc



   Conclusions :

   Without using multithreading the speed of reading and writing the logs with errors on new file ---- 4916 msc.

    If i use multithreading the speed between the beginning of the first thread and the end of the last thread
    ~ 1.5 msc.

    Multithreading is a faster option, but less convenient because of the peculiarities of running in random order.


    */
}
