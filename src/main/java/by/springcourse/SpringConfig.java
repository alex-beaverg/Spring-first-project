package by.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alexey Bobrykov
 */
@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public MetalMusic metalMusic() {
        return new MetalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public List<Music> genresList() {
        return new ArrayList<>(Arrays.asList(metalMusic(), rockMusic(), classicalMusic()));
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(genresList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
