package com.variables;

/**
 * @author Pedro
 */
public class Variables {
  private double studentGrades[]; // Array of student grades
  private double average; // Average of student grades

  public static void main(String[] args) {
    double studentGrades[] = { 10, 9, 8, 7 };
    Variables variables = new Variables(studentGrades);
    double average = variables.calculateGrade();
    System.out.printf("The average grade is: %.2f\n", average);
  }
  
  public Variables(double studentGrades[]) {
    this.studentGrades = studentGrades;
  }

 public double calculateGrade(){
    double sum = 0;

    for (int i = 0; i < this.studentGrades.length; i++) {
      sum += studentGrades[i];
    }

    this.average = sum / studentGrades.length;
    return average;
 }
}
