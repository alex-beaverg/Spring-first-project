package by.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Alexey Bobrykov
 */
@Component
public class MetalMusic implements Music{
    private MetalMusic() {}

    public static MetalMusic getMetalMusic() {
        return new MetalMusic();
    }

    public void doMyInit() {
        System.out.println("[LOG-INFO]: Metal music initialisation method");
    }

    public void doMyDestroy() {
        System.out.println("[LOG-INFO]: Metal music destruction method");
    }

    @Override
    public String getSong() {
        return "Master of Puppets";
    }
}
