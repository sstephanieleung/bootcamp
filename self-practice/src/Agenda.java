import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Agenda {

    private String name;

    private Event[] events;

    public Agenda() {
        this.name = "";
        this.events = new Event[0];
    }

    public Agenda(String name) {
        this.name = name;
        this.events = new Event[0];
    }

    public boolean addEvent(Event event) {
        this.events = Arrays.copyOf(this.events, this.events.length + 1);
        this.events[this.events.length - 1] = event;
        return true;
    }

    public boolean addEvent(String title, int year, int month, int day, int hour, int minute) {
        this.events = Arrays.copyOf(this.events, this.events.length + 1);
        this.events[this.events.length - 1] = new Event(title, LocalDate.of(year, month, day),
                LocalTime.of(hour, minute, 0));
        return true;
    }

    public boolean removeEvent(int lookUpId) {
        int pointer = -1;
        for (int i = 0; i < this.events.length; i++) {
            System.out.println("idx = " + i + " " + (this.events[i].getId() == lookUpId));
            if (this.events[i].getId() == lookUpId) {
                pointer = i;
                break;
            }
        }
        if (pointer == -1) {
            return false;
        }
        Event[] newArr = new Event[this.events.length - 1];
        int idx = 0;
        for (int i = 0; i < this.events.length; i++) {
            if (i != pointer) {
                newArr[idx++] = this.events[i];
            }
        }
        this.events = newArr;
        return true;
    }

    public String[] getAll() {
        String[] arr = new String[this.events.length];
        for (int i = 0; i < this.events.length; i++) {
            arr[i] = this.events[i].getDetail();
        }
        return arr;
    }

    public String lookUp(String s) {
        String result = "";
        for (Event element : this.events) {
            if (element.getTitle().toLowerCase().contains(s.trim().toLowerCase())) {
                result = result.concat(element.getDetail()).concat("\n");
            }
        }
        return result;
    }

    public String lookUp(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        String result = "";
        for (Event element : this.events) {
            if (date.isEqual(element.getStartDate())) {
                result = result.concat(element.getDetail()).concat("\n");
            }
        }
        return result;
    }

    public String lookUp(int year, int month) {;
        String result = "";
        for (Event element : this.events) {
            if (year == element.getStartDate().getYear() && month == element.getStartDate().getMonthValue()) {
                result = result.concat(element.getDetail()).concat("\n");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Agenda a1 = new Agenda("Vincent");
        Event eventLunch = Event.valueOf("X'mas Lunch Buffet", LocalDate.of(2023, 12, 11), LocalDate.of(2023, 12, 11),
                LocalTime.of(13, 00, 00), LocalTime.of(14, 30, 00));
        Event eventLunch2 = Event.valueOf("Team Lunch", LocalDate.of(2023, 11, 11), LocalDate.of(2023, 12, 11),
                LocalTime.of(11, 00, 00), LocalTime.of(14, 30, 00));
        Event eventLunch3 = Event.valueOf("Farewell Lunch", LocalDate.of(2023, 10, 11), LocalDate.of(2023, 12, 11),
                LocalTime.of(10, 00, 00), LocalTime.of(14, 30, 00));
        a1.addEvent(eventLunch);
        a1.addEvent(eventLunch2);
        a1.addEvent(eventLunch3);
        a1.addEvent("Mid-term Exam", 2023, 12, 27, 13, 00);
        a1.addEvent("Mid-term Exam", 2023, 12, 27, 13, 00);
        a1.addEvent("Mid-term Exam", 2023, 12, 27, 13, 00);
        // System.out.println(a1.addEvent(eventLunch));
        // System.out.println(a1.addEvent(eventLunch2));
        // System.out.println(a1.addEvent(eventLunch3));
        //System.out.println(a1.removeEvent(2));
        String lookupKeyword = "Lunch";
        System.out.println(Arrays.toString(a1.getAll()));
        System.out.println("Looking for " + lookupKeyword + ":");
        System.out.println(a1.lookUp(lookupKeyword));
        System.out.println(a1.lookUp(2023, 12));

    }
}
