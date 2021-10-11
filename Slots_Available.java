package ____AP_Assignments______.Assignment__1;

import java.util.Scanner;

public class Slots_Available {

    int hospitalID;
    Scanner sc = new Scanner(System.in);
    Create_slots cs = new Create_slots();

    void showSlots() {
        System.out.print("\nEnter Hospital ID: ");
        hospitalID = sc.nextInt();

        if (hospitalID == Register_Hospital.uniqueID) {
            for (int i = 0; i < Create_slots.LcSlots.size(); i++) {

                System.out.println("Day " + Create_slots.cSlots.get(Create_slots.mapDayNum) + " Vaccine " + cs.vname[i]
                        + " Available Qty: " + Create_slots.cSlots.get(Create_slots.mapQuantity));

            }

        }

    }
}