package org.vashonsd;

public class truck {
    private String make;
    private int towingCap;

   // String Ford;
   // String Dodge;
   // int Towingweight;
   // int tTowing;

    public truck(String truckMake, int truckTowingCap){
        make = truckMake;
        towingCap = truckTowingCap;

    }
    public boolean canTow(int towWeight){
        return (towingCap > towWeight);
    }
}
