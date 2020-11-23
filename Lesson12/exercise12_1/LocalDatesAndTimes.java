/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12.exercise12_1;

/**
 *
 * @author FRIEDRICH
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.*;  // Months
import static java.time.DayOfWeek.*; // Days of the week
import static java.time.temporal.ChronoUnit.*;  // DAYS, HOURS, etc
import java.time.temporal.TemporalAdjusters;

public class LocalDatesAndTimes {

  public static void main(String[] args) {

    LocalDate abeBorn = LocalDate.of(1809, FEBRUARY, 12);
    LocalDate abeDies = LocalDate.of(1855, APRIL, 15);
    System.out.println("Abe was " + abeBorn.until(abeDies, YEARS) + " when he died.");
    System.out.println("Abe lived for " + abeBorn.until(abeDies, DAYS) + " days.");
    System.out.println("");

    
    LocalDate bennedict = LocalDate.of(1976, JULY, 19);
    System.out.println("Bennedict was born in a leap year: " + bennedict.isLeapYear());
    System.out.println("Days in the year he was born: " + bennedict.lengthOfYear());
    LocalDate now = LocalDate.now();
    System.out.println("Bennedict is " + bennedict.until(now, DECADES) + " decades old.");
    System.out.println("It was a " + bennedict.plusYears(21).getDayOfWeek() + " on his 21st birthday.");
    System.out.println("");

    LocalTime depart = LocalTime.of(13, 45);
    LocalTime arrive = LocalTime.of(19, 25);
    System.out.println("Planned Travel time:  " + depart.until(arrive, MINUTES) + " minutes");
    System.out.println("Delayed arrival time: " + arrive.plusHours(1).plusMinutes(19));
    System.out.println("");

   
    LocalDateTime leaveBoston = LocalDateTime.of(2014, MARCH, 24, 21, 15);
    LocalDateTime arriveMiami = leaveBoston.plusHours(4).plusMinutes(15);
    System.out.println("The flight arrives in Miami: " + arriveMiami);
    System.out.println("The delayed arrival time is: " + arriveMiami.plusHours(4).plusMinutes(27));
    System.out.println("");

    int excludeWeeks = 5;
    LocalDate schoolStarts = LocalDate.of(2014, SEPTEMBER, 1).with(TemporalAdjusters.firstInMonth(TUESDAY)).with(TemporalAdjusters.next(TUESDAY));
    LocalDate endOfFirstWeek = schoolStarts.with(TemporalAdjusters.next(FRIDAY));
    long firstWeekDays = schoolStarts.until(endOfFirstWeek, DAYS) + 1;
    System.out.println("School starts: " + schoolStarts);
    LocalDate schoolEnds = LocalDate.of(2015, JUNE, 25);
    System.out.println("School ends:   " + schoolEnds);
    long lastWeeksDays = 0;
    if (schoolEnds.getDayOfWeek() != MONDAY) {
      LocalDate lastWeekStart = schoolEnds.with(TemporalAdjusters.previous(MONDAY));
      lastWeeksDays = lastWeekStart.until(schoolEnds, DAYS) + 1;
      excludeWeeks++;
    }
    long days = ((schoolStarts.until(schoolEnds, WEEKS) - excludeWeeks) * 5); 
    days = days + firstWeekDays + lastWeeksDays;
    System.out.println("Number of school days: " + days);
    System.out.println("");

    LocalTime meetingTime = LocalTime.of(13, 30);
    LocalDate meetingDate = LocalDate.now().with(TemporalAdjusters.nextOrSame(TUESDAY));
    LocalDateTime meeting = LocalDateTime.of(meetingDate, meetingTime);
    System.out.println("The meeting time is: " + meeting);
    System.out.println("");

  }

}
