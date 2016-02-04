package main;

import logic.Vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Yevhen on 04.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Vehicle[] cars = new Vehicle[3];
        cars[0] = new Vehicle(100,"Audi");
        cars[1] = new Vehicle(70,"Ford");
        cars[2] = new Vehicle(120,"BMW");

        Vehicle vm = findFastest(cars);
        System.out.println(vm);
        int sum = sum(cars);
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int s = sum(arr);
        System.out.println("s = " + s);
        double sd = sum();
        System.out.println("sd = " + sd);

        printToFile(cars);

        try {
            Scanner s2 = new Scanner(new File("1.txt"));
            for (int i = 0; i < 4; i++) {
                int k = s2.nextInt();
                System.out.println(k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void printToFile(Vehicle[] cars) {
        try (PrintWriter out = new PrintWriter("file.txt")) {

            for (Vehicle vehicle:cars) {
                out.println(vehicle);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private int sum(int[] arr) {
        int result = 0;
        for (int a: arr) {
            result += a;
        }
        return result;
    }

    private int sum(Vehicle[] cars) {
        int result = 0;
        for (int i = 0; i < cars.length; i++) {
            result += cars[i].getMaxSpeed();
        }
        return result;
    }

    private Vehicle findFastest(Vehicle[] cars) {
        Vehicle result = cars[0];
        int max = result.getMaxSpeed();
        for (int i = 1; i < cars.length; i++) {
            if (max < cars[i].getMaxSpeed()) {
                max = cars[i].getMaxSpeed();
                result = cars[i];
            }
        }
        return result;
    }

    private double sum(double... x) {
        double result = 0;
        for (double d: x) {
            result += d;
        }
        return result;
    }
}
