/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.JButton;

public class Music {

    void startMusic(String musicLocation)
    {
        try{
            File musicPath = new File(musicLocation);
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                FloatControl gainControl = 
                (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl.setValue(-12.0f);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                Thread.sleep(200);
            }else
            {
                System.out.println("Không tìm thấy file!");
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    void soundMusic(String musicLocation)
    {
        try{
            File musicPath = new File(musicLocation);
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                FloatControl gainControl = 
                (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl.setValue(-12.0f);
                clip.start();
            }else
            {
                System.out.println("Không tìm thấy file!");
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
