class Solution {
    public String reverseVowels(String s) {
        StringBuffer sb = new StringBuffer();
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) == -1) {
                continue;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}