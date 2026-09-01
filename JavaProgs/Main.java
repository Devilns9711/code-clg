public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2 = new Employee(12345,"Asahneey gupta","No where","Nobody","guptajiworksnothing@company.com",1.75);
        Employee e3=e2;
        //System.out.println(e2.returnData());
        // System.out.println(e3.returnData());
        e1.getData();
    }
    
}
