package main.java.memoranda;

import main.java.memoranda.date.CalendarDate;

// TASK 2-1 SMELL WITHIN A CLASS
public class RepeatableEvent {
  public int type;
  public CalendarDate startDate;
  public CalendarDate endDate;
  public int period;
  public int hh;
  public int mm;
  public String text;
  public boolean workDays;

  public RepeatableEvent(int type, CalendarDate startDate, CalendarDate endDate, int period, int hh,
      int mm, String text, boolean workDays) {
    this.type = type;
    this.startDate = startDate;
    this.endDate = endDate;
    this.period = period;
    this.hh = hh;
    this.mm = mm;
    this.text = text;
    this.workDays = workDays;
  }
}