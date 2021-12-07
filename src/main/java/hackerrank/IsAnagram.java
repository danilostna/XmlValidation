package main.java.hackerrank;

public class IsAnagram {
    public static void main(String[] args) {
        boolean isAnagram = isAnagram("daniloo", "olInAdo");
        System.out.println( (isAnagram) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length())
            return false;

        char[] wordA = new char[a.length()];
        char[] wordB = new char[b.length()];
        for (int i = 0; i < a.length(); i++) {
            wordA[i] = (a.charAt(i));
            wordB[i] = (b.charAt(i));
        }

        wordA = sort(wordA);
        wordB = sort(wordB);

        return String.valueOf(wordA).equals(String.valueOf(wordB));
    }

    static char[] sort(char[] word) {
        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++){
                if(word[i] > word[j]){
                    char x = word[i];
                    word[i] = word[j];
                    word[j] = x;
                }
            }
        }

        return word;
    }
}
