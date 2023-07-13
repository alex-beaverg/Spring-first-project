package by.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alexey Bobrykov
 */
public class RockMusic implements Music{
    private final List<String> songList = new ArrayList<>(Arrays.asList("November Rain",
            "Sweet Home Alabama", "Another Brick in the Wall"));

    @PostConstruct
    public void doMyInit() {
        System.out.println("Rock music initialisation");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Rock music destruction");
    }

    @Override
    public List<String> getSong() {
        return songList;
    }
}
