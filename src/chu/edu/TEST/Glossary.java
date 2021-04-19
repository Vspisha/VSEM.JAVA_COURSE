package chu.edu.TEST;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Glossary
 * @since 19.04.2021 - 17.59
 **/
public class Glossary {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("D:\\SLOVAC\\Java course\\harry.txt")));

        text = text.toLowerCase(Locale.ROOT).replaceAll("[^A-Za-z ]", "");
        String[] array = text.split(" +");
        List<String> list = Arrays.stream(array).collect(Collectors.toList());
        Set<String> distincts = list.stream().collect(Collectors.toSet());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                Integer value = map.get(array[i]);
                map.put(array[i], value + 1);

            }
        }

        Map<String, Integer> sorted = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sorted.put(entry.getKey(), entry.getValue()));

        String sorted20 = "----------------------------------------------------------------------------"
                + "\n" + "VSEM 2021" + "\n"+"Radislav Churkin" + "\n"
                + "https://github.com/Vspisha/VSEM.JAVA_COURSE/tree/master/src/chu/edu/TEST" + "\n"
                + "----------------------------------------------------------------------------" + "\n"
                + "The first 20 pairs of distinct words "
                + "sorted in the DESC mode by the number of occurrence : " + "\n";
        int counter = 0;
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            counter++;
            sorted20 += entry.getKey() + " " + entry.getValue() + "\n";
            if (counter == 20) break;
        }
        String sortedToString = sorted.toString();


        String fileOutput = "D:\\SLOVAC\\Java course\\" + "Exam_Garry.txt";
        Files.write(Paths.get(fileOutput), sorted20.getBytes());

    }
}
