// Find the most common number in the array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int maxCount = 0, num = 0;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) count++;
            }

            if (count > maxCount) {
                maxCount = count;
                num = array[i];
            }
        }

        System.out.println("Number: " + num + ", Count: " + maxCount);
    }
}