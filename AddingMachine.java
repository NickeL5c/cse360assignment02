/**
 *  This program was made to test my Git proficiency, as well as basic functions in Java.
 *  AddingMachine adds and subtracts integers from a variable, keeping
 *  track of the total. Upon request, a print can be conducted.
 *
 *  @author Nicholas Lloyd
 *  @version 1.0
 *  date: 10/5/2020
 */
package cse360assignment02;

public class AddingMachine {
  private int total;
  private StringBuffer myFormula = new StringBuffer("0");
  
  public AddingMachine () {
    total = 0;
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {     // adds value to total
      total += value;
      myFormula.append(" + " + value);
  }

  public void subtract (int value) {        // subtracts value from total
      total -= value;
      myFormula.append(" - " + value);
  }

  public String toString () {       // returns string of operations performed
    return myFormula.toString();
  }

  public void clear() {     // clears operation memory
      System.gc();
  }

  public static void main(String[] args){       // main() to test functions using professor's inputs
      AddingMachine tester = new AddingMachine();
      tester.add(4);
      tester.subtract(2);
      tester.add(5);
      System.out.println(tester.toString());
      System.out.println("Total: " + tester.getTotal());
  }
}