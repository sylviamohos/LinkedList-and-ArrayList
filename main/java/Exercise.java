import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Enter 5 integers. Include a space between each integer.");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int temp = input.nextInt();

            if (!integers.contains(temp)) {
                integers.add(temp);
            }
        }
        Collections.sort(integers);
        System.out.println(integers);
    }

}
