package by.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alexey Bobrykov
 */
@Component
public class MetalMusic implements Music{
    private List<String> songList = new ArrayList<>(Arrays.asList("Master of Puppets", "Battery", "Blackened"));

    @Override
    public List<String> getSong() {
        return songList;
    }
}
