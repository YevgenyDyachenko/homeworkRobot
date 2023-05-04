package com.ua.robot.lesson34;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return new Random().nextInt(50) + 1;
    }
}