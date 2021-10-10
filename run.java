package ____AP_Assignments______.Assignment__1;

import java.util.*;

public class run {
    public static void main(String[] args) {
        System.out.println("CoVVin Portal Initialiased..........");
        for (int i = 0; i <= 20; i++) {
            System.out.print("-");
        }
        // show menu
        System.out.println();
        System.out.println("""
                1. Add Vaccine
                2. Register Hospital
                3. Register Citizen
                4. Add Slot for Vaccination
                5. Book Slot for Vaccination
                6. List all slots for a hospital
                7. Check Vaccination Status
                8. Exit
                """);

        Scanner sc = new Scanner(System.in);
        Integer selectedOption = 0;

        while (selectedOption != 8) {
            selectedOption = sc.nextInt();

            switch (selectedOption) {

                case 1:
                    // vaccine Addition

                    Add_Vaccine ac = new Add_Vaccine();

                    ac.vaccineName();
                    ac.gapBetweenDoses();
                    ac.totalDosesRequired();
                    System.out.println("Vaccine Name : " + ac.vaccineDetails.get("Vaccine Name") + ","
                            + " Number of doses : " + ac.dosesDetails.get("Number of doses") + ","
                            + " Gap Between doses : " + ac.dosesDetails.get("Gap between doses"));
                    break;

                case 2:
                    // hospital Registration

                    // Register_Hospital regH = new Register_Hospital();
                    // String hName = regH.hospitalName();
                    // int hPincode = regH.hospitalPincode();

                    // System.out.println("Hospital Name :" + hName + "," + "Hospital Pincode :" +
                    // hPincode + ","
                    // + "Unique ID :" + hUniqueId);

                case 8:

                    System.out.print("Exiting COVIN Programme..................");
                    break;

                default:
                    System.out.println(" Wrong Choice...........");
                    System.out.println("Re-enter Your choice--------");
                    break;

            }

        }
        sc.close();
    }

}
