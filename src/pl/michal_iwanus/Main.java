package pl.michal_iwanus;

import java.util.Scanner;

//Simple program to calculate your Body Mass Index

public class Main {

    public static void main(String[] args) {
        BMI bmi = new BMI();

        bmi.setAge();   //Setter for age
        bmi.setHeight();//Setter for height
        bmi.setWeight();//Setter for weight

        System.out.println("Your BMI is: " + bmi.setBmi());

    }
}

class BMI
{
    Scanner scanner = new Scanner(System.in);
    private int age;
    private int weight;
    private float height;

    void setAge() //Only for information
    {
        System.out.print("Set your age: ");
        age = scanner.nextInt();
    }
    void setHeight() //Setter for height[m]
    {
        System.out.print("Set your height in m: ");
        height = scanner.nextFloat();
    }
    void setWeight() //Setter for weight[kg]
    {
        System.out.print("Set your weight in kg: ");
        weight = scanner.nextInt();
    }

    float setBmi() //Setter Body Mass Index (weight [kg] / (height * height [m])
    {
        return weight / (height * height);
    }
}