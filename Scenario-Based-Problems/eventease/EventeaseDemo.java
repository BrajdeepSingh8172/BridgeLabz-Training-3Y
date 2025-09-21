package eventease;

import java.util.*;

interface ISchedulable {
    void schedule(Date d);
    void reschedule(Date newDate);
    void cancel();
}

class Event {
    private final String eventId;
    protected String eventName;
    protected String location;
    protected Date date;
    protected List<String> attendees = new ArrayList<>();

    public Event(String eventId, String eventName) {
        this.eventId = eventId; this.eventName = eventName;
    }

    public String getId() { return eventId; }
}

class BirthdayEvent extends Event implements ISchedulable {
    public BirthdayEvent(String id, String name) { super(id,name); }
    @Override public void schedule(Date d) { this.date = d; System.out.println("Birthday scheduled on " + d); }
    @Override public void reschedule(Date newDate) { this.date = newDate; System.out.println("Rescheduled to " + newDate); }
    @Override public void cancel() { this.date = null; System.out.println("Birthday canceled"); }
}

class ConferenceEvent extends Event implements ISchedulable {
    public ConferenceEvent(String id, String name) { super(id,name); }
    @Override public void schedule(Date d) { this.date = d; System.out.println("Conference scheduled on " + d); }
    @Override public void reschedule(Date newDate) { this.date = newDate; System.out.println("Conference rescheduled to " + newDate); }
    @Override public void cancel() { this.date = null; System.out.println("Conference canceled"); }
}

public class EventEaseDemo {
    public static void main(String[] args) {
        BirthdayEvent b = new BirthdayEvent("E1","Riya Bday");
        b.schedule(new Date());
        b.reschedule(new Date(System.currentTimeMillis()+86400000L));
        b.cancel();
    }
}
