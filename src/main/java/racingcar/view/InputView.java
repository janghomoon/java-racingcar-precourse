package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import racingcar.code.Message;
import racingcar.util.ParserUtil;
import racingcar.util.ValidationUtil;

public class InputView {

  public List<String> getInputValue() {
    System.out.println(Message.FIRST_MESSAGE.getMsg());
    String inputs = Console.readLine();
    List<String> carNames = new ArrayList<>();
    try {
      ValidationUtil.isNull(inputs);
      carNames = ParserUtil.StringToList(inputs);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      getInputValue();
    }
    return carNames;
  }
}
