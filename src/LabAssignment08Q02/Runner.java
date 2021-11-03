package LabAssignment08Q02;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("<== Enter your Computer Details ==>");

        System.out.print("Enter Word Size(in bits): ");
        int wordSize = input.nextInt();

        System.out.print("Enter Memory Size(in Megabytes): ");
        int memorySize = input.nextInt();

        System.out.print("Enter Storage Size(in Megabytes): ");
        int storageSize = input.nextInt();

        System.out.print("Enter Speed Size(in Megabits): ");
        int speed = input.nextInt();

        System.out.print("Enter Length: ");
        int length = input.nextInt();

        System.out.print("Enter Height: ");
        int height = input.nextInt();

        System.out.print("Enter Width: ");
        int width = input.nextInt();

        System.out.print("Enter Weight: ");
        int weight = input.nextInt();

        Laptop lc1 = new Laptop(wordSize, memorySize, storageSize,
                speed, length, height, width, weight);

        lc1.LaptopDisplay();
    }
}
