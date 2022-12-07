import java.util.Comparator;

//implement comparable and comparator.
public class A13 implements Comparable<A13>{
    int custId;
    String custName;
    Float custBill;


    public int getCustId() {
        return custId;
    }
    public String getCustName() {
        return custName;
    }
    public Float getCustBill() {
        return custBill;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public void setCustBill(Float custBill) {
        this.custBill = custBill;
    }


    
    public A13(int custId, String custName, Float custBill) {
        this.custId = custId;
        this.custName = custName;
        this.custBill = custBill;
    }


    @Override
    public String toString() {
        return "A13 [custId=" + custId + ", custName=" + custName + ", custBill=" + custBill + "]";
    }
    // @Override
    // public int compare(A13 o1, A13 o2) {
    //     // TODO Auto-generated method stub
    //     return o1.getCustId()-o2.getCustId();
    // }
    @Override
    public int compareTo(A13 o) {
        // TODO Auto-generated method stub
        return this.getCustId()-o.getCustId();
    }
    

}
