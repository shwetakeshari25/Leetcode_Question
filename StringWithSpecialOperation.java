public class StringWithSpecialOperation {
    public String processStr(String s) {
     StringBuilder ch= new  StringBuilder();
     for(int i=0;i<s.length();i++){
        char curr=s.charAt(i);
        if(curr>='a' && curr<='z'){
            ch.append(curr);
        }else if(curr=='*'){
            if(ch.length()>0){
                ch.deleteCharAt(ch.length()-1);
            }
        }else if(curr=='#'){
            ch.append(ch.toString());
        }
        else if(curr=='%'){
            ch.reverse();
        }
     }
     return ch.toString();  
    }
public static void main(String[] args) {
StringWithSpecialOperation sol=new StringWithSpecialOperation();
String s="a#b%*";
String ans=sol.processStr(s);
System.out.println(ans);   
}
}   

