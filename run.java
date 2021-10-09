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
        int selectedOption = sc.nextInt();
        switch (selectedOption) {
            case 1:
                // vaccine Addition

                Add_Vaccine ac = new Add_Vaccine();
                String vaccineName = ac.vaccineName();
                int totalDosesRequired = ac.totalDosesRequired();
                int gap = ac.gapBetweenDoses();

                System.out.println("Vaccine Name :" + vaccineName + "," + "Toal Doses Required :" + totalDosesRequired
                        + "," + "Gap Between Doses :" + gap);

            case 2:
                // hospital Registration

                Register_Hospital regH = new Register_Hospital();
                String hName = regH.hospitalName();
                int hPincode = regH.hospitalPincode();

                System.out.println("Hospital Name :" + hName + "," + "Hospital Pincode :" + hPincode + ","
                        + "Unique ID :" + hUniqueId);

            case 3:
                // Register Citizen

        }

        // sc.close();
    }

}