package onboarding;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem6Test {
    @DisplayName("입력 예외 처리 테스트")
    @Test
    void input_check(){
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            Problem6.checkInput(List.of("abc@Bmail","재영"));
        });
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            Problem6.checkInput(List.of("asdsadasdasdasdasdasd@email.com","재영"));
        });
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            Problem6.checkInput(List.of("abcd@email.com","재영2"));
        });
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            Problem6.checkInput(List.of("abcd@email.com","jy"));
        });
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            Problem6.checkInput(List.of("abcd@email.com","나는야멋진재영이고요지금무척졸립니다요빨리자자"));
        });
    }
    @DisplayName("토큰 생성 테스트")
    @Test
    void MAKE_TOKEN(){
        assertThat(Problem6.makeToken("재영이")).isEqualTo(List.of("재영","영이"));
        assertThat(Problem6.makeToken("재영")).isEqualTo(List.of("재영"));
        assertThat(Problem6.makeToken("쿨재영이")).isEqualTo(List.of("쿨재","재영","영이"));
    }
    @DisplayName("정렬 테스트")
    @Test
    void SORT_TEST(){
        Set<String> set = new HashSet<>();
        set.add("하");
        set.add("파");
        set.add("카");
        set.add("가");
        System.out.println(set.toString());
        assertThat(Problem6.sortEmail(set)).containsExactly("가","카","파","하");
    }
}