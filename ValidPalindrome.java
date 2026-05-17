class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str += ch;
            }
        }
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String s = "race a car";
        ValidPalindrome obj = new ValidPalindrome();
        System.out.println(obj.isPalindrome(s));
    }
}