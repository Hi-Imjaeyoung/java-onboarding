package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        try{
            inputCheck(cryptogram);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return "ERROR";
        }
        String answer = findPair(cryptogram);
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
    public static String findPair(String crytogram){
        char[] crytogramChars = crytogram.toCharArray();
        for(int i=0; i<crytogram.length()-1; i++){
            if(crytogramChars[i]==crytogramChars[i+1] && crytogramChars[i] !='-'){
                crytogramChars[i] ='-';
                crytogramChars[i+1] = '-';
                findOtherPair(crytogramChars, i);
            }
        }
        String answer = String.valueOf(crytogramChars);
        answer = answer.replaceAll("-","");
        return answer;
    }
    private static void findOtherPair(char[] crytogramChars, int i){
        int right = i+2;
        int left = i-1;
        while(right<crytogramChars.length && left>=0){
            if(crytogramChars[right]=='-'){
                right++;
                continue;
            }
            if(crytogramChars[left]=='-'){
                left--;
                continue;
            }
            if(crytogramChars[right]==crytogramChars[left]){
                crytogramChars[right] = '-';
                crytogramChars[left] = '-';
            }
            left--;
            right++;
        }
    }
}
