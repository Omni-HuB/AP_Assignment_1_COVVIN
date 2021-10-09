package ____AP_Assignments______.Assignment__1;

import java.util.Scanner;

public class Add_Vaccine {
    String vaccineName;
    int totalDosesRequired;
    int gap;
    Scanner sc = new Scanner(System.in);

    String vaccineName() {

        System.out.print("Vaccine Name:-");
        vaccineName = sc.nextLine();
        return vaccineName;
    }

    int totalDosesRequired() {

        System.out.print("Number of Doses  :-");
        totalDosesRequired = sc.nextInt();
        return totalDosesRequired;
    }

    int gapBetweenDoses() {
        System.out.print("Gap between Doses :-");
        gap = sc.nextInt();
        return gap;

    }

}
