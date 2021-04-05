package chu.edu.module3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class JavaList
 * @since 02.04.2021 - 16.05
 **/
public class JavaLists {
    public static void main(String[] args) {
        Random random = new Random();
        int r1 = random.nextInt(1000);

        System.out.println("------------------LINKED LIST--------------------------------  ");
        List<Integer> linkedList = new LinkedList<>();
        int indexOfCenterL = linkedList.size() / 2;

        // CREATE LIST

        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(random.nextInt(1000));
        }
        LocalDateTime finish = LocalDateTime.now();

        int duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Create duration : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //----------------- INSERT-----------------------

        //HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0,random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(indexOfCenterL,random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        // TAIl

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size() - 1 ,random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the end  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //------------------UPDATE-----------------

        // HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(0, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        // MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(indexOfCenterL, random.nextInt(1000));
            indexOfCenterL++;
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //TAIL

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedList.size() - 1, random.nextInt(1000));

        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  end  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //------------------DELETE-----------------

        //HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());


        //MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(indexOfCenterL);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());

        //TAIL

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  end  : " + duration + " msec");
        System.out.println("ListSize now = " + linkedList.size());


        System.out.println("------------------ARRAY LIST--------------------------------  ");
        List<Integer> arrayList = new ArrayList<>();
        int indexOfCenterA = arrayList.size() / 2;

        // CREATE LIST

        start = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Create duration : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //----------------- INSERT-----------------------

        //HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0,random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(indexOfCenterA,random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        // TAIl

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size() - 1,random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Insert on the end  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //------------------UPDATE-----------------

        // HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(0, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        // MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(indexOfCenterA, random.nextInt(1000));
            indexOfCenterA++;
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //TAIL

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(arrayList.size() - 1, random.nextInt(1000));
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Update from the  end  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //------------------DELETE-----------------

        //HEAD

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  beginning  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());
        ;

        //MID

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(indexOfCenterA);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  middle  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());

        //TAIL

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("Delete from the  end  : " + duration + " msec");
        System.out.println("ListSize now = " + arrayList.size());


        /*
      -----------ARRAY LIST--------------------------------------------LINKED LIST--------------------------------
        Create duration : 16 msec                               Create duration : 71 msec
        ListSize now = 100000                                  ListSize now = 100000
       --------------------------------------INSERT--------------------------------------------------------------
        Insert on the  beginning  : 40 msec                     Insert on the  beginning  : 0 msec
        ListSize now = 101000                                  ListSize now = 101000
        Insert on the  middle  : 17 msec                        Insert on the  middle  : 1 msec
        ListSize now = 102000                                  ListSize now = 102000
        Insert on the end  : 1 msec                            Insert on the end  : 0 msec
        ListSize now = 103000                                  ListSize now = 103000
        --------------------------------------UPDATE-------------------------------------------------------------
        Update from the  beginning  : 0 msec                   Update from the  beginning  : 0 msec
        ListSize now = 103000                                  ListSize now = 103000
        Update from the  middle  : 0 msec                      Update from the  middle  : 6 msec
        ListSize now = 103000                                  ListSize now = 103000
        Update from the  end  : 1 msec                         Update from the  end  : 0 msec
        ListSize now = 103000                                  ListSize now = 103000
        --------------------------------------DELETE--------------------------------------------------------------
        Delete from the  beginning  : 23 msec                  Delete from the  beginning  : 1 msec
        ListSize now = 102000                                  ListSize now = 102000
        Delete from the  middle  : 18 msec                     Delete from the  middle  : 14 msec
        ListSize now = 101000                                  ListSize now = 101000
        Delete from the  end  : 0 msec                        Delete from the  end  : 0 msec
        ListSize now = 100000                                  ListSize now = 100000


                   CONCLUSIONS:
                    1) Normal list creation is faster with a linked list
                    2) The insertion operation is much faster with the linked list,
                    but the insertion into the tail is about the same
                    3) The update operation is about the same level,
                    but the update from the center of the linked list is worse than the array list
                    4)The deletion operation at the linked list is much better at the beginning ,
                    same level from the middle and tail of list

         */


    }
}
