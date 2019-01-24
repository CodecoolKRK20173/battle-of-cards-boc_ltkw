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

    private void playSounds(String sound) {
        try {
            FileInputStream inputStreamSound = new FileInputStream(sound);
            BufferedInputStream bufferedSound = new BufferedInputStream(inputStreamSound);

            clip = AudioSystem.getClip();
            AudioInputStream soundToPlay = AudioSystem.getAudioInputStream(bufferedSound);
            clip.open(soundToPlay);
            clip.setFramePosition(0);
            clip.start();

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
    
    private void clipLoop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void playAutorsScreenMusic() {
        playSounds("src/main/resources/sounds/authors_screen.wav");
    }

    public void playBackgroundSound() {
        playSounds("src/main/resources/sounds/background.wav");
        clipLoop();
    }

    public void playWinSound() {
        playSounds("src/main/resources/sounds/victory.wav");
    }

    public void playGameOverSound() {
        playSounds("src/main/resources/sounds/game_over.wav");
    }

    public void playGoodBye() {
        playSounds("src/main/resources/sounds/game_quit.wav");
    }

    public void stopClip() {
        clip.stop();
    }

}
