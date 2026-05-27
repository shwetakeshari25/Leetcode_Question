public class CountSpecial_II {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for(char ch = 'a'; ch <= 'z'; ch++) {
            int lastSmall = -1;
            int firstCapital = -1;
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == ch) {
                    lastSmall = i;
                }
                if(word.charAt(i) == Character.toUpperCase(ch)
                        && firstCapital == -1) {
                    firstCapital = i;
                }
            }
            if(lastSmall != -1 &&
               firstCapital != -1 &&
               lastSmall < firstCapital) {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        CountSpecial_II obj = new CountSpecial_II();
        System.out.println(
        obj.numberOfSpecialChars("aaAbcBC")
        );
    }
}    

