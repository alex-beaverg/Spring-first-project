package by.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexey Bobrykov
 */
public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public void doMyInit() {
        System.out.println("[LOG INFO]: Music player initialisation method");
    }

    public void doMyDestroy() {
        System.out.println("[LOG INFO]: Music player destruction method");
    }

    // Inversion of Control:
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
