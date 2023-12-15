import java.time.LocalDate;
import java.time.LocalTime;

public class Event {

    private static int countNo = 1;

    private int eventID;
    
    private String title;

    private String location;

    private LocalDate startDate;

    private LocalDate endDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private int repeatCount;

    public Event(){

    }

    public Event(String title){

    }
    public Event(LocalDate startDate, LocalDate endDate){
        this.title = "";
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = LocalTime.of(00,00,00);
        this.endTime = LocalTime.of(23,59,59);
        this.eventID = countNo;
        countNo++;

    }

    public Event(String title, LocalDate startDate, LocalDate endDate){
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startTime = LocalTime.of(00,00,00);
        this.endTime = LocalTime.of(23,59,59);
        this.eventID = countNo;
        countNo++;
    }

    public Event(String title, LocalDate startDate, LocalTime startTime){
        this.title = title;
        this.startDate = startDate;
        this.endDate = startDate;
        this.startTime = startTime;
        this.endTime = startTime.plusHours(2);
        // this.startTime = LocalTime.of(00,00,00);
        // this.endTime = LocalTime.of(23,59,59);
        this.eventID = countNo;
        countNo++;
    }

    public Event(String title, LocalDate startDate, LocalDate endDate, LocalTime startTime, LocalTime endTime){
        this(title, startDate, endDate);
        this.startTime = startTime;
        this.endTime = endTime;
        
    }

    public static Event valueOf(String title, LocalDate startDate, LocalDate endDate, LocalTime starTime, LocalTime endTime){
        return new Event(title, startDate, endDate, starTime, endTime);
    }

    public boolean updateTitle (String s){
        this.title = s;
        return true;
    }
    public boolean updateDate (LocalDate startDate, LocalDate endDate){
        this.startDate = startDate;
        this.endDate = endDate;
        return true;
    }
    public boolean updateTime (LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
        return true;
    }
    public int getId(){
        return this.eventID;
    }
    public String getTitle(){
        return this.title;
    }

    public String getDetail(){
        return "Event No: "+ eventID +" | "+ this.title + " | Date: "+ this.startDate +" - "+ this.endDate + " | Time: "+this.startTime + " - "+ this.endTime;
    }

    public LocalDate getStartDate(){
        return this.startDate;
    }
}
