class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        // Create an array to track if each letter has been seen
        boolean[] seen = new boolean[26];
        
        // Convert the input string to lowercase for case insensitivity
        s = s.toLowerCase();
        
        for (char c : s.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                // If the character is a letter, mark it as seen
                seen[c - 'a'] = true;
            }
        }
        
        // Check if all 26 letters have been seen
        for (boolean letterSeen : seen) {
            if (!letterSeen) {
                return false;
            }
        }
        
        return true;
    }
}
