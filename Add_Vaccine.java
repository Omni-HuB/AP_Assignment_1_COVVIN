package ____AP_Assignments______.Assignment__1;

import java.util.HashMap;
import java.util.Scanner;

public class Add_Vaccine {
    String vaccineName;
    int totalDosesRequired;
    int gap;
    static int i;
    String mapvName;
    String mapnDoses;
    String mapgDoses;
    Scanner sc = new Scanner(System.in);
    static HashMap<String, String> vaccineDetails = new HashMap<>(); // hashmap for storing Vaccine details
    static HashMap<String, Integer> dosesDetails = new HashMap<>(); // map for storing doses details

    void vaccineName() {

        for (int i = 0; i <= vaccineDetails.size(); i++) {

        }
        i += 1;

        System.out.print("Vaccine Name: ");
        vaccineName = sc.nextLine();
        mapvName = Integer.toString(i) + vaccineName;
        vaccineDetails.put(mapvName, vaccineName);

    }

    void totalDosesRequired() {

        System.out.print("Number of doses  : ");
        totalDosesRequired = sc.nextInt();
        mapnDoses = mapvName + "doses";
        dosesDetails.put(mapnDoses, totalDosesRequired);

    }

    void gapBetweenDoses() {

        System.out.print("Gap between doses : ");
        gap = sc.nextInt();
        mapgDoses = mapvName + "gap";
        dosesDetails.put(mapgDoses, gap);
    }

}
