package racingcar.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidationUtilTest {


  @DisplayName("자동차 이름 공백 체크 ")
  @ParameterizedTest
  @CsvSource({",false","carName,true"})
  void 자동차이름공백체크(String name, boolean result) {
    boolean isNull = ValidationUtil.isNull(name);
    assertThat(isNull).isEqualTo(result);
  }

  @DisplayName("자동차 이름 5자 이하")
  @ParameterizedTest
  @CsvSource({"t,true","tt,true","ttt,true","test,true","tests,true","testts,false"})
  void 자동차이름유효성검사(String name, boolean result) {
    boolean validResult = ValidationUtil.lengthCheck(name);
    assertThat(validResult).isEqualTo(result);
  }




}
