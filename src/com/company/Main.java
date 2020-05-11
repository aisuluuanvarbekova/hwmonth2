package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            Runner runner = new Runner(i, 1);
            runner.start();
            try {
                runner.join();

            } catch (InterruptedException p) {
                System.out.println(p.getMessage());

            }

        }
        for (int i = 4; i >=1; i--) {
            Runner runner = new Runner(i, -1);
            runner.start();
            try {
                runner.join();

            } catch (InterruptedException p) {

            }
        }
    }
}



