package ____AP_Assignments______.Assignment__1;

import java.util.*;

public class Register_Citizen {
    String citizenName;
    Long citizenAge;
    Long citizenID;
    String mapCitizenName;
    String mapCitizenAge;
    String mapCitizenID;
    int i;
    Scanner sc = new Scanner(System.in);
    static HashMap<String, String> cName = new HashMap<>();
    static HashMap<String, Long> cDetails = new HashMap<>();

    void addCitizenName() {
        for (i = 0; i <= cName.size(); i++) {

        }

        System.out.print("Citizen Name : ");
        citizenName = sc.nextLine();
        mapCitizenName = Integer.toString(i) + citizenName;
        cName.put(mapCitizenName, citizenName);

    }

    void addCitizenID() {
        String count;
        System.out.print("Unique ID (12-Digits) : ");
        do {
            citizenID = sc.nextLong();
            count = Long.toString(citizenID);
        } while (count.length() != 12);

        mapCitizenID = mapCitizenName + "ID";
        cDetails.put(mapCitizenID, citizenID);
    }

    void addCitizenAge() {
        System.out.print("Citizen Age : ");

        while (true) {
            citizenAge = sc.nextLong();

            if (citizenAge < 18) {
                System.out.println("Only above 18 are allowed....");
                // cName.remove(mapCitizenName, citizenName);
                // cDetails.remove(mapCitizenID, citizenID);

                break;
            } else {

                mapCitizenAge = mapCitizenName + "Age";
                cDetails.put(mapCitizenAge, citizenAge);
                break;
            }
        }

    }
}
