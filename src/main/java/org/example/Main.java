package org.example;

public class Main {
    public static void main(String[] args) {
      //  System.out.println(isPalindrome(122));
      //  System.out.println(numberToWords(12));

    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number); // negatiflik yok sayılır
        char[] digits = String.valueOf(number).toCharArray(); // sayıyı karakterlere ayır

        String reversed = ""; // tersini tutacak değişken

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed += digits[i]; // ters sırayla ekle
        }

        return reversed.equals(String.valueOf(number)); // karşılaştır
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int total = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        return number == total;
    }


    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        char[] array = String.valueOf(number).toCharArray();
        String text = "";
        for (char c : array) {
            switch (c) {
                case '0':
                    text += "Zero ";
                    break;
                case '1':
                    text += "One ";
                    break;
                case '2':
                    text += "Two ";
                    break;
                case '3':
                    text += "Three ";
                    break;
                case '4':
                    text += "Four ";
                    break;
                case '5':
                    text += "Five ";
                    break;
                case '6':
                    text += "Six ";
                    break;
                case '7':
                    text += "Seven ";
                    break;
                case '8':
                    text += "Eight ";
                    break;
                case '9':
                    text += "Nine ";
                    break;
            }
        }
        return text.trim();
    }
}
