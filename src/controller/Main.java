/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author DuyDL2
 */
public class Main {

    MainFrame frame;
    public Main() {
        frame = new MainFrame();
        MyTimeCount timeCount = new MyTimeCount();
        timeCount.start();
        new Thread(frame).start();
    }

    public static void main(String[] args) {
        new Main();
        String filepath = "D:\\Netbeans\\My Game\\PuzzleGame\\Music\\musicpokemon.wav";
        Music musicObject = new Music();
        musicObject.startMusic(filepath);
    }

    class MyTimeCount extends Thread {

        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (frame.isPause()) {
                    if (frame.isResume()) {
                        frame.time--;
                    }
                } else {
                    frame.time--;
                }
            }
        }
    }
}