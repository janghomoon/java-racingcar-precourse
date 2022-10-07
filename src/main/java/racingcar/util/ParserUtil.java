package racingcar.util;

import java.util.Arrays;
import java.util.List;

public class ParserUtil {

  public static List<String> StringToList(String input) {
    String[] carNames = input.split(",");
    return Arrays.asList(carNames);
  }
}
