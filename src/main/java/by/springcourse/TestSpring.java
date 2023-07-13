package by.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alexey Bobrykov
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        MetalMusic metalMusic = context.getBean("metalMusic", MetalMusic.class);


//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        context.close();
    }
}
