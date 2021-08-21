public class Swiggy {
    public int Customer_id;
    public String Customer_name;
    public long Contact_no;
    public String Address_of;
    public Swiggy(int Customer_id,String Customer_name,long Contact_no,String Address_of){
        this.Customer_id = Customer_id;
        this.Customer_name = Customer_name;
        this.Contact_no = Contact_no;
        this.Address_of = Address_of;
    }
    public void customerDetails(){
        System.out.println("Customer id: "+ Customer_id);
        System.out.println("Customer name: "+Customer_name);
        System.out.println("Contact number: "+ Contact_no);
        System.out.println("Customer Address: "+ Address_of);
    }
}

class InheritSwiggy extends Swiggy{
    private int couponcode;
    public InheritSwiggy(int CustId,String CustName,long ConNo,String address){
        super(CustId, CustName,ConNo,address);
        this.couponcode = 970123;
    }
    public void setCouponcode(int copencode){
        this.couponcode = copencode;
    }
    public int getCopencode(){
        return couponcode;
    }
}

class InheritInheritSwiggy extends InheritSwiggy{
    public InheritInheritSwiggy(int CustId, String CustName, long ConNo, String address) {
        super(CustId, CustName, ConNo, address);
    }
    public void detail_of(int a) {
        System.out.println("no of details: " + a);
    }
    public void detail_of(int a,int b){
        System.out.println("my lucky numbers are: " + a + ","+ b);
    }
}

