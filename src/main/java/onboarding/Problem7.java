package onboarding;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
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
    public static HashMap<String,List<String>> calculateScoreAtFriends(List<List<String>> friends){
        HashMap<String,List<String>> friendship = new HashMap<>();
        for(List<String> friend : friends){
            if(friendship.containsKey(friend.get(0))){
                friendship.get(friend.get(0)).add(friend.get(1));
            }else{
                friendship.put(friend.get(0),new LinkedList<>());
                friendship.get(friend.get(0)).add(friend.get(1));
            }
            if(friendship.containsKey(friend.get(1))){
                friendship.get(friend.get(1)).add(friend.get(0));
            }else{
                friendship.put(friend.get(1),new LinkedList<>());
                friendship.get(friend.get(1)).add(friend.get(0));
            }
        }
        return friendship;
    }
    public static void calculateScoreAtVisitors(){

    }
    public static void sortRecommendFriends(){

    }
}
