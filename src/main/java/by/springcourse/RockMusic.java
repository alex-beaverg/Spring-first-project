package by.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Alexey Bobrykov
 */
@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "November Rain";
    }
}
