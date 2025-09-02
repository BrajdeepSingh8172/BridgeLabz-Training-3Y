public class String_concept {

    public static String formatText(String input) {
        // Trim starting and ending spaces
        input = input.trim();

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;  // First letter should be capital

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Agar ye letter hai aur capital karna hai
            if (capitalizeNext && Character.isLetter(c)) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            }
            else {
                result.append(c);
            }

            // Agar punctuation (. ? !) mila
            if (c == '.' || c == '?' || c == '!') {
                capitalizeNext = true; // next letter capital hoga

                // Agar agla character space nahi hai to ek space add karo
                if (i + 1 < input.length() && input.charAt(i + 1) != ' ') {
                    result.append(' ');
                }
            }

            // Agar do spaces aa gaye to ek hi rakho
            if (result.length() >= 2) {
                if (result.charAt(result.length() - 1) == ' ' &&
                    result.charAt(result.length() - 2) == ' ') {
                    result.deleteCharAt(result.length() - 1); // extra space hatao
                }
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "   hello   world!this   is java.   how are you?i am fine.   ";
        String output = formatText(input);

        System.out.println("Original: " + input);
        System.out.println("Formatted: " + output);
    }
}
