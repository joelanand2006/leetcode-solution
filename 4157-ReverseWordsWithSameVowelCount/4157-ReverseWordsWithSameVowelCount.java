// Last updated: 2/4/2026, 8:19:58 PM
class Solution {
    public String reverseWords(String s) {
    String parivontel = s; 

        String[] words = parivontel.split(" ");
        int target = countVowels(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (countVowels(words[i]) == target) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }

    private int countVowels(String w) {
        int c = 0;
        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') c++;
        }
        return c;
    }
}