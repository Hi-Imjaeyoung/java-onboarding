package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        try{
            inputCheck(cryptogram);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return "ERROR";
        }
        String answer = "answer";
        return answer;
    }
    private static void inputCheck(String crytogram) throws IllegalArgumentException {
        if(crytogram.length()==0 || crytogram.length()>1000){
            throw new IllegalArgumentException("1에서 1000자리 사이의 문자를 입력해주세요,");
        }
        if(crytogram.replaceAll("[^a-z]","").length() != crytogram.length()){
            throw new IllegalArgumentException("알파벳 소문자만 입력해주세요.");
        }
    }
    public static String findPair(){
        return "";
    }
    private static void findOtherPair(){

    }
}
