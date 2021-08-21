public class SwiggyCustomers {
    public static void main(String[] args){
        InheritSwiggy SecondObj = new InheritSwiggy(118021,"shaik Azeer",6302757469L,"Telangana,Khammam,nelakondapalli,chennaram");
        SecondObj.customerDetails();
        SecondObj.setCouponcode(97381);
        System.out.println("your coupon code: "+SecondObj.getCopencode());
        System.out.println("-------------------------------------------------------------------------------");
        InheritInheritSwiggy newObj = new InheritInheritSwiggy(118055,"Azeer",6302757469L,"Telangana,Khammam,nelakondapalli");
        newObj.customerDetails();
        newObj.setCouponcode(112233);
        System.out.println("your coupon code: "+newObj.getCopencode());
        newObj.detail_of( 4);
        newObj.detail_of(7,9);
    }
}
