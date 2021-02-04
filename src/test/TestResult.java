package test;

import domain.Exercise;
import java.util.Arrays;

public class TestResult {

    public static void main(String[] args) {
        final int length;
        length = 15;
        final Exercise numberArray = new Exercise(length);
        final int[] array = numberArray.symmetricArray();
        System.out.println(Arrays.toString(array));
    }
}
