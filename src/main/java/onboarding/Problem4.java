package onboarding;

public class Problem4 {
    static final int VALUE_UPPER_A = 65;
    static final int VALUE_UPPER_Z = 90;
    static final int VALUE_LOWER_A = 97;
    static final int VALUE_LOWER_Z = 122;
    public static String solution(String word) {
        try{
            checkInput(word);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return "";
        }
        String answer = makePassword(word);
        return answer;
    }
    private static void checkInput(String word) throws IllegalArgumentException{
        if(word.length()<1 || word.length()>1000){
            throw new IllegalArgumentException("1이상 1000이하의 문자열을 입력해주새요");
        }
    }
    public static String makePassword(String word){
        String converedWord ="";
        for(int i=0; i<word.length();i++){
            if(Character.isAlphabetic(word.charAt(i))){
                converedWord += convert(word.charAt(i));
            }else{
                converedWord += word.charAt(i);
            }
        }
        return converedWord;
    }
    public static String convert(char word){
        if(word>=VALUE_UPPER_A && word <= VALUE_UPPER_Z){
            int scale = word-65;
            return String.valueOf(Character.toLowerCase((char)90-scale));
        }{
            int scale = word-97;
            return String.valueOf(Character.toUpperCase((char)122-scale));
        }
    }
}
