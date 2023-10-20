import java.util.HashMap;

class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX";
        int result = romanToInteger(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to integer " + result);
    }

    public static int romanToInteger(String s) {
        // Create a map to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);

            if (currentValue < previousValue) {
                result -= currentValue; // Subtract for cases like IV (4) or XC (90)
            } else {
                result += currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }
}

