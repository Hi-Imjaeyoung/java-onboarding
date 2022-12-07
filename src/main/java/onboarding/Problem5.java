package onboarding;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem5 {
    static final List<Integer> papers = List.of(50_000,10_000,5_000,1_000,500,100,50,10,1);
    public static List<Integer> solution(int money) {
        try {
            checkInput(money);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
        List<Integer> answer = calculate(money);
        return answer;
    }
    private static void checkInput(int input) throws IllegalArgumentException{
        if(input<1 || input >1_000_000){
            throw new IllegalArgumentException("1이상 1,000,000 숫자를 입력하세요");
        }
    }
    public static List<Integer> calculate(int money){
        List<Integer> answer = new LinkedList<>();
        for(int nowPaper : papers){
            answer.add(money/nowPaper);
            money = money % nowPaper;
        }
        return answer;
    }
}
