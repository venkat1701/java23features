package io.github.venkat1701.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.StructuredTaskScope;

public class StructuredConExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try(var scope = new StructuredTaskScope.ShutdownOnSuccess<String>()) {
            Callable<String> task1 = () -> fetchWeather();
            Callable<String> task2 = () -> fetchWeather2();
            scope.fork(task1);
            scope.fork(task2);

            String result = scope.join().result();
            System.out.println(result);
        }
    }

    public static String fetchWeather() throws InterruptedException{
        Thread.sleep(1000);
        return "Weather is Sunny";
    }

    public static String fetchWeather2() throws InterruptedException {
        Thread.sleep(2000);
        return "Weather is Cloudy";
    }
}
