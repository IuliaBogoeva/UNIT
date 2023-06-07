package Homeworks.L2;

import java.util.Scanner;

public class SimbolProbel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int probeli = 0;

        System.out.println("Введите символы(для завершения введите точку):");

        while (true) {
            char simbol = scanner.next().charAt(0);

            if (simbol == '.') {
                break;
            }

            if (simbol == ' ') {
                probeli++;
            }
        }

        System.out.println("Всего пробелов:" + probeli);

        scanner.close();

        }
    }

