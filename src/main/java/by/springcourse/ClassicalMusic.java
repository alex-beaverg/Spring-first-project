package by.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Alexey Bobrykov
 */
@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
