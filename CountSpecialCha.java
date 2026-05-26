public class CountSpecialCha {
    public int numberOfSpecialChars(String word) {
     int count=0;
     for(char ch='a';ch<='z';ch++){
        boolean small=false;
        boolean capital=false;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                small=true;
            }
            if(word.charAt(i)==Character.toUpperCase(ch)){
                capital=true;
            }
        }
        if(small && capital){
            count++;
        }
     } 
     return count;  
    }
    public static void main(String args[]){
       CountSpecialCha obj=new CountSpecialCha();
       System.out.println(obj.numberOfSpecialChars("aaaAbcBC"));
    }
}    

