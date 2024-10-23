package racingcar;

public class Car {
    String name;

    public Car(String name){
        if(name.length() >= 6){
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다 " + name);
        }
        if(name.isBlank()){
            throw new IllegalArgumentException("잘못된 입력입니다");
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }

}