/*
Author : Maria
Date : Sept 23 2025
*/

interface Media {
    void play();
    void stop();

   
    default void pause() {
        System.out.println("Media paused");
    }

    
    static void about() {
        System.out.println("This is a Media interface");
    }
}


interface AdvancedMedia extends Media {
    void nextTrack();
}

class MusicPlayer implements AdvancedMedia {

   
    public void play() {
        System.out.println("Playing music...");
    }


    public void stop() {
        System.out.println("Music stopped.");
    }

    
    public void nextTrack() {
        System.out.println("Skipping to next track...");
    }

    public void pause() {
        System.out.println("Music paused");
    }
}

public class Main {
    public static void main(String[] args) {
       
        MusicPlayer player = new MusicPlayer();

        
        player.play();
        player.pause();
        player.nextTrack();
        player.stop();

        
        Media.about();
    }
}
