
public class Phone<T> {

    private T regionCode;

    private T phoneNo;

    public Phone(T regionCode, T phoneNo) {
        this.regionCode = regionCode;
        this.phoneNo = phoneNo;
    }

    public String getNo() {
        return "+" + String.valueOf(this.regionCode) + " " + String.valueOf(this.phoneNo);
    }

    public static void main(String[] args) {
        Phone<Integer> p1 = new Phone(RegionCode.HKG.code(), 91938732);
        Phone<String> p2 = new Phone(String.valueOf(RegionCode.MACAU.code()), "6328732");

        System.out.println(p1.getNo());
        System.out.println(p2.getNo());
    }

}
