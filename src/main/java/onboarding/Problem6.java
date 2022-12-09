package onboarding;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        try{
            for(List<String> form: forms){
                checkInput(form);
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
        List<String> answer = List.of("answer");
        return answer;
    }
    public static void checkInput(List<String> form) throws IllegalArgumentException{
        String email = form.get(0);
        String nickName = form.get(1);
        if(!email.contains("@email.com")){
            throw new IllegalArgumentException("이메일 형식을 입력해주세요");
        }
        if(email.length()<11 || email.length()>=20){
            throw new IllegalArgumentException("이메일은 11자 이상 20자 미만입니다");
        }
        if(nickName.replaceAll("[^가-힣]","").length()!=nickName.length()){
            throw new IllegalArgumentException("닉네임은 한글만 가능합니다");
        }
        if(nickName.length()==0 || nickName.length()>=20){
            throw new IllegalArgumentException("1자 이상 20자 미만의 닉네임을 입력해주세요");
        }
    }

    public static List<String> makeToken(String nickname){
        List<String> tokens = new LinkedList<>();
        if(nickname.length()<=2){
            tokens.add(nickname);
            return tokens;
        }
        for(int i=0;i<nickname.length()-1;i++){
            tokens.add(nickname.substring(i,i+2));
        }
        return tokens;
    }

    public static void sortEmail(Set<String> emails){

    }

}

