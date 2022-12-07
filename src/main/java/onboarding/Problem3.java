package onboarding;

public class Problem3 {
    public static int solution(int number) {
        try{
            inputCheck(number);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return -1;
        }
        int answer = clapCalculate(number);
        return answer;
    }
    private static void inputCheck(int number) throws IllegalArgumentException{
        if(number<1 || number >10_000){
            throw new IllegalArgumentException("1이상 10,000이하 숫자를 입력해주세요");
        }
    }
    public static int clapCalculate(int number){
        int answer = 0;
        for(int i=1; i<=number ;i++){
            for(int k=0; k<String.valueOf(i).length() ; k++){
                if(String.valueOf(i).charAt(k)=='3' || String.valueOf(i).charAt(k)=='6' ||
                        String.valueOf(i).charAt(k)=='9')
                    answer++;
            }
        }
        return answer;
    }
}
