package me.Fanatixteam.TG.commands;

import java.util.Comparator;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class ValueComperator implements Comparator {
  
 Map map;
 
 public  ValueComperator(Map map) {
  this.map = map;
 }
 
 @SuppressWarnings("unchecked")
 public int compare(Object keyA, Object keyB) {
  Comparable valueA = (Comparable) map.get(keyA);
  Comparable valueB = (Comparable) map.get(keyB);
  return valueB.compareTo(valueA);
 }
}