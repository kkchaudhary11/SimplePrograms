import java.util.*;

class Employee implements Comparable<Employee>{
    int id;
    String name,position,address;
    int salary;
    public Employee(int id, String name, String position, String address, int salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.address = address;
        this.salary = salary;
    }
    public int compareTo(Employee e) {
        if(id>e.id){
            return 1;
        }else if(id<e.id){
            return -1;
        }else{
            return 0;
        }
    }
}

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Employee> set=new TreeSet<Employee>();

        Employee b1=new Employee(121,"abc","manager","delhi",60000);
        Employee b2=new Employee(233,"xyx","technical head","noida",50000);
        Employee b3=new Employee(101,"pqr","employee","delhi",40000);

        set.add(b1);
        set.add(b2);
        set.add(b3);

        //Traversing TreeSet
        for(Employee b:set){
            System.out.println(b.id+" "+b.name+" "+b.position+" "+b.address+" "+b.salary);
        }
    }
}