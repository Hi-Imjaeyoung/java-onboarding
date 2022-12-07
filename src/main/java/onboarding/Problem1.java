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
        int pobiValue = Math.max(calculateMaxNumber(pobi.get(0)),calculateMaxNumber(pobi.get(1)));
        int crongValue = Math.max(calculateMaxNumber(crong.get(0)),calculateMaxNumber(crong.get(1)));
        if(pobiValue>crongValue){
            return 1;
        }
        if(crongValue>pobiValue){
            return 2;
        }
        return 0;
    }
    private static void checkInputNumbers(List<Integer> numbers) throws IllegalArgumentException{
        if(numbers.size() != 2){
            throw new IllegalArgumentException("2개의 숫자만 입력해주세요");
        }
        if(numbers.get(0)+1 != numbers.get(1)){
            throw new IllegalArgumentException("연속되는 두 자연수만 입력해주세요");
        }
        if(numbers.get(0)<0 || numbers.get(0)>399 || numbers.get(1)<1 || numbers.get(1)>400){
            throw new IllegalArgumentException("1과 400 사이의  두 자연수만 입력해주세요");
        }
    }
    private static int calculateMaxNumber(int numericValue){
        String number = String.valueOf(numericValue);
        int plus=0 ,multiply =1;
        for(int i=0; i<number.length();i++) {
            plus += Character.getNumericValue(number.charAt(i));
            multiply *= Character.getNumericValue(number.charAt(i));
        }
        return Math.max(plus,multiply);
    }
}