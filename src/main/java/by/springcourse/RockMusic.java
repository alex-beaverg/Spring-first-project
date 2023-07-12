package by.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Alexey Bobrykov
 */
@Component
public class RockMusic implements Music{
    private List<String> songList = new ArrayList<>(Arrays.asList("November Rain",
            "Sweet Home Alabama", "Another Brick in the Wall"));

    @Override
    public List<String> getSong() {
        return songList;
    }
}
