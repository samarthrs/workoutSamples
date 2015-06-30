import java.util.*;

/**
 * Created by Ssavanu on 6/29/2015.
 */

public class myStreams {

    public void demo1(){
        List<String> myList = Arrays.asList("a1", "a3", "a2", "b1", "c3", "c1", "d2", "d1");
        System.out.println(myList.stream().count());
        System.out.println(myList.stream().hashCode());
        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
    }

    public void demo2(Integer... books){

        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        for (Integer book : books)
        {
            if (myMap.containsKey(book))
                myMap.put(book, myMap.get(book)+1);

            else
                myMap.put(book, 1);
        }

        System.out.print("Values in the Map are : " + myMap.values() + "\n");
        System.out.println("Size of the Map is : " + myMap.size());

        Integer minVal = 0;

        for (Integer minus1Copy : books)
        {
            minVal = Collections.min(myMap.values());
            if (minVal > 0)
                myMap.put(minus1Copy, myMap.get(minus1Copy)-1);
        }

        System.out.println("New Values are : " + myMap.values());
        System.out.println("New Size is : " + myMap.size());

        Integer maxValueInMap = Collections.max(myMap.values());
        System.out.println("Maximum Value in the Map is : " + maxValueInMap);

        for(Map.Entry<Integer, Integer> entry : myMap.entrySet())
        {
            if(entry.getValue() == maxValueInMap)
                System.out.println("Key is: " + entry.getKey() + " And its Value is: " + maxValueInMap);
        }

        Integer minValueInMap = Collections.min(myMap.values());
        System.out.println("Minimum value in the Map is : " + minValueInMap);

        Integer count = 0;


        for (Map.Entry<Integer, Integer> entry : myMap.entrySet())
        {
            if (entry.getValue() == minValueInMap) {
                count++;
                System.out.println(("Key is : " + entry.getKey() + " And its Value is : " + minValueInMap));
            }
        }

        System.out.println("Size of the Minimum Values Mappings is : " + count);

    }


    public static void main(String[] args)
    {
        new myStreams().demo1();
        new myStreams().demo2(1, 2, 1, 2, 3, 4, 4, 1, 3, 1);
    }
}
