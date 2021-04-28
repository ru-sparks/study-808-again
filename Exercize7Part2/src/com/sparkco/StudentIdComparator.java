package com.sparkco;

import java.util.Comparator;
public class StudentIdComparator implements Comparator<Student>{

 public int compare(Student e1, Student e2){
	 return Integer.compare(e1.getId(), e2.getId());
 }
 
 public String toString(){
  return "StudentIdComparator";
 }
}
