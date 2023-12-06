public class Demo2 {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6));
    }

    public static int sum(Integer...integers){
        int sum = 0;
        for(Integer i: integers){
            sum+=i;
        }
        return sum;
    }
}
