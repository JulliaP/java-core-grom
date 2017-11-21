package lesson20.task1.exception;

import lesson20.BadRequestException;

public class Test {

    public static void main(String[] args) throws Exception {
        int a = 10;

        if (a > 5) {
            throw new BadRequestException("error");
        }
    }

}
