package Homework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Nicole
 */
public class Staff {
    StaffMember[] staffList;
    //-----------------------------------------------------------------
    // Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff (){
        staffList = new StaffMember[6];
        staffList[0] = new Executive ("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee ("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee ("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly ("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.", "555-8374") ;
        staffList[5] = new Volunteer ("Cliff", "321 Duds Lane", "555-7282");
        ((Executive)staffList[0]).awardBonus (500.00);
        ((Hourly)staffList[3]).addHours (40);
    }
    public void payday(){
        sortedStaff();
        double amount;
        for (int count=0; count < staffList.length; count++){
            System.out.println (staffList[count]);
            amount = staffList[count].pay(); // polymorphic
            if (amount == 0.0)
               System.out.println ("Thanks!");
            else
               System.out.println ("Paid: " + amount);
          System.out.println ("------------------------------------");
        }
    }
    public void sortedStaff(){
        StaffMember[] sort = staffList;
        List<Double> list = new ArrayList<>();
        for(int i=0; i<staffList.length; i++){
            list.add(staffList[i].pay());
        }
        Collections.sort(list);
        
        for(int x=0; x<list.size(); x++){
            for(int y=0; y<sort.length; y++){
                if(list.indexOf(x) == sort[y].pay()){
                    staffList[x] = sort[y];
                }
            }
        }
    }
}