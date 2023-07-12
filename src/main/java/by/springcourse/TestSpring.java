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

        Music metalMusic = context.getBean("metalMusic", Music.class);
        Music rockMusic = context.getBean("rockMusic", Music.class);
        Music classicalMusic = context.getBean("classicalMusic", Music.class);

        MusicPlayer metalMusicPlayer = new MusicPlayer(metalMusic);
        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);

        metalMusicPlayer.playMusic();
        rockMusicPlayer.playMusic();
        classicalMusicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//        boolean comparison = musicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(musicPlayer);
//        System.out.println(secondMusicPlayer);
//        musicPlayer.setVolume(15);
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//
//        System.out.println();
//
//        MusicPlayer musicPlayerWithListBean = context.getBean("musicPlayerWithListBean", MusicPlayer.class);
//        musicPlayerWithListBean.playMusicList();
//        System.out.println(musicPlayerWithListBean.getName());
//        System.out.println(musicPlayerWithListBean.getVolume());

        context.close();
    }
}
