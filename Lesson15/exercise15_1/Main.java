/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson15.exercise15_1;

/**
 *
 * @author FRIEDRICH
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService es = Executors.newCachedThreadPool();

        es.submit(new CountRunnable(20, "A"));
        es.submit(new CountRunnable(20, "B"));
        es.submit(new CountRunnable(20, "C"));

        es.shutdown();
    }
}
