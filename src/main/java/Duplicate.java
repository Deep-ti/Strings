import java.util.HashSet;

public class Duplicate {
    public void printAllDuplicate(String word){
        char[] charMap = word.toCharArray();
        HashSet<Character> uniqueChars = new HashSet<>();
        for(char ch : charMap){
            if(ch != ' ') {
                if (!uniqueChars.add(ch)) {
                    System.out.print(ch + " ");
                }
            }
        }
    }

    public void printFirstNonDuplicateChar(String word){
        char[] charMap = word.toCharArray();
        HashSet<Character> uniqueChars = new HashSet<>();
        for(char ch : charMap){
            if(ch != ' ') {
                if (!uniqueChars.add(ch)) {
                    uniqueChars.remove(ch);
                }
            }
        }
        if(!uniqueChars.isEmpty()){
            for (Character ch: charMap) {
                if(uniqueChars.contains(ch)) {
                    System.out.println("First Non Duplicate character = " + ch);
                    break;
                }
            }
        }else{
            System.out.println("No unique characters");
        }

    }
}
