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

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        System.out.println();

        MusicPlayer musicPlayerWithListBean = context.getBean("musicPlayerWithListBean", MusicPlayer.class);
        musicPlayerWithListBean.playMusicList();
        System.out.println(musicPlayerWithListBean.getName());
        System.out.println(musicPlayerWithListBean.getVolume());

        context.close();
    }
}
