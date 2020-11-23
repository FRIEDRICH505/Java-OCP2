/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6.exercise6_3;

/**
 *
 * @author FRIEDRICH
 */

public class AnalyzerTool {
  
  public void showResult(String[] strList, String searchStr, StringAnalyzer analyzer){
    for(String current:strList){
      if (analyzer.analyze(current, searchStr)){
        System.out.println("Match: " + current);
      }
    }
  }
}
