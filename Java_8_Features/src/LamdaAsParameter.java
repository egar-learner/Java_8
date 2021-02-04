import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
    int eno;
    String name;

    public Employee(int eno, String name){
        this.eno = eno;
        this.name = name;
    }

    public String toString(){
        return eno+":"+name;
    }
}

class LamdaAsParameter {

    public static void main(String[] args){
        Employee e = new Employee(123124, "EmpName");
        //Without the implementation of toString method this will return the object reference in the memory
        System.out.println(e.toString());


        ArrayList<Employee> l = new ArrayList<>();
        l.add(new Employee(1232, "First"));
        l.add(new Employee(3454, "Third"));
        l.add(new Employee(5342, "Fifth"));
        l.add(new Employee(2323, "Second"));
        l.add(new Employee(4232, "Fourth"));

        System.out.println(l);

        Collections.sort(l, (o1,o2)->o1.eno<o2.eno?-1:o1.eno>o2.eno?1:0);
        
        System.out.println("After sorting by eno");
        System.out.println(l);

        //This is for using the default compareTo method which sorts in the natural alphabetical order
        Collections.sort(l, (o1,o2)->o1.name.compareTo(o2.name));

        System.out.println("After sorting by name");
        System.out.println(l);
    }
    
}