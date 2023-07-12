package by.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alexey Bobrykov
 */
@Component
public class ClassicalMusic implements Music{
    private List<String> songList = new ArrayList<>(Arrays.asList("Hungarian Rhapsody",
            "The Four Seasons", "Flight of the Bumblebee"));

    @Override
    public List<String> getSong() {
        return songList;
    }
}
