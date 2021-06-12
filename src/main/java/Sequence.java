public class Sequence {

    public Boolean checkAnagram(String firstString, String secondString) {
        char[] firstCharMap = firstString.toCharArray();
        StringBuilder secondStringBuilder = new StringBuilder(secondString);
        for (Character ch : firstCharMap){
            int index = secondStringBuilder.indexOf(""+ch);
            if(index != -1){
                secondStringBuilder.deleteCharAt(index);
            }else{
                return false;
            }
        }
        return secondStringBuilder.length()==0?true:false;
    }

    public boolean checkRotation(String input, String rotation){
        if(input.length() != rotation.length()){
            return false;
        }
        String concat = input+input;
        if(concat.indexOf(rotation)!=-1){
            return true;
        }
        return false;
    }

    public boolean checkPalindrome(String palindrome) {
        if(palindrome.isEmpty()){
            return false;
        }
        for(int i =0; i < palindrome.length()/2; i++){
            if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
