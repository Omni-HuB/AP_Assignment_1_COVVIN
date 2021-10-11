package ____AP_Assignments______.Assignment__1;

import java.util.*;

public class Register_Hospital {

    String hospitalName;
    int hPincode;
    static int uniqueID = 0;

    String maphName;
    String mapuniqueID;
    String maphPincode;
    static int i;
    Scanner sc = new Scanner(System.in);
    static HashMap<String, String> hName = new HashMap<>();
    static HashMap<String, Integer> hDetails = new HashMap<>();

    void hospitalName() {

        for (i = 0; i <= hName.size(); i++) {

        }

        System.out.print("Hospital Name: ");
        hospitalName = sc.nextLine();

        maphName = Integer.toString(i) + "HospitalName";
        hName.put(maphName, hospitalName);
        i += 1;

    }

    void hospitalPincode() {

        System.out.print("Hospital Pincode(6-Digit): ");
        String count;

        do {
            hPincode = sc.nextInt();
            count = Integer.toString(hPincode);
        } while (count.length() != 6);

        for (int j = 1; j <= hName.size(); j++) {
            uniqueID = hPincode + (j + i);
        }

        maphPincode = maphName + "pincode";
        hDetails.put(maphPincode, hPincode);
        mapuniqueID = maphName + "uniqueID";
        hDetails.put(mapuniqueID, uniqueID);

    }

}
