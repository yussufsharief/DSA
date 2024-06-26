package com.streams.wipro;

public class RomanToNumber {
    // Mapping of Roman symbols to their values
    private int value(char r) {
        switch (r) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToDecimal(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));
                if (s1 >= s2) {
                    res += s1;
                } else {
                    res += s2 - s1;
                    i++; // Skip the next symbol
                }
            } else {
                res += s1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RomanToNumber ob = new RomanToNumber();
        String str = "CMIV"; // Example Roman numeral
        System.out.println("Integer form of Roman Numeral " + str + " is " + ob.romanToDecimal(str));
    }
}