package onboarding;

import java.util.Collections;
import java.util.List;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        try{

        }catch (IllegalArgumentException e){

        }
        List<String> answer = Collections.emptyList();
        return answer;
    }
    public static void checkInput(String id) throws IllegalArgumentException{
        if(id.length()==0 || id.length()>30){
            throw new IllegalArgumentException("1자 이상 30자 이하의 아이디를 입력해주세요.");
        }
        if(id.replaceAll("[^a-z]","").length() != id.length()){
            throw new IllegalArgumentException("알파벳 소문지로된 아이다만 입력해주셍요");
        }
    }
    public static void calculateScoreAtFriends(){

    }
    public static void calculateScoreAtVisitors(){

    }
    public static void sortRecommendFriends(){

    }
}
