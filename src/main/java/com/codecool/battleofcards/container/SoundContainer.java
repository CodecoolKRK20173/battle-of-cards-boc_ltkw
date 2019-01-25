package com.codecool.battleofcards.container;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundContainer {
    private Clip clip;

    private void loadSound(String sound) {
        try {
            FileInputStream inputStreamSound = new FileInputStream(sound);
            BufferedInputStream bufferedSound = new BufferedInputStream(inputStreamSound);

            clip = AudioSystem.getClip();
            AudioInputStream soundToPlay = AudioSystem.getAudioInputStream(bufferedSound);
            clip.open(soundToPlay);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (LineUnavailableException e) {
            e.printStackTrace();

        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void playBackgroundSound() {
        loadSound("src/main/resources/sounds/background.wav");
        clip.setFramePosition(0);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stopClip() {
        clip.stop();
    }

    public void playSound(String sound) {
        loadSound(sound);
        clip.setFramePosition(0);
        clip.start();
    }
}
