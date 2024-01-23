import java.util.ArrayList;
import java.util.List;

public class Customer {

    List<Address> addresses;

    public Customer() {
        this.addresses = new ArrayList<>();
    }

    public void addAddr(String addrLine1, String addrLine2, District district) {
        addresses.add(new Address(addrLine1, addrLine2, district));
    }

    public List<Address> getAddr() {
        return this.addresses;
    }

    public class Address {

        private String line1;

        private String line2;

        private District district;

        private Address(String addrLine1, String addrLine2, District district) {
            this.line1 = addrLine1;
            this.line2 = addrLine2;
            this.district = district;
        }

        @Override
        public String toString() {
            return this.line1 + "\n"
                    + this.line2 + "\n"
                    + this.district.value() + ", " + this.district.region();
        }
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.addAddr("ABC Building", "123 Happy Road", District.KOWLOON_CITY);
        System.out.println(customer);

    }
}
