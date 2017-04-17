
import java.util.*;
import java.util.HashMap;

/**
 * Created by Kamal Kant on 14-04-2017.
 */
public class HashMapEx {
    HashMap<String,EmpDetials> hm = new HashMap();

    void getData(){
        EmpDetials empDetials = new EmpDetials();
        empDetials.setEmpId("emp12");
        empDetials.setEmpName("abc");
        empDetials.setEmpSalary(10000);

        EmpDetials empDetials2 = new EmpDetials();
        empDetials2.setEmpId("emp13");
        empDetials2.setEmpName("xyx");
        empDetials2.setEmpSalary(20000);

        //storing
        hm.put(empDetials.getEmpId(),empDetials);
        hm.put(empDetials2.getEmpId(),empDetials2);

    }

    void update(){
        //update
        EmpDetials empDetialsupdate = new EmpDetials();
        empDetialsupdate.setEmpId("emp13");
        empDetialsupdate.setEmpName("xyx");
        empDetialsupdate.setEmpSalary(50000);

        hm.put(empDetialsupdate.getEmpId(),empDetialsupdate);
    }

    void disp(){
        //traverse
        Iterator it = hm.keySet().iterator();
        while(it.hasNext()){
            EmpDetials e = hm.get(it.next());
            System.out.println(e.getEmpId());
            System.out.println(e.getEmpName());
            System.out.println(e.getEmpSalary());
            System.out.println("----------");
        }
    }


    void remove(String empid){
        //delete
        hm.remove(empid);
    }

    public static void main(String[] args) {


        HashMapEx hashMapEx = new HashMapEx();
        hashMapEx.getData();
        hashMapEx.disp();

        System.out.println("Updated ::::");
        System.out.println("==================");
        hashMapEx.update();

        hashMapEx.disp();

        hashMapEx.remove("emp12");
        System.out.println("After Remove ::");
        System.out.println("==================");

        hashMapEx.disp();

    }
}

class EmpDetials{
    private String EmpId;
    private String EmpName;
    private int EmpSalary;

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(int empSalary) {
        EmpSalary = empSalary;
    }

    @Override
    public String toString() {
        return "EmpDetials{" +
                "EmpId='" + EmpId + '\'' +
                ", EmpName='" + EmpName + '\'' +
                ", EmpSalary=" + EmpSalary +
                '}';
    }
}
