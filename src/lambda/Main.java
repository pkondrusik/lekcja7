package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String [] args){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnabel");
            }
        };

        Runnable runnable1=new CustomRunnable();
        Runnable runnable2= () -> System.out.println("Run lambda");
        runnable.run();
        runnable1.run();
        runnable2.run();
      //  Predicate<String> predicate = s -> s.length() > 5;
        List<String> strings = Arrays.asList("test", "testownie", "acosjeszcze", "dupa");
        strings.stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));


    }
}
