package aspectJInXml;

public class CustomerBoImpl implements CustomerBo {
    @Override
    public void addCustomer() {
        System.out.println("addCustomer() is running");
        System.out.println("***************************");
    }

    @Override
    public String addCustomerReturnValue() {
        System.out.println("addCustomerReturnValue() is running");
        System.out.println("***************************");
        return "abc";
    }

    @Override
    public void addCustomerThrowException() throws Exception {
        System.out.println("addCustomerThrowException() is running");
        System.out.println("***************************");
        throw new Exception();
    }

    @Override
    public void addCustomerAround() {
        System.out.println("addCustomerAround() is running");
        System.out.println("***************************");
    }
}
