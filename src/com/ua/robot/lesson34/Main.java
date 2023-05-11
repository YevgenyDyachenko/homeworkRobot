package com.ua.robot.lesson34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Callable<Integer> callable = new RandomCallable();
            Future<Integer> future = executor.submit(callable);
            list.add(future);
        }

        for (Future<Integer> fut : list) {
            try {
                System.out.println(fut.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

    }
}
