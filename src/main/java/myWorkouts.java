import java.util.Arrays;
import java.util.List;

public class myWorkouts {
    public void myMethod(){

        List<String> myList = Arrays.asList("a1", "a2", "b1", "b2", "c1", "c2");
        myList.stream().forEach(it -> System.out.println(it));



    }

}



