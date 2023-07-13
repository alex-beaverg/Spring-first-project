package by.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

/**
 * @author Alexey Bobrykov
 */
public class Computer {
    private final int id;
    private final MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Computer with ID = " + this.id + " initialisation");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Computer with ID = " + this.id + " destruction");
    }

    @Override
    public String toString() {
        int number = new Random().nextInt(3);
        return "\nComputer ID = " + id + ". " + musicPlayer.playMusic(Genres.values()[number]) +
                " (" + Genres.values()[number].name() + ")\n";
    }
}
