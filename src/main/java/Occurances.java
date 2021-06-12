public class Occurances {
    public int[] countVowelsAndConsonants(String string) {
        char[] letter = string.toCharArray();
        int noOfVowel = 0;
        int noOfConsonent = 0;
        int[] result = new int[2];
        for(char c : letter){
            switch (c){
                case 'a' :
                case 'e' :
                case 'i':
                case 'o':
                case 'u':
                    noOfVowel++;
                    break;
                default:
                    noOfConsonent++;
            }
        }
        result[0] = noOfVowel;
        result[1] = noOfConsonent;
        return result;
    }

    public int countChar(String string, char ch) {
        char[] letters = string.toCharArray();
        int count = 0;
        for (char l: letters
             ) {
            if(l == ch){
                count++;
            }
        }
        return count;
    }
}
