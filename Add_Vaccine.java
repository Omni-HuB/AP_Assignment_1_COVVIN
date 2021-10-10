package ____AP_Assignments______.Assignment__1;

import java.util.HashMap;
import java.util.Scanner;

public class Add_Vaccine {
    String vaccineName;
    int totalDosesRequired;
    int gap;
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> vaccineDetails = new HashMap<>();
    HashMap<String, Integer> dosesDetails = new HashMap<>();

    void vaccineName() {

        System.out.print("Vaccine Name: ");
        vaccineName = sc.nextLine();
        vaccineDetails.put("Vaccine Name", vaccineName);
        // return vaccineName;
    }

    void totalDosesRequired() {

        System.out.print("Number of doses  : ");
        totalDosesRequired = sc.nextInt();
        dosesDetails.put("Number of doses", totalDosesRequired);

    }

    void gapBetweenDoses() {
        System.out.print("Gap between doses : ");
        gap = sc.nextInt();
        dosesDetails.put("Gap between doses", gap);
        // return gap;

        sc.close();
    }

}
