package ____AP_Assignments______.Assignment__1;

import java.util.*;

public class Register_Hospital {
    String hospitalName;
    int pincode;
    int uinqueId;
    Scanner sc = new Scanner(System.in);

    String hospitalName() {
        System.out.print("Hospital Name:-");
        hospitalName = sc.nextLine();
        return hospitalName;
    }

    int hospitalPincode() {
        System.out.print("Hospital Pincode:-");
        pincode = sc.nextInt();
        return pincode;

    }

    // int hospitalUniqueId(){

    // }
}
