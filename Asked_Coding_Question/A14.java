import java.util.*;

//implementing comparable and comparator
public class A14 {
    public static void main(String[] args) {
        List<A13> list=new ArrayList<A13>();
        list.add(new A13(90, "momdu", 100000.0f));
        list.add(new A13(2,"kishan singh" , 10000.0f));
        list.add(new A13(1,"pooja singh",5000.0f));
        
        System.out.println("before sorting the list: "+list);

        Collections.sort(list);

        System.out.println("After sorting based on custId: "+list);
    }
}
