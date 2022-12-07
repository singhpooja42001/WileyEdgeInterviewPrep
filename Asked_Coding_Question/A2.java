import java.util.*;

//sort elements of string based arraylist
public class A2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("pooja singh");
        list.add("rajat"); 
        list.add("beena"); 
        list.add("golu"); 
        list.add("raju"); 
        list.sort(null);
        Collections.sort(list); //we sort in this way when we have only one type of data,go into its inner implementaion how collections.sort works, if we hahve different type of data we go for either comparable oro comparator.
        for(String l:list)
        {
            System.out.println(l);
        }
    }

}
