package ____AP_Assignments______.Assignment__1;

import java.util.*;

public class run {
    public static void main(String[] args) {
        System.out.println("\n\nCoVVin Portal Initialiased..........");
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
            System.out.println("\nSelect { MENU } Options.....");
            selectedOption = sc.nextInt();

            switch (selectedOption) {

                case 1:
                    // vaccine Addition

                    Add_Vaccine ac = new Add_Vaccine();

                    ac.vaccineName();
                    ac.totalDosesRequired();
                    ac.gapBetweenDoses();
                    System.out.println("Vaccine Name : " + Add_Vaccine.vaccineDetails.get(ac.mapvName) + ","
                            + " Number of doses : " + Add_Vaccine.dosesDetails.get(ac.mapnDoses) + ","
                            + " Gap Between doses : " + Add_Vaccine.dosesDetails.get(ac.mapgDoses));

                    System.out.print(Add_Vaccine.dosesDetails.entrySet() + " ,");
                    System.out.println(Add_Vaccine.vaccineDetails.entrySet());
                    break;

                case 2:
                    // hospital Registration

                    Register_Hospital regH = new Register_Hospital();
                    regH.hospitalName();
                    regH.hospitalPincode();

                    System.out.println("Hospital Name :" + regH.hospitalName + "," + "Hospital Pincode :"
                            + regH.hPincode + "," + "Unique ID :" + Register_Hospital.hDetails.get(regH.mapuniqueID));

                    System.out.print(Register_Hospital.hName.entrySet() + " ,");
                    System.out.println(Register_Hospital.hDetails.entrySet());
                    break;

                case 8:

                    System.out.print("Exiting COVIN Programme..................\n");
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
