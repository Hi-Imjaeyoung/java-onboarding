package onboarding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SimulationTest {
    @DisplayName("replaceAll 메소드 테스트")
    @Test
    void replaceAll_Test(){
        String tmp = "asasdac";
        assertThat(tmp.replaceAll("[^a-z]","")).isEqualTo(tmp);
        tmp = "123abc";
        assertThat(tmp.replaceAll("[^a-z]","")).isEqualTo("abc");
    }
    @DisplayName("입력값 오류 확인")
    @Test
    void input_check(){
        Problem2 p2 = new Problem2();
        assertThat(p2.solution("abs")).isEqualTo("answer");
        assertThat(p2.solution("1abs")).isEqualTo("ERROR");
        assertThat(p2.solution("")).isEqualTo("ERROR");
    }

}