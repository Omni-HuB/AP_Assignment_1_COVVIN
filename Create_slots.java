package ____AP_Assignments______.Assignment__1;

import java.util.*;

public class Create_slots {

    int slots;
    int dayNum;
    int quantity;
    Long hospitalID;
    String mapHospitalID;
    static String mapSlots, mapDayNum, mapQuantity;
    Scanner sc = new Scanner(System.in);

    static HashMap<String, Integer> cSlots = new HashMap<>();
    static HashMap<String, Long> LcSlots = new HashMap<>();

    void addHospitalID() {
        System.out.print("Enter Hospital ID: ");
        hospitalID = sc.nextLong();

    }

    void addSlots() {
        System.out.print("Enter number of Slots to be added: ");
        slots = sc.nextInt();

    }

    String vname[] = new String[slots];

    void forSlots() {
        int i;
        int j;

        String count = Integer.toString(slots);
        for (i = 0; i < count.length(); i++) {
            System.out.print("Enter Day Number: ");
            dayNum = sc.nextInt();
            System.out.print("Enter Quantity: ");
            quantity = sc.nextInt();
            System.out.println("Select Vaccine..");

            for (j = 0; j <= i; j++) {
                System.out.println(j + " " + Add_Vaccine.vaccineDetails.get(Add_Vaccine.mapvName));
                vname[i] = Add_Vaccine.vaccineDetails.get(Add_Vaccine.mapvName);
            }

            int selectVaccine;
            selectVaccine = sc.nextInt();

            switch (selectVaccine) {
                case 0:
                    System.out.print("Slot added by Hospital " + Register_Hospital.uniqueID);
                    System.out.print("for Day ");
                    System.out.print(dayNum);
                    System.out.print("Available Quantity ");
                    System.out.print(quantity);
                    System.out.print("of Vaccine ");
                    System.out.print(vname[0]);
                    break;
                case 1:
                    System.out.print("Slot added by Hospital " + Register_Hospital.uniqueID);
                    System.out.print(", for Day ");
                    System.out.print(dayNum);
                    System.out.print(", Available Quantity: ");
                    System.out.print(quantity);
                    System.out.print(" of Vaccine ");
                    System.out.print(vname[1]);
                    break;
                case 3:
                    System.out.print("Slot added by Hospital " + Register_Hospital.uniqueID);
                    System.out.print("for Day ");
                    System.out.print(dayNum);
                    System.out.print("Available Quantity ");
                    System.out.print(quantity);
                    System.out.print("of Vaccine ");
                    System.out.print(vname[3]);
                    break;
                case 4:
                    System.out.print("Slot added by Hospital " + Register_Hospital.uniqueID);
                    System.out.print("for Day ");
                    System.out.print(dayNum);
                    System.out.print("Available Quantity ");
                    System.out.print(quantity);
                    System.out.print("of Vaccine ");
                    System.out.print(vname[4]);
                    break;
                case 5:
                    System.out.print("Slot added by Hospital " + Register_Hospital.uniqueID);
                    System.out.print("for Day ");
                    System.out.print(dayNum);
                    System.out.print("Available Quantity ");
                    System.out.print(quantity);
                    System.out.print("of Vaccine ");
                    System.out.print(vname[5]);
                    break;

            }
        }
        int m;
        for (m = 0; m <= cSlots.size(); m++) {

        }

        mapHospitalID = Integer.toString(m) + Add_Vaccine.mapvName + "ID";
        LcSlots.put(mapHospitalID, hospitalID);
        mapDayNum = Integer.toString(m) + Add_Vaccine.mapvName + "Day";
        cSlots.put(mapDayNum, dayNum);
        mapSlots = Integer.toString(m) + Add_Vaccine.mapvName + "Slots";
        cSlots.put(mapSlots, slots);
        mapQuantity = Integer.toString(m) + Add_Vaccine.mapvName + "Quantity";
        cSlots.put(mapQuantity, quantity);

        m = cSlots.size() - 2;

    }

}
