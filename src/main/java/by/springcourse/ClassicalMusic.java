package by.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alexey Bobrykov
 */
public class ClassicalMusic implements Music{
    private final List<String> songList = new ArrayList<>(Arrays.asList("Hungarian Rhapsody",
            "The Four Seasons", "Flight of the Bumblebee"));

    @PostConstruct
    public void doMyInit() {
        System.out.println("Classical music initialisation");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Classical music destruction");
    }

    @Override
    public List<String> getSong() {
        return songList;
    }
}
