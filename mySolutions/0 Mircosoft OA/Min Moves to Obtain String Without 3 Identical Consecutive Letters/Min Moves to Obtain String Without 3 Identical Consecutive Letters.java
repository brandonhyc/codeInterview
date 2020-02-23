// "static void main" must be defined in a public class.
public class Main {
    
    private int getSteps(String str) {
        int i = 1;
        int changes = 0;
        char[] chars = str.toCharArray();
        for (; i < str.length(); i++) {
            if (i <= str.length() - 1 && chars[i - 1] == chars[i]) {
                int count = 1;
                while (i <= str.length() - 1 && chars[i - 1] == chars[i]) {
                    count += 1;
                    i += 1;
                    if (count == 3) {
                        chars[i - 1] = chars[i - 1] == 'a' ? 'b' : 'a';
                        changes += 1;
                    }
                }
            }
        }
        return changes;
    }
    
    public static void main(String[] args) {
        System.out.println((new Main()).getSteps("baaabbaabbba"));
        System.out.println((new Main()).getSteps("baabab"));
    }
}

// "static void main" must be defined in a public class.
public class Main {
    
    private int getSteps(String str) {
        int changes = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int next = i + 1;
            while (next <= str.length() - 1 && str.charAt(next) == str.charAt(i)) {
                next += 1;
                if (next - i + 1 == 3) {
                    changes += 1;
                    break;
                }
            }
            i = next;
        }
        return changes;
    }
    
    public static void main(String[] args) {
        System.out.println((new Main()).getSteps("baaabbaabbba"));
        System.out.println((new Main()).getSteps("baabab"));
    }
}