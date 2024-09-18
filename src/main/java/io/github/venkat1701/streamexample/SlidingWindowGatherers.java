package io.github.venkat1701.streamexample;

import java.util.stream.Gatherers;
import java.util.stream.IntStream;

public class SlidingWindowGatherers {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(maxSumSubArray(arr, k));
    }

    public static int maxSumSubArray(int[] arr, int k) {
        return IntStream.of(arr)
                .boxed()
                .gather(Gatherers.windowSliding(k))
                .mapToInt(window -> window.stream().mapToInt(i -> i).sum())
                .max()
                .orElseThrow(()-> new IllegalArgumentException("Array Size is Small"));
    }
}
