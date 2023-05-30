package Homeworks.L1;

import java.util.Scanner;

public class WeightOnTheMoon {
    public static void main(String[]args){
        Scanner i = new Scanner(System.in);

        System.out.println("Введите вес на земле(кг):");
        double weightOnTheGround = i.nextDouble();

        double weightOnTheMoon = weightOnTheGround * 0.17;
        System.out.println("Вес на луне составляет :" +  weightOnTheMoon + " кг" );
    }
}
