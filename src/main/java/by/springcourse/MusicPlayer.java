package by.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Alexey Bobrykov
 */
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private MetalMusic metalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") ClassicalMusic classicalMusic,
                       @Qualifier("rockMusic") RockMusic rockMusic,
                       @Qualifier("metalMusic") MetalMusic metalMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.metalMusic = metalMusic;
    }

    public String playMusic(Genres genres) {
        if (genres == Genres.METAL) {
            return "Playing: " + metalMusic.getSong().get(new Random().nextInt(3));
        } else if (genres == Genres.ROCK) {
            return "Playing: " + rockMusic.getSong().get(new Random().nextInt(3));
        } else if (genres == Genres.CLASSICAL) {
            return "Playing: " + classicalMusic.getSong().get(new Random().nextInt(3));
        } else {
            return "Genre not found!";
        }
    }
}
