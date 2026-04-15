package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);


    public static List<String> readCarNames(){
        String input = scanner.nextLine();
        return Arrays.asList(input.split(",",-1));
    }

    public static int readAttemptCount(){
        String input = scanner.nextLine();
        try{
            int attempt = Integer.parseInt(input);
            validatePostiveAttempt(attempt);
            return attempt;
        }
        catch(Exception e){
            throw new IllegalArgumentException(
            );
        }

    }

    private static void validatePostiveAttempt(int attempt){
        if(attempt<=0){
            throw new IllegalArgumentException();
        }
    }
}
