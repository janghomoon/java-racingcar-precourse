package racingcar.domain;

import java.util.List;

public class Race {

  private List<Car> cars;
  private Integer round;

  public Race(List<Car> cars, Integer round) {
    this.cars = cars;
    this.round = round;
  }

  public List<Car> getCars() {
    return this.cars;
  }

  public Integer getRound() {
    return this.round;
  }

  public void addRound() {
    this.round++;
  }

}
