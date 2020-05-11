package com.company;

public class Runner extends Thread {

    private int player;
    private int direction;

    public Runner(int player, int direction) {
        this.player = player;
        this.direction = direction;

    }

    public synchronized void run() {

        if (player < 5 && direction == 1) {
            System.out.println(" бегун " + player + " берет палочку ");
            System.out.println(" бегун " + player + " бежит к бегуну  " + (player + 1));

        }
        if (player == 5) {
            System.out.println(" бегун " + player + " берет палочку ");
            System.out.println(" бегун " + player + " бегун бежит к финишу ");
            System.out.println(" бегун " + player + " бежит к бегуну  " + (player - 1));
        }

        if (player > 1 && direction == -1) {
            System.out.println(" бегун " + player + " берет палочку ");
            System.out.println(" бегун " + player + " бежит к бегуну  " + (player - 1));
        }

        if (player == 1 && direction == -1) {
            System.out.println(" бегун " + player + " Берет палочку ");
        }

    }
    }





