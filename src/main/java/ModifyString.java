public class ModifyString {
    public static void reverseSentence(String sentence) {
        String[] words = sentence.split("\\s");
        StringBuilder reverse = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--) {
            reverse.append(words[i]);
            reverse.append(" ");
        }
        System.out.println(reverse);
    }

    public String useRecursionReverse(String word) {
        if(word.length() == 1){
            return word;
        }
        return useRecursionReverse(word.substring(1))+word.charAt(0);
    }

    public void useRecursionPermutation(String string){
        for(int i = 0; i < string.length(); i++){
            System.out.println(string.charAt(i)+string.substring(0,i)+string.substring(i+1));
        }
    }
}
