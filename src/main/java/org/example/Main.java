package org.example;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean checkForPalindrome(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();

        String reversed = new StringBuilder(cleanedText).reverse().toString();

        return cleanedText.equals(reversed);
    }

    public static String convertDecimalToBinary(int decimalNumber){
        if (decimalNumber == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();
        int number = decimalNumber;

        while (number > 0) {
            stack.push(number % 2); // Kalanı stack'e ekle
            number /= 2; // Sayıyı 2'ye böl
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop()); // Stack'ten çıkarıp sırayla ekle
        }

        return binary.toString();
    }
}
