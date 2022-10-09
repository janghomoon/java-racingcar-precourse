package racingcar.domain;

public class Car {
  private String name;
  private Integer distance;
  private String printMark;
  private final Integer POSSIBLE_MOVE = 3;

  public Car(String name, Integer distance, String printMark) {
    this.name = name;
    this.distance = distance;
    this.printMark = printMark;
  }

  public String getName() {
    return this.name;
  }

  public Integer getDistance() {
    return this.distance;
  }

  public String getResultMessage() {
    return String.format("%s : %s",this.name, this.printMark);
  }


  public void isMove(Integer ranDomDistance) {
    String mark = " ";
    if (ranDomDistance > POSSIBLE_MOVE) {
      addDistance();
      mark ="-";
    }
    addMark(mark);
  }
  //움직이면
  public void addMark(String mark) { this.printMark += mark;}

  private void addDistance() {
    this.distance++;
  }

}
