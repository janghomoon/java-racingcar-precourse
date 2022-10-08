package racingcar.util;

import org.junit.platform.commons.util.StringUtils;

public class ValidationUtil {

  private static final Integer MAX_LENGTH = 5;
  public static boolean isMaxLength(String input) throws IllegalArgumentException {
    if (input.length() > MAX_LENGTH) {
      return true;
    }
    return false;
  }

  public static boolean isNull(String input) throws IllegalArgumentException {
    if(StringUtils.isBlank(input)) {
      return true;
    }
    return false;
  }
}
