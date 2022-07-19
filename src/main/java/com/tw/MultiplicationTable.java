package com.tw;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTable {
    public String create(int start, int end) {
        if (isValid(start, end)){
            return generateTable(start, end);
        };
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return 1 <= number && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        return null;
    }

    public String generateLine(int start, int row) {
        return IntStream.rangeClosed(start,row)
                .mapToObj(i -> generateSingleExpression(i,row))
                .collect(Collectors.joining(" "));
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {

        return String.format("%d*%d=%d",multiplicand,multiplier,multiplicand*multiplier);
    }
}
