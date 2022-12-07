package onboarding;

public class Problem3 {
    public static int solution(int number) {
        try{
            inputCheck(number);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return -1;
        }
        int answer = 0;
        return answer;
    }
    private static void inputCheck(int number) throws IllegalArgumentException{
        if(number<1 || number >10_000){
            throw new IllegalArgumentException("1이상 10,000이하 숫자를 입력해주세요");
        }
    }
    public static int clapCalculate(int number){

    }
}
