package onboarding;

import java.util.List;
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
}