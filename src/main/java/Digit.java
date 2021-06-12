public class Digit {
    public Boolean checkStringForOnlyDigit(String s) {
        try{
            Long.valueOf(s);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
