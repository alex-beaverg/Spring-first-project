package by.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexey Bobrykov
 */
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private MetalMusic metalMusic;
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

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, MetalMusic metalMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.metalMusic = metalMusic;
    }

    //    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    //    @Autowired
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

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
