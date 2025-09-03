package com.bridgelabz.oops.leveltwo;

public class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleantext = text.replaceAll("\\s", "").toLowerCase();
        String reverseText = new StringBuilder(cleantext).reverse().toString();
        return cleantext.equals(reverseText);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("A man a plan a canal Panama");
        checker1.displayResult();
        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        checker2.displayResult();
    }
}
