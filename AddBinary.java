class AddBinary{
    public String addBinary(String a, String b) {
    int i=a.length()-1;
    int j=b.length()-1; 
    int carry=0;
    String ans="";
    StringBuilder result= new StringBuilder();
    while(i>=0 ||j>=0||carry==1){
        int sum= carry;
        if(i>=0){
            sum=sum+(a.charAt(i)-'0');
            i--;
        }
        if(j>=0){
            sum=sum+(b.charAt(j)-'0');
            j--;
        }
        ans=(sum%2)+ans;
        carry=sum/2;
    }  
    return ans;  
    }
    public static void main(String args[]){
    AddBinary obj=new AddBinary();
    System.out.print(obj.addBinary("11","1"));   
    }
}