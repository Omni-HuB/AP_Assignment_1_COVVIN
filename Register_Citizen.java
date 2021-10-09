package ____AP_Assignments______.Assignment__1;

import java.util.Scanner;

public class Register_Citizen {
    String citizenName;
    int citizenAge;
    int citizenId;
    Scanner sc = new Scanner(System.in);

    String addCitizenName() {
        System.out.print("Citizen Name :-");
        citizenName = sc.nextLine();
        return citizenName;
    }

    int addCitizenAge() {
        System.out.print("Citizen Age :-");
        citizenAge = sc.nextInt();
        return citizenAge;
    }

    // int generateCitizenID(){

    // return citizenId;
    // }
}
