import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Collections are used to group objects of similar type as a single Entity
//STREAMS ARE USED TO PROCESS COLLECTION OBJECTS

public class StreamsFilter {

    public static void main(String[] args){

        /**List<Integer> chaos = valueIndex.entrySet().stream().map(m->
        {
            if(m.getKey()>m.getValue())
                return m.getKey()-m.getValue();
            else
                return 0;
        }).collect(Collectors.toList());
        
    int chaosVal = chaos.stream().mapToInt(
        m->{
            if(m.intValue()<3) 
                return m.intValue();
            else
                return -9999;
            }).sum();
    
    if(chaosVal > 0)
        System.out.println(chaosVal);
    else
        System.out.println("Too chaotic");**/



        /**
        int count = 0;
        int localCount = 0;
        for(int i=q.length;i>0;){
            int max = i--;
            for(int j=i;j>=0;j--){
                //System.out.println("localCount = "+localCount);
                //System.out.println("count = "+count);
                //System.out.println("q[j] = "+q[j] + " max = "+max);
                if(q[j]!=max){
                    count++;
                    localCount++;
                } else if(localCount>2){
                    break;
                } else if(q[j]==max && j != i) {
                    //Swapping to sort from end
                    int temp = q[j];
                    q[j] = q[i];
                    q[i] = temp;
                    break;
                } else {
                    break;
                }
            }  
            
            if(localCount>2){
                System.out.println("Too chaotic");
                break;
            } else {
                localCount = 0;
            }    
        }
        
        if(localCount<=2)
            System.out.println(count-1); */

        List<Integer> marks = new ArrayList<>();
        marks.add(5);
        marks.add(4);
        marks.add(7);
        marks.add(9);
        marks.add(10);

        System.out.println(marks);

        //li.stream().filter(predicate).collect(Collectors.toList());
        // Filter method takes a predicate as a argument, And is used to 
        // filter the data
        // need not return same number of object it takes
        Predicate<Integer> pred = i->i%2==0;
        List<Integer> integerCollection = marks.stream().filter(pred).collect(Collectors.toList());
        System.out.println(integerCollection);


        //marks.stream().map(mapperFunction).collect(Collectors.toList());
        // Map method is used to perform some function 
        // Perform some operation on data
        //returns same number of objects as it takes
        List<Integer> marksGrace = marks.stream().map(i->i+5).collect(Collectors.toList());

        System.out.println(marksGrace);

        //marks.stream().filter(i->i<5).count()
        // COUNT method is used to get the count of the objects in the list 
        long count = marks.stream().filter(i->i<5).count();

        System.out.println(count);


        //marks.stream().sorted().collect(Collectors.toList());
        // SORTED method is used for default sorting on the collection which is passed
        List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList);

        //marks.stream().sorted((l1,l2)->l1<l2?-1:l1>l2?1:0).collect(Collectors.toList())
        // We can change the implementation of the sorted method by providing a lambda function
        List<Integer> sortedListWithComparator = marks.stream().sorted((l1,l2)->l1<l2?-1:l1>l2?1:0).collect(Collectors.toList());

        System.out.println(sortedListWithComparator);

        List<String> names = new ArrayList<>();
        names.add("Aaa");
        names.add("aa");
        names.add("aaaaaaaa");
        names.add("aaaaa");
        names.add("e");

        Comparator<String> c = (s1,s2) -> s1.length()<s2.length()?-1:s1.length()>s2.length()?1:0;
        
        //names.stream().sorted(c).collect(Collectors.toList());
        // Instead of giving a the implementation of the compareTo function we can give a new comparator
        List<String> sortedByNameLength = names.stream().sorted(c).collect(Collectors.toList());

        System.out.println(sortedByNameLength);


        System.out.println(marks.stream().sorted().collect(Collectors.toList()).get(0));
        //To get the min and max value of the collection 
        System.out.println(marks.stream().min((l1,l2)->l1.compareTo(l2)).get());
        System.out.println(marks.stream().max((l1,l2)->l1.compareTo(l2)).get());

        System.out.println("--------------------abab----------------------------------------");
        //marks.stream().forEach(Consumer);
        //forEach always takes Consumer
        marks.stream().forEach(System.out::println);


        System.out.println("----------------------------------asdas--------------------------");
        Consumer<Integer> cons = i-> System.out.println(i*i);
        marks.stream().forEach(cons);

        System.out.println("------------------------------------------------------------");

        marks.stream().forEach(i-> {System.out.println(i*i+5);});

        //marks.stream().toArray(Object[]::new)
        //marks.stream().toArray(<Optional>)
        System.out.println("------------------------------------------------------------");

        Integer[] arrInt = marks.stream().toArray(Integer[]::new);
        System.out.println(arrInt);

        System.out.println("-----------------iyuli-------------------------------------------");
        Stream.of(arrInt).forEach(System.out::println);

        System.out.println("----------------------------etu--------------------------------");

        Stream s = Stream.of(9,99,999,9999);
        s.forEach(System.out::println);
    }
    
}
