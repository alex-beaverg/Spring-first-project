package by.springcourse;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

/**
 * @author Alexey Bobrykov
 */
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private final List<Music> genres;

    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println(this.name + " with volume " + this.volume + " initialisation");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println(this.name + " with volume " + this.volume + " destruction");
    }

    public String playMusic(Genres genres) {
        int randSong = new Random().nextInt(3);
        if (genres == Genres.METAL) {
            return this.name + " with volume " + this.volume + " plays: " + this.genres.get(0).getSong().get(randSong);
        } else if (genres == Genres.ROCK) {
            return this.name + " with volume " + this.volume + " plays: " + this.genres.get(1).getSong().get(randSong);
        } else if (genres == Genres.CLASSICAL) {
            return this.name + " with volume " + this.volume + " plays: " + this.genres.get(2).getSong().get(randSong);
        } else {
            return "Genre not found!";
        }
    }
}
