package JavaHomeworks;

import java.util.ArrayList;
import java.util.List;

public class HwCarArrayList {
    public static void main(String[] args) {

//1.Create an Array List of cars and retrieve all the values using 2 different ways

        List<String> carList=new ArrayList<>();
        carList.add("Toyota");
        carList.add("Volkswagen");
        carList.add("Fiat");
        carList.add("Acura");
        carList.add("Audi");
        carList.add("Bentley");
        for (String car:carList){
            System.out.print(car+",");
        }
        System.out.println("                  ");
        for (int i = 0; i < carList.size() ; i++) {
            carList.get(i);
        }
        System.out.println(carList);
    }
}
