package ____AP_Assignments______.Assignment__1;

import java.util.*;

public class Book_a_slot {
    static Long uniqueID;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Register_Hospital regH = new Register_Hospital();
        Slots_Available sSlots = new Slots_Available();
        // Register_Citizen regC = new Register_Citizen();

        int sPincode;

        int sOption;
        System.out.print("Enter Unique ID (12-digits)");
        uniqueID = sc.nextLong();
        System.out.println("""
                    1.Search by Area
                    2.Search by Vaccine Name
                    3.Exit
                """);
        System.out.print("Enter option: ");
        sOption = sc.nextInt();
        // String vaccineName=regH.maphPincode;

        switch (sOption) {

            case 1:
                System.out.print("Eneter Pincode");
                sPincode = sc.nextInt();
                if (sPincode == Register_Hospital.hDetails.get(regH.maphPincode)) {
                    System.out.print(Register_Hospital.hDetails.get(regH.mapuniqueID) + " " + regH.maphPincode);
                    sSlots.showSlots();
                    System.out.print(Register_Citizen.UUID.get(uniqueID) + " is vaccinated with" + regH.maphPincode);
                }
                break;

            case 2:
                break;
            case 3:
                System.out.println("Exiting Search......");
                break;

        }

    }

}
