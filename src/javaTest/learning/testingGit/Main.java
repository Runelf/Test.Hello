package javaTest.learning.testingGit;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	int first_int = 5;
	int second_int = 12;

	multNumbers(first_int, second_int);

    }
    private static void multNumbers(int first, int second) {
        int result = first * second;
        System.out.println("Результат умножения " + first + " и " + second + " равен: " + result);
    }

}
