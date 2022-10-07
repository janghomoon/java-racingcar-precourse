package racingcar.domain;

public class Car {
  private String name;
  private Integer distance;

  private final Integer POSSIBLE_MOVE = 3;

  public Car(String name, Integer distance) {
    this.name = name;
    this.distance = distance;
  }

  public String getName() {
    return this.name;
  }

  public Integer getDistance() {
    return this.distance;
  }

  public void isMove(Integer ranDomDistance) {
    if (ranDomDistance > POSSIBLE_MOVE) {
      addDistance();
    }
  }

  private void addDistance() {
   this.distance++;
  }
}
