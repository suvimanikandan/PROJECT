package com.Edubridge.Assignments.QuestionsOOPS.Q14;

public class City {
  //declaring variables

      public String name;
      public long population;

    public void display(){
        System.out.println("city name " +name);
        System.out.println("Population " +population);
    }

    public static void main(String[] args) {
        City metro1, metro2;
        metro1 = new City();
        metro2 = new City();

        metro1.name = "Thanjavur";
        metro2.name = "Kumbakonam";

          metro2.population=1234;
          metro1.population=2345;
        System.out.println("Details no1: ");

        metro1.display();
        System.out.println("details no2: ");
        metro2.display();


//display methods

    }




}
