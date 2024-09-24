package list.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    String names = "Bob,George,Julia,April";
    String namesWithGender = "John-m,Paul-m,George-m,Julia-f";

     public static void main(String[] args){
            Main main = new Main();
            main.separateNames();
            main.separateInGenderGroups();
     }

     public void separateNames(){
         ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names.split(",")));
         Collections.sort(nameList);
         System.out.println(nameList);
     }

     public void separateInGenderGroups(){
         String[] people = namesWithGender.split(",");
         ArrayList<String> maleList = new ArrayList<>();
         ArrayList<String> femaleList = new ArrayList<>();

         for (String p : people) {
             String[] nameGender = p.split("-");
             String personName = nameGender[0];
             String gender = nameGender[1];

             if(gender.equals("m")){
                 maleList.add(personName);
             }

             if(gender.equals("f")){
                 femaleList.add(personName);
             }

         }

         System.out.println("Males: " + maleList );
         System.out.println("Females: " + femaleList );

     }
}
