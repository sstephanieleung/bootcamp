import java.time.LocalDate;

public class DemoLocalDate {
    public static void main(String[] args) {
        String date = "1980-13-32"; // Not effective!!!

        LocalDate date2 = LocalDate.of(1990,12,3);
        System.out.println(date2.toString());
        
        LocalDate date3 = LocalDate.of(1999,10,2);
        if(date3.isAfter(date2)){
            System.out.println("date3 > date2");
        } else if(date3.isEqual(date2)){
            System.out.println("date3 is equal to date 2");
        } else{
            System.out.println("date3 < date2");
        }

        System.out.println(date3.isLeapYear()); //false
        System.out.println(LocalDate.of(1990,1,1).isLeapYear()); //false
        System.out.println(date3.getMonthValue()); //10
        System.out.println(date3.getMonth().toString()); //OCTOBER
        System.out.println(date3.getDayOfWeek().toString()); //SATURDAY
       
        
    }
}
