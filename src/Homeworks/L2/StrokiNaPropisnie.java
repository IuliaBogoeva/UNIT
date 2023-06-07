package Homeworks.L2;

import java.util.Scanner;
public class StrokiNaPropisnie {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int changeCount = 0;

            System.out.println("Введите символы (для завершения введите точку):");

            while (true) {
                String input = scanner.nextLine();

                if (input.equals(".")) {
                    break;
                }

                char[] characters = input.toCharArray();

                for (int i = 0; i < characters.length; i++) {
                    char c = characters[i];

                    if (Character.isLowerCase(c)) {
                        c = (char) (c - 32);
                        characters[i] = c;
                        changeCount++;
                    } else if (Character.isUpperCase(c)) {
                        c = (char) (c + 32);
                        characters[i] = c;
                        changeCount++;
                    }
                }

                String result = new String(characters);
                System.out.println("Результат: " + result);
            }

            System.out.println("Количество измененных символов: " + changeCount);
            System.out.println("Программа завершена.");
        }
    }

