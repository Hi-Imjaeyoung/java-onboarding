package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        try{
            checkInputNumbers(pobi);
            checkInputNumbers(crong);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return -1;
        }
        int answer = Integer.MAX_VALUE;

        return answer;
    }
    private static void checkInputNumbers(List<Integer> numbers) throws IllegalArgumentException{
        if(numbers.size() != 2){
            throw new IllegalArgumentException("2개의 숫자만 입력해주세요");
        }
        if(numbers.get(0)+1 != numbers.get(0)){
            throw new IllegalArgumentException("연속되는 두 자연수만 입력해주세요");
        }
        if(numbers.get(0)<0 || numbers.get(0)>399 || numbers.get(1)<1 || numbers.get(1)>400){
            throw new IllegalArgumentException("1과 400 사이의  두 자연수만 입력해주세요");
        }
    }
    private static void calculateMaxNumber(List<Integer> numbers){

    }
}