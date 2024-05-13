package DSAquiz;

import java.util.Scanner;

public class arraySearch {
    static int[] numbers;
    static int item;

    static void arrays() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        numbers = new int[size];
        for (int i = 0; i < size; i++) {

            System.out.println("Enter the elements of the array: ");
            numbers[i] = sc.nextInt();

        }
        System.out.println("Enter the element to be searched: ");
        item = sc.nextInt();

    }

    static int arraySearch() {
        int count = 0;
        for (int i = numbers.length-1; i >= 0; i--) {
            if (numbers[i] == item) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        arrays();
        System.out.println(arraySearch());
    }
}



