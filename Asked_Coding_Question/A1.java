//Arraylist and its implementation
class Arraylist{
    static int i=0;
    Object arr[]=new Object[10];
    //add an element in an arraylist.
    void add(Object obj)
    {
        arr[++i]=obj;
        // System.out.println(obj.getClass());
        // System.out.println(obj.hashCode());
    }
    //delete an element from arraylist.
    void remove(int index)
    {
        for (int i = index; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        i--;
    }

    //get the element from the index
    Object get(int index)
    {
        return arr[index];
    }
    
    //print an element.
    void print()
    {
        for (Object object : arr) {
            System.out.println(object);
        }
    }
}
class A1
{
    public static void main(String[] args) {
        Arraylist arrayList=new Arraylist();
        System.out.println("length of array: "+Arraylist.i);
        System.out.println("inserting element in the arraylist");
        arrayList.add(new Integer(12));
        arrayList.add(new Float(12.0f));
        arrayList.add(new String("pooja"));
        arrayList.add(new Boolean("true"));
        System.out.println("length of array: "+Arraylist.i);
        System.out.println("deleting element from the arraylist");
        arrayList.remove(2);
        System.out.println("length of array: "+Arraylist.i);
        arrayList.print();
    }
}