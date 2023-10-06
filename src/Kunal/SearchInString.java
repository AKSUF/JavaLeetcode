package Kunal;

public class SearchInString {
    public static void main(String[] args) {
        String name="Abu";
        char target='u';
        String search2= String.valueOf(search(name,target));
        System.out.println(search(name,target));
    }
    static  boolean search(String name,char target){
if(name.length()==0){
    return  false;
}
for(int i=0;i<name.length();i++){
    if(target==name.charAt(i)){
        return  true;
    }
}
        return false;
    }
}
