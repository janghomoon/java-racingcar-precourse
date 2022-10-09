package racingcar.controller;

import java.util.List;
import racingcar.view.InputView;

public class RacingCarController {

  public void run() {
    List<String> carNames = setCarNames();
    Integer gameCount = setGameCount();
    //setGame
  }

  private List<String> setCarNames() {
    return InputView.getCarNames();
  }

  private Integer setGameCount() {
    return InputView.getGameCount();
  }

}