package racingcar.view;

import java.util.List;
import racingcar.code.Message;

public class OutputView {

  public static void roundResult(List<String> roundResults) {
    System.out.println(Message.ROUND_END_MESSAGE.getMsg());
    for (String result : roundResults) {
      System.out.println(result);
    }
  }

  public static void winnerResult(String winner) {
    System.out.println(Message.WINNER_MESSAGE.getWinner(winner));
  }
}