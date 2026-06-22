public class MaxNumOfBalloons {
    public int maxNumberOfBalloons(String text) {
    int freq[]=new int[26];
    for(int i=0;i<text.length();i++){
        char ch=text.charAt(i);
        freq[ch-'a']++;
    } 
    return Math.min(
        Math.min(freq['b'-'a'],freq['a'-'a']) ,
        Math.min(Math.min(freq['l'-'a']/2,freq['o'-'a']/2),freq['n'-'a']));   
 
    }

    public static void main(String[] args) {
        MaxNumOfBalloons obj=new MaxNumOfBalloons();
        String text = "loonbalxballpoon";

        System.out.println(obj.maxNumberOfBalloons(text));
    }
}    

