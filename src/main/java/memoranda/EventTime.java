package main.java.memoranda;

import main.java.memoranda.date.CalendarDate;

//TASK 2-1 SMELL WITHIN A CLASS
public class EventTime {
  public CalendarDate date;
  public int hh;
  public int mm;
  public String text;

  public EventTime(CalendarDate date, int hh, int mm, String text) {
    this.date = date;
    this.hh = hh;
    this.mm = mm;
    this.text = text;
  }
}