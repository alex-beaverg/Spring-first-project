package by.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Alexey Bobrykov
 */
public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
