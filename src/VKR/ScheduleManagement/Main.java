package VKR.ScheduleManagement;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EventSchedule Event = new EventSchedule();

        try {
            Event.SetNameEvent("Физика");
            Event.SetPlaceEvent("203");
            Event.SetTypeEvent("Лекция");
            Event.SetTimeEventBegin(2, 4);
            Event.SetTimeEventBegin(8640000l);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("123456");


        System.out.println(Event);
    }
}

//TODO: привязать github
