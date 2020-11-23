/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4.exercise4_3;

/**
 *
 * @author FRIEDRICH
 */
public final class PeerSingleton {

  private static final String[] hostNames = new String[5];
  
  static{
   
    hostNames[0]="192.168.1.2";
    hostNames[1]="192.168.1.4";
    hostNames[2]="192.168.2.3";
    hostNames[3]="192.168.2.5";
    hostNames[4]="192.168.2.14";
  }
    
  private static final PeerSingleton instance = new PeerSingleton();
    
  private PeerSingleton(){ }
    
  public static PeerSingleton getInstance() {
    return instance;
  }   

  public String[] getHostNames() {
    return hostNames;
  }
}
