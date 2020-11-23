/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12.exercise12_2;

/**
 *
 * @author FRIEDRICH
 */

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import static java.time.Month.*;

public class DepartArrive {

  public static void main(String[] args) {
    
    ZoneId SFO = ZoneId.of("America/Los_Angeles");
    ZoneId BOS = ZoneId.of("America/New_York");
    ZoneId BLR = ZoneId.of("Asia/Calcutta");

    LocalDateTime departure = LocalDateTime.of(2014, JUNE, 13, 22, 30);
    ZonedDateTime departSFO = ZonedDateTime.of(departure, SFO);
    System.out.println("Flight 123 departs SFO at:   " + departSFO);
    ZonedDateTime departTimeAtBOS = departSFO.toOffsetDateTime().atZoneSameInstant(BOS);
    System.out.println("Local time BOS at departure: " + departTimeAtBOS);
    System.out.println("Flight time: 5 hours 30 minutes");
    ZonedDateTime arriveBOS = departSFO.plusHours(5).plusMinutes(30).toOffsetDateTime().atZoneSameInstant(BOS);
    System.out.println("Flight 123 arrives BOS:      " + arriveBOS);
    ZonedDateTime arriveTimeAtSFO = arriveBOS.toOffsetDateTime().atZoneSameInstant(SFO);
    System.out.println("Local time SFO at arrival:   " + arriveTimeAtSFO);
    System.out.println("");

    departure = LocalDateTime.of(2014, JUNE, 28, 22, 30);
    departSFO = ZonedDateTime.of(departure, SFO);
    System.out.println("Flight 456 leaves SFO at:    " + departSFO);
    ZonedDateTime departTimeAtBLR = departSFO.toOffsetDateTime().atZoneSameInstant(BLR);
    System.out.println("Local time BLR at departure: " + departTimeAtBLR);
    System.out.println("Flight time: 22 hours");
    ZonedDateTime arriveBLR = departSFO.plusHours(22).toOffsetDateTime().atZoneSameInstant(BLR);
    System.out.println("Flight 456 arrives BLR:      " + arriveBLR);
    arriveTimeAtSFO = arriveBLR.toOffsetDateTime().atZoneSameInstant(SFO);
    System.out.println("Local time SFO at arrival:   " + arriveTimeAtSFO);
    System.out.println("");

    departure = LocalDateTime.of(2014, NOVEMBER, 1, 22, 30);
    departSFO = ZonedDateTime.of(departure, SFO);
    System.out.println("Flight 123 departs SFO at:   " + departSFO);
    departTimeAtBOS = departSFO.toOffsetDateTime().atZoneSameInstant(BOS);
    System.out.println("Local time BOS at departure: " + departTimeAtBOS);
    System.out.println("Flight time: 5 hours 30 minutes");
    arriveBOS = departSFO.plusHours(5).plusMinutes(30).toOffsetDateTime().atZoneSameInstant(BOS);
    System.out.println("Flight 123 arrives BOS:      " + arriveBOS);
    arriveTimeAtSFO = arriveBOS.toOffsetDateTime().atZoneSameInstant(SFO);
    System.out.println("Local time SFO at arrival:   " + arriveTimeAtSFO);
    System.out.println("");
  }

}

