package easy;

public class Solution157 {
    public boolean isUnique(String str) {
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
