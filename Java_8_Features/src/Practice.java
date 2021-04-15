import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        
        String str = "1213";
        boolean isExp = false;
        boolean isCons = true;
        List<Integer> intList = new ArrayList<>();
        intList.add(null);
        intList.add(null);
        Queue<Integer> q = new PriorityQueue<>();
        Set<Integer> s = new HashSet<>();

        Vector<Integer> iS = new Vector<>();
        iS.add(5);
        iS.add(5);

        LinkedList<Integer> link = new LinkedList<>();
        link.add(7);
        link.add(5);
        link.add(5);
        System.out.println(link.indexOf(5));
        System.out.println(iS.get(1));

        Stack<Integer> ss = new Stack<>();
        ss.push(5);
        ss.push(6);

        Set<Integer> intSet = new HashSet<>();
        intSet.add(5);
        intSet.add(7);
        
        intSet.add(9);
        intSet.add(11);

        Iterator it = intSet.iterator();
        System.out.println("Iterator");
        while(it.hasNext()){
            System.out.print(it.next());
        }

        Predicate<Integer> p = i->i%2==0;
        List<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(10);
        Function<Integer,Integer> f = (i)->{return i*2;};
        Consumer<Integer> c = i->System.out.print(i);
        List<Integer> collect = li.stream().map(f).collect(Collectors.toList());
        System.out.println("hellohello");
        System.out.println(collect.stream().map(f));
        collect.stream().forEach(c);
        collect.stream().max((o1,o2)->o1>o2?o1:o2);
        //Collections.sort(list);

        for(int i=1;i<str.length();i++){

            int windownSize = i;
            int windownItr;
            isCons = true;
            intList.clear();
            for(int j=0;j<str.length();){
                StringBuilder valStr = new StringBuilder();
                windownItr = 0;
                while(j<str.length() && windownItr<windownSize){
                    valStr.append(str.charAt(j++));
                    windownItr++;
                }
                try{
                    intList.stream().forEach(System.out::println);
                    
                    int value = Integer.parseInt(valStr.toString());
                    System.out.println(value);
                    //System.out.println(intList.get(j-1));
                    if(intList.size()>0)
                        if(null != intList.get(j-2) && intList.get(j-2)+1==value){
                            intList.add(value);
                        } else if(j<str.length() && null != intList.get(j-2) &&
                                Integer.parseInt(valStr.append(str.charAt(j)).toString())==intList.get(j-2)+1){
                                    windownSize++;
                                    intList.add(Integer.parseInt(valStr.append(str.charAt(j++)).toString()));
                        } else{
                            //Exit condition to break this window size check
                            isCons = false;
                            break;
                        }
                    else 
                        intList.add(value);
                    
                } catch (NumberFormatException e){
                    isExp = true; 
                    break;
                } catch (IndexOutOfBoundsException e){
                    isExp = true;
                    break;
                }
            }

            System.out.println("Values in Array");
            intList.stream().forEach(m->System.out.print(m+ " "));

            if(isExp)
                break;

            if(isCons)
                break;
        }

        if(isExp)
            System.out.println("Exception occured input is not in the right format or not Consecutive");
        else if(isCons) { 
            System.out.println("Consecutive");
            intList.stream().forEach(System.out::println);
        }
    }
    
}
