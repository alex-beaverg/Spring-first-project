package by.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alexey Bobrykov
 */
public class MetalMusic implements Music{
    private final List<String> songList = new ArrayList<>(Arrays.asList("Master of Puppets", "Battery", "Blackened"));

    @PostConstruct
    public void doMyInit() {
        System.out.println("Metal music initialisation");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Metal music destruction");
    }

    @Override
    public List<String> getSong() {
        return songList;
    }
}
