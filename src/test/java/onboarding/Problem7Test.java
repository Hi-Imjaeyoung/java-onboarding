package onboarding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class Problem7Test {
    @DisplayName("해쉬 맵 테스트")
    @Test
    void HASHMAP_TEST(){
        HashMap<String,Integer> map = new HashMap<>();
        String[] tokens = {"A","B","C","D","A","A","B"};
        for(String token : tokens){
            map.put(token,map.getOrDefault(token,0)+10);
        }
        System.out.println(map.toString());
        assertThat(30).isEqualTo(map.get("A"));
    }
}