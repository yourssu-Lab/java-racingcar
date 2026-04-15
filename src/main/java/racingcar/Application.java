package racingcar;

public class Application {
    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}

class Car {
    private int position;
    private String name;
    Car(String name, int position) {
        this.position = 0;
        if (Validate(name)) {
            this.name = name;
        }
    }

    private boolean Validate(String name) {
        //밸리데이트 하는 코드
        if(name == null || name.length() == 0 || name.length() > 5){
            throw new IllegalArgumentException();
        }
        return true;
    }

    public String getName(){
        return name;
    }
    public int getPosition(){
        return position;
    }
    void tryMove(int act){
        if(act>=4){
            position += 1;
        }
    }
    public String getState(){
        return name+": "+"-".repeat(position);
    }
}
